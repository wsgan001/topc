package topc.math;

import java.util.*;
import java.io.*;

// SRM 349 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6067&rd=10673
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm349
public class LastMarble {
  double[][][] memo;
  double rem;

  public double winningChance(int red, int blue, int removed) {
    rem = removed;
    memo = new double[red + 1][blue + 1][2];
    for (int i = 0; i < red + 1; i++) {
      for (int j = 0; j < blue + 1; j++) {
        Arrays.fill(memo[i][j], -1.0);
      }
    }
    return play(red, blue, false);
  }


  double play(int r, int b, boolean me) {
    if (r + b == rem) { return me ? 0 : 1; }
    if (memo[r][b][me ? 0 : 1] > -0.5) { return memo[r][b][me ? 0 : 1]; }

    double prob = 0.0;
    double res = 0.0;

    double n = r + b;
    double pr = r / n;
    double pb = 1.0 - pr;

    prob = 0.0;
    prob += (pr > 0) ? pr * (1.0 - play(r - 1, b, false)) : 0.0;
    prob += (pb > 0) ? pb * (1.0 - play(r, b - 1, !me))   : 0.0;
    res = Math.max(res, prob);

    double prr = 0.0, pbb = 0.0, prb = 0.0;
    if (n > rem + 1.0) {
      prr = pr * (Math.max(r - 1, 0) / (n - 1.0));
      pbb = pb * (Math.max(b - 1, 0) / (n - 1.0));
      prb = 1.0 - prr - pbb;

      prob = 0.0;
      prob += (prr > 0.0) ? prr * (1.0 - play(r - 2, b,     false)) : 0.0;
      prob += (pbb > 0.0) ? pbb * (1.0 - play(r,     b - 2, !me))   : 0.0;
      prob += (prb > 0.0) ? prb * (1.0 - play(r - 1, b - 1, false)) : 0.0;
      res = Math.max(res, prob);
    }

    double prrr = 0.0, pbbb = 0.0, prrb = 0.0, pbbr = 0.0;
    if (n > rem + 2.0) {
      prrr = prr * (Math.max(r - 2, 0) / (n - 2.0));
      pbbb = pbb * (Math.max(b - 2, 0) / (n - 2.0));
      prrb = prr * (Math.max(b, 0) / (n - 2.0)) + prb * (Math.max(r - 1, 0) / (n - 2.0));
      pbbr = pbb * (Math.max(r, 0) / (n - 2.0)) + prb * (Math.max(b - 1, 0) / (n - 2.0));

      prob = 0.0;
      prob += (prrr > 0.0) ? prrr * (1.0 - play(r - 3, b,     false))  : 0.0;
      prob += (pbbb > 0.0) ? pbbb * (1.0 - play(r,     b - 3, !me))    : 0.0;
      prob += (prrb > 0.0) ? prrb * (1.0 - play(r - 2, b - 1, false))  : 0.0;
      prob += (pbbr > 0.0) ? pbbr * (1.0 - play(r - 1, b - 2, false))  : 0.0;
      res = Math.max(res, prob);
    }

    memo[r][b][me ? 0 : 1] = res;
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
