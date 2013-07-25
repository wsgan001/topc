package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class LumberjackHackTest {
    LumberjackHack lumberjackhack = new LumberjackHack();

    @Test
    public void test1() {
        String[] map = new String[] {".+.", "||."};
        assertEquals(3, lumberjackhack.timeToShore(map));
    }

    @Test
    public void test2() {
        String[] map = new String[] {"..+", "||."};
        assertEquals(0, lumberjackhack.timeToShore(map));
    }

    @Test
    public void test3() {
        String[] map = new String[] {"....|||", "....|..", "...||..", "||.+...", "...|...", "...||||"};
        assertEquals(7, lumberjackhack.timeToShore(map));
    }


    @Test
    public void test4() {
        String[] map = new String[] {
            "||.|....",
            "........",
            ".|.+|..|",
            "...|....",
            "|..|.|.|"};
        assertEquals(-1, lumberjackhack.timeToShore(map));
    }


    @Test
    public void test5() {
        String[] map = new String[] { ".........|.|.|.|.|..||...||.|..|.||...|.|.|||...||",
            ".||.||...||..|||.....|.||||...|.|.|.|.|..|...|.|||",
            "||.|.|..||.||....|.....|.||.|||||.|.|.||.|||||.|..",
            "|.....|.|.||||.||..|.|..|..|.|||||.....||.|.||....",
            "..|..||...||.|.......|||+||.||||....||||.....|..||",
            "...||..||||.|......||..|.|||||.|.|||||.||..|||...|",
            "|||...|..|..|.|||.||.|..|...||.|||..|..||.|.||....",
            "|..|||||||||.||.....|..|.|.|||||...||...|.|.|||||.",
            ".|..||...|||............|.|..|||.||.|||.||..||.|||",
            ".|.|||...||..|..|...||.||..|..|||||.|.|...||..||.|",
            "||||.|||.|..||||..|..||...|..||.|.||||...|...|.|..",
            ".||..||...|.....|||.|||||..||......|.||.||.|..||..",
            "|.|||....|||||.|..|..|.|||..|.||.||.|.|.|.|..||...",
            ".||.||||||...||||||..||....|..||.|||..||...|.|||||",
            ".||||.|....|...|.||..||..|||.|||||....|...||.|.||.",
            ".|...|..||....||...|.||||.....||||.||.|||||||..|||",
            ".||||...|...|..||...|...|...|.|..|.|.|..|..|||.||.",
            ".|.|||..||||||||........|||||||||.|.|........|||||",
            ".....|...||.||...|||...||||..|||...||....||..||.||",
            "||...||..||.||...||...||||..|.|..|...|||..||..|||.",
            "|..||||.||..|...|....||||||...|||.|.|||||..|||...|",
            ".....|||..||.|||.....||..||||...|||||.||.|.||..|||",
            "|..|.||..|..||..||..|...|..|.||..||||..|...||..|..",
            "||.|..|.|||||...|...|.|..|||||...|.......|.||.||||",
            ".|.....|.|||||.....|||...|..|||||...|.||..||.|||.|",
            ".|...||....|||...|||.||.|.|......|........|.||||||",
            "..|.|.|.|||||..|||..|.........|...|.|.|...||.....|",
            ".|.|.|.|..|.|||||||||||.|.|||....|||||...|.||||.|.",
            "|.|||....|.||||..||......|..|||||.....||.|..||..|.",
            "||.||.|||.|......|..|.|...|..||.|||..||.....|.|..|",
            ".||||..|.|.||||.|||.||.||.....|....|....||...|..||",
            ".....|||...||.||.||....|.||..||....|....|||||.|..|",
            "|.|.|||||...|.||..|..|..|.|..|.|........||..|.|.||",
            "....|..|.|..|.||||||....||||.|.||||||.|.|.|.......",
            "||||....|..|...||..||||||||...|.|||||.|.|||.|...||",
            "|...|.|..|..|..|....|..||..|||....||..||..|..|..|.",
            "|||||....|.||.|..|.||..|||..|.|.|..||.|...|.|..||.",
            "..|.|||.|.||..|...|||.|..|||..||...||...||||.....|",
            "..||||.|.|.....|||..||||..|.||||..|..|||.....||.||",
            "|..|||||....|........|.||||.||..||||.|....|||||||.",
            ".|...||.|.||..|.|....|.||..|.|....|.|.||.||.||.|..",
            ".|..|..|.||||.||||....|||.....|.|...|.|...|...||..",
            "|..|||..|.||.|||..||.....|.|..|.|.|...|.....|.....",
            "||..||.|...|.||...|..|..||.|||.||.|.||...|....|||.",
            ".|....|.|||.|..|||..|.....|.||.||...|...||.......|",
            ".||..|||.|.|....|||...|..|.||.||.|.|...|||||.|.|.|",
            "|.|.||.||.|.|.||.|||.||....||.|||||.||.|.|||......",
            "|...|||...|.||||....|.||.||.|.........|..||.|..||.",
            ".|.....|.|.|....||.||...|||.|..||...||.|||.||.|.|.",
            "||.||.|||.|||..||......|......||..||||.|..||.||||."};
        assertEquals(63, lumberjackhack.timeToShore(map));
    }


    @Test
    public void test6() {
        String[] map = new String[] {".+."};
        assertEquals(3, lumberjackhack.timeToShore(map));
    }


    @Test
    public void test7() {
        String[] map = new String[] {"..+.."};
        assertEquals(-1, lumberjackhack.timeToShore(map));
    }
}
