package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 567 Division II Level Three - 1000
// dynamic programming, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12380&rd=15487
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+567
public class MountainsEasy {
    public static final int MOD = 1000000009;
    int mem[][] = null;

    public int countPlacements(String[] picture, int N) {
        int h = picture.length;
        int w = picture[0].length();
        char pix[][] = new char[h][w];

        for (char[] c : pix) {
            Arrays.fill(c, '.');
        }

        int forced = 0;
        int extra = 0;

        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (picture[j].charAt(i) != 'X') {
                    continue;
                }
                if (pix[j][i] == '.') {
                    forced++;
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y <= (h - j - 1 - Math.abs(x - i)); y++) {
                            pix[h - y - 1][x] = 'X';
                        }
                    }
                } else {
                    extra++;
                }
            }
        }

        mem = new int[51][51];
        for (int[] m : mem) {
            Arrays.fill(m, -1);
        }

        return f(extra, forced, N);
    }

    private int f(int extra, int forced, int N) {
        if (mem[forced][N] > -1) { return mem[forced][N]; }
        if (N == 0) { return forced == 0 ? 1 : 0; }

        int res = 0;
        int p = f(extra, forced, N - 1);

        res += (extra * (long)p) % MOD;

        if (forced > 0) {
            p = f(extra + 1, forced - 1, N - 1);
            res += (forced * (long)p) % MOD;
        }
        res %= MOD;

        mem[forced][N] = res;

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
