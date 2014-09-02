package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxConnection2Test {
  FoxConnection2 foxconnection2 = new FoxConnection2();

  @Test
  public void case1() {
    int[] A = { 1, 2, 3 };
    int[] B = { 2, 3, 4 };
    int k = 2;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case2() {
    int[] A = { 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5 };
    int k = 3;
    assertEquals(6, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case3() {
    int[] A = { 1, 2, 3, 4 };
    int[] B = { 2, 3, 4, 5 };
    int k = 3;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case4() {
    int[] A = { 1, 2, 2, 4, 4 };
    int[] B = { 2, 3, 4, 5, 6 };
    int k = 3;
    assertEquals(6, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case5() {
    int[] A = { 1, 2, 2, 4, 4 };
    int[] B = { 2, 3, 4, 5, 6 };
    int k = 5;
    assertEquals(4, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case6() {
    int[] A = { 2 };
    int[] B = { 1 };
    int k = 1;
    assertEquals(2, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case7() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int k = 20;
    assertEquals(923263934, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case8() {
    int[] A = { 6, 10, 12, 7, 13, 2, 16, 5, 11, 1, 3, 14, 4, 8, 15 };
    int[] B = { 9, 9, 10, 6, 6, 13, 10, 2, 10, 7, 1, 12, 1, 11, 14 };
    int k = 6;
    assertEquals(47, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case9() {
    int[] A = { 16, 9, 14, 6, 8, 4, 2, 10, 13, 12, 1, 11, 3, 5, 7 };
    int[] B = { 15, 16, 15, 15, 15, 16, 6, 8, 16, 15, 14, 10, 16, 2, 2 };
    int k = 9;
    assertEquals(406, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case10() {
    int[] A = { 5, 3, 4, 1, 2 };
    int[] B = { 6, 6, 3, 6, 4 };
    int k = 4;
    assertEquals(4, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case11() {
    int[] A = { 21, 22, 16, 37, 33, 25, 20, 14, 38, 36, 34, 43, 8, 26, 29, 15, 10, 27, 18, 28, 47, 35, 1, 9, 45, 7, 4, 3, 42, 32, 41, 17, 31, 5, 48, 49, 12, 30, 23, 39, 11, 40, 19, 50, 6, 2, 24, 46, 44 };
    int[] B = { 13, 21, 21, 22, 22, 16, 22, 13, 13, 14, 33, 20, 43, 14, 33, 38, 15, 15, 14, 25, 13, 38, 36, 27, 18, 22, 10, 36, 15, 20, 47, 18, 27, 42, 38, 42, 48, 41, 20, 12, 14, 31, 39, 11, 43, 17, 19, 50, 2 };
    int k = 9;
    assertEquals(13705, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case12() {
    int[] A = { 20, 11, 7, 8, 21, 12, 19, 18, 5, 10, 16, 22, 2, 14, 9, 1, 15, 17, 13, 6, 4 };
    int[] B = { 3, 3, 11, 7, 7, 3, 21, 8, 20, 18, 3, 5, 19, 10, 14, 2, 3, 7, 21, 12, 19 };
    int k = 14;
    assertEquals(1109, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case13() {
    int[] A = { 11, 9, 25, 23, 19, 18, 16, 15, 13, 21, 22, 2, 12, 4, 17, 20, 3, 26, 8, 24, 10, 1, 14, 7, 6 };
    int[] B = { 5, 11, 11, 25, 23, 23, 19, 5, 23, 19, 18, 15, 25, 22, 23, 4, 5, 5, 22, 17, 26, 24, 13, 20, 19 };
    int k = 14;
    assertEquals(9556, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case14() {
    int[] A = { 3, 24, 13, 1, 4, 16, 6, 14, 18, 17, 23, 2, 12, 8, 9, 7, 5, 22, 21, 20, 11, 19, 10 };
    int[] B = { 15, 15, 24, 24, 15, 1, 16, 13, 16, 6, 6, 17, 23, 2, 8, 12, 9, 12, 5, 21, 20, 11, 22 };
    int k = 15;
    assertEquals(255, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case15() {
    int[] A = { 2, 8, 25, 24, 22, 5, 26, 9, 23, 19, 21, 12, 13, 11, 6, 10, 20, 4, 1, 27, 7, 14, 16, 3, 17, 15 };
    int[] B = { 18, 18, 8, 25, 25, 25, 2, 2, 25, 18, 18, 5, 26, 21, 19, 8, 18, 12, 24, 1, 2, 12, 8, 5, 22, 3 };
    int k = 7;
    assertEquals(1068, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case16() {
    int[] A = { 11, 21, 16, 17, 7, 15, 10, 22, 2, 8, 20, 5, 25, 12, 9, 24, 4, 6, 19, 14, 3, 23, 1, 13 };
    int[] B = { 18, 11, 21, 18, 18, 16, 21, 7, 15, 11, 2, 18, 17, 5, 22, 5, 11, 24, 21, 19, 18, 9, 25, 25 };
    int k = 11;
    assertEquals(3954, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case17() {
    int[] A = { 24, 25, 22, 13, 29, 19, 27, 9, 15, 28, 4, 35, 21, 10, 34, 23, 8, 1, 17, 32, 14, 39, 6, 11, 12, 30, 37, 18, 2, 3, 5, 38, 26, 20, 7, 40, 31, 36, 33 };
    int[] B = { 16, 24, 16, 16, 16, 16, 22, 19, 22, 24, 19, 4, 16, 35, 10, 9, 16, 15, 9, 22, 29, 16, 22, 25, 27, 15, 15, 27, 13, 10, 37, 17, 23, 39, 17, 18, 17, 19, 14 };
    int k = 36;
    assertEquals(7379, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case18() {
    int[] A = { 28, 37, 27, 21, 34, 6, 22, 25, 24, 31, 26, 12, 18, 32, 20, 9, 23, 1, 36, 8, 4, 19, 11, 14, 10, 3, 7, 30, 16, 33, 5, 17, 13, 35, 15, 2 };
    int[] B = { 29, 28, 37, 37, 37, 28, 34, 34, 22, 21, 21, 24, 29, 18, 22, 26, 34, 34, 6, 6, 31, 22, 26, 24, 24, 23, 19, 1, 3, 9, 30, 8, 16, 24, 26, 23 };
    int k = 30;
    assertEquals(97806, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case19() {
    int[] A = { 28, 13, 22, 15, 27, 21, 17, 11, 25, 5, 18, 20, 4, 8, 16, 14, 12, 9, 24, 6, 7, 3, 23, 2, 19, 10, 1 };
    int[] B = { 26, 26, 26, 28, 15, 27, 13, 21, 15, 17, 5, 5, 25, 4, 5, 18, 8, 8, 9, 24, 14, 7, 6, 3, 23, 2, 2 };
    int k = 7;
    assertEquals(74, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case20() {
    int[] A = { 6, 4, 2, 8, 3, 5, 7 };
    int[] B = { 1, 1, 4, 2, 8, 8, 3 };
    int k = 6;
    assertEquals(5, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case21() {
    int[] A = { 4, 3, 5, 2, 6, 7, 9, 1, 8 };
    int[] B = { 10, 4, 3, 5, 2, 6, 7, 9, 1 };
    int k = 5;
    assertEquals(6, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case22() {
    int[] A = { 41, 32, 10, 35, 18, 14, 20, 12, 25, 44, 48, 40, 26, 23, 42, 28, 17, 37, 22, 16, 19, 39, 8, 30, 31, 11, 34, 43, 45, 1, 46, 5, 13, 3, 15, 9, 29, 50, 47, 38, 21, 6, 24, 4, 49, 36, 27, 33, 7 };
    int[] B = { 2, 41, 2, 2, 41, 18, 32, 20, 12, 2, 32, 20, 12, 14, 18, 42, 44, 2, 41, 22, 22, 2, 19, 42, 23, 10, 22, 20, 31, 20, 10, 25, 14, 14, 42, 12, 39, 19, 39, 34, 40, 30, 46, 11, 50, 1, 21, 4, 31 };
    int k = 29;
    assertEquals(656399310, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case23() {
    int[] A = { 1 };
    int[] B = { 2 };
    int k = 1;
    assertEquals(2, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case24() {
    int[] A = { 25, 28, 2, 14, 7, 22, 16, 27, 4, 9, 24, 11, 3, 23, 21, 8, 1, 20, 5, 12, 26, 17, 6, 18, 19, 15, 13 };
    int[] B = { 10, 25, 10, 28, 2, 7, 25, 16, 25, 7, 10, 14, 9, 27, 22, 9, 3, 25, 14, 2, 16, 20, 1, 8, 4, 26, 3 };
    int k = 18;
    assertEquals(17645, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case25() {
    int[] A = { 47, 3, 25, 42, 12, 19, 20, 14, 23, 39, 31, 9, 8, 4, 41, 26, 15, 27, 21, 11, 40, 28, 5, 29, 10, 18, 32, 16, 2, 13, 22, 44, 33, 46, 36, 43, 7, 34, 1, 6, 37, 38, 17, 24, 35, 30 };
    int[] B = { 45, 47, 47, 47, 3, 3, 45, 20, 25, 20, 25, 23, 25, 14, 20, 41, 41, 9, 31, 39, 4, 8, 8, 14, 23, 21, 9, 12, 9, 3, 10, 42, 2, 27, 3, 32, 41, 27, 26, 31, 18, 31, 39, 5, 28, 1 };
    int k = 10;
    assertEquals(22963, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case26() {
    int[] A = { 5, 6, 22, 2, 4, 11, 15, 20, 8, 12, 14, 7, 19, 9, 10, 18, 23, 17, 1, 3, 24, 16, 21 };
    int[] B = { 13, 13, 5, 5, 22, 2, 5, 5, 13, 8, 2, 8, 22, 15, 6, 7, 14, 4, 15, 18, 12, 8, 19 };
    int k = 1;
    assertEquals(24, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case27() {
    int[] A = { 5, 9, 18, 24, 22, 12, 3, 25, 7, 20, 19, 8, 13, 23, 21, 4, 16, 17, 2, 11, 14, 1, 10, 6 };
    int[] B = { 15, 15, 9, 18, 24, 24, 24, 22, 25, 24, 3, 19, 19, 13, 13, 13, 4, 21, 13, 17, 21, 14, 4, 1 };
    int k = 5;
    assertEquals(126, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case28() {
    int[] A = { 14, 13, 8, 19, 5, 12, 7, 10, 9, 17, 21, 15, 6, 16, 3, 4, 20, 18, 2, 22, 1 };
    int[] B = { 11, 14, 14, 13, 8, 5, 12, 7, 10, 9, 17, 17, 15, 15, 6, 16, 3, 4, 20, 18, 22 };
    int k = 2;
    assertEquals(21, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case29() {
    int[] A = { 23, 22, 5, 27, 15, 28, 2, 25, 10, 11, 7, 18, 21, 14, 26, 29, 8, 32, 16, 9, 20, 17, 31, 1, 4, 12, 3, 6, 24, 30, 13 };
    int[] B = { 19, 23, 22, 23, 5, 22, 22, 2, 27, 22, 19, 15, 23, 10, 28, 21, 28, 23, 29, 2, 23, 28, 17, 31, 1, 8, 4, 10, 29, 21, 11 };
    int k = 28;
    assertEquals(1899, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case30() {
    int[] A = { 4, 3, 5, 2 };
    int[] B = { 1, 1, 4, 4 };
    int k = 5;
    assertEquals(1, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case31() {
    int[] A = { 28, 1, 24, 11, 13, 20, 26, 7, 15, 8, 9, 21, 17, 14, 25, 16, 10, 12, 2, 19, 3, 6, 5, 4, 27, 29, 22, 18 };
    int[] B = { 23, 28, 28, 1, 24, 23, 11, 1, 7, 7, 15, 15, 9, 24, 9, 25, 15, 13, 14, 2, 8, 7, 14, 15, 12, 2, 4, 4 };
    int k = 14;
    assertEquals(22887, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case32() {
    int[] A = { 19, 2, 15, 14, 23, 22, 9, 16, 17, 26, 1, 10, 3, 13, 5, 18, 6, 25, 12, 24, 11, 7, 20, 8, 4 };
    int[] B = { 21, 19, 2, 19, 19, 21, 2, 15, 22, 23, 22, 15, 9, 9, 16, 22, 3, 2, 23, 2, 14, 18, 22, 9, 26 };
    int k = 20;
    assertEquals(7400, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case33() {
    int[] A = { 24, 1, 34, 35, 21, 28, 15, 11, 20, 16, 5, 40, 6, 25, 18, 4, 10, 33, 2, 39, 7, 42, 13, 27, 8, 23, 36, 14, 22, 26, 30, 31, 37, 43, 3, 12, 9, 32, 19, 17, 38, 29 };
    int[] B = { 41, 24, 24, 41, 35, 35, 21, 28, 34, 15, 28, 20, 5, 40, 40, 5, 4, 5, 40, 33, 33, 39, 10, 39, 4, 7, 7, 36, 39, 36, 23, 8, 14, 30, 14, 30, 14, 3, 3, 32, 37, 32 };
    int k = 40;
    assertEquals(1219, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case34() {
    int[] A = { 31, 25, 35, 21, 16, 4, 34, 42, 33, 6, 10, 18, 26, 13, 3, 41, 7, 19, 2, 15, 36, 20, 24, 28, 29, 23, 38, 32, 27, 9, 14, 17, 5, 11, 1, 37, 12, 40, 30, 39, 43, 22 };
    int[] B = { 8, 8, 31, 8, 8, 21, 16, 34, 25, 4, 42, 35, 25, 33, 13, 16, 21, 16, 19, 31, 35, 21, 19, 24, 41, 15, 41, 10, 23, 3, 7, 19, 17, 18, 13, 38, 24, 29, 15, 5, 2, 29 };
    int k = 12;
    assertEquals(82008, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case35() {
    int[] A = { 28, 29, 14, 12, 11, 24, 9, 10, 32, 13, 3, 6, 27, 17, 20, 31, 5, 19, 23, 26, 21, 1, 2, 25, 15, 7, 16, 4, 30, 8, 22 };
    int[] B = { 18, 28, 28, 18, 18, 18, 11, 24, 10, 24, 28, 29, 11, 18, 12, 11, 29, 3, 32, 5, 10, 32, 17, 32, 5, 23, 19, 6, 2, 23, 4 };
    int k = 1;
    assertEquals(32, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case36() {
    int[] A = { 22, 31, 14, 29, 28, 9, 5, 23, 6, 27, 36, 34, 7, 18, 20, 11, 19, 25, 10, 2, 15, 32, 26, 16, 4, 8, 3, 17, 1, 24, 35, 21, 12, 13, 33 };
    int[] B = { 30, 30, 30, 14, 31, 29, 29, 9, 9, 6, 27, 6, 36, 34, 7, 7, 18, 11, 25, 10, 2, 15, 32, 15, 16, 26, 8, 4, 3, 1, 1, 35, 35, 12, 21 };
    int k = 1;
    assertEquals(36, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case37() {
    int[] A = { 6, 8, 30, 10, 22, 15, 5, 20, 14, 26, 23, 11, 9, 12, 25, 4, 28, 7, 31, 13, 18, 27, 29, 17, 33, 24, 36, 16, 35, 19, 1, 34, 32, 21, 2 };
    int[] B = { 3, 3, 6, 3, 10, 3, 3, 22, 10, 8, 15, 5, 8, 14, 11, 25, 4, 5, 12, 25, 26, 28, 12, 25, 28, 31, 7, 24, 17, 13, 27, 16, 36, 17, 19 };
    int k = 26;
    assertEquals(74996, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case38() {
    int[] A = { 11, 4, 3, 7, 8, 5, 1, 6, 2, 12, 9 };
    int[] B = { 10, 11, 11, 3, 3, 7, 8, 5, 1, 6, 2 };
    int k = 1;
    assertEquals(12, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case39() {
    int[] A = { 2, 1, 5, 4 };
    int[] B = { 3, 3, 1, 5 };
    int k = 5;
    assertEquals(1, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case40() {
    int[] A = { 12, 5, 14, 1, 7, 9, 15, 8, 3, 2, 6, 11, 10, 13 };
    int[] B = { 4, 12, 5, 14, 1, 7, 9, 15, 8, 3, 2, 6, 11, 10 };
    int k = 3;
    assertEquals(13, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case41() {
    int[] A = { 4, 9, 1, 8, 6, 7, 5, 2 };
    int[] B = { 3, 4, 3, 1, 9, 1, 6, 5 };
    int k = 8;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case42() {
    int[] A = { 10, 24, 27, 38, 21, 5, 28, 35, 3, 17, 49, 31, 15, 11, 7, 33, 22, 48, 23, 29, 9, 46, 39, 47, 32, 36, 2, 20, 42, 43, 4, 34, 16, 25, 45, 1, 6, 18, 41, 12, 44, 37, 26, 8, 14, 13, 19, 40 };
    int[] B = { 30, 10, 24, 27, 38, 21, 5, 28, 35, 3, 17, 49, 31, 15, 11, 7, 33, 22, 48, 23, 29, 9, 46, 39, 47, 32, 36, 2, 20, 42, 43, 4, 34, 16, 25, 45, 1, 6, 18, 41, 12, 44, 37, 26, 8, 14, 13, 19 };
    int k = 5;
    assertEquals(45, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case43() {
    int[] A = { 3, 9, 1, 2, 8, 5, 10, 4, 6, 11 };
    int[] B = { 7, 7, 7, 1, 7, 9, 2, 5, 9, 8 };
    int k = 4;
    assertEquals(20, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case44() {
    int[] A = { 16, 3, 8, 26, 11, 25, 20, 28, 10, 23, 17, 29, 7, 1, 24, 14, 18, 5, 9, 15, 22, 27, 12, 13, 4, 6, 19, 2 };
    int[] B = { 21, 21, 16, 21, 26, 8, 3, 26, 16, 21, 28, 17, 3, 29, 26, 29, 8, 17, 26, 11, 17, 23, 11, 25, 23, 18, 5, 22 };
    int k = 4;
    assertEquals(89, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case45() {
    int[] A = { 12, 17, 14, 22, 1, 16, 15, 20, 19, 7, 5, 18, 21, 9, 2, 6, 4, 13, 3, 10, 11 };
    int[] B = { 8, 8, 17, 17, 8, 17, 16, 12, 16, 22, 22, 1, 19, 7, 18, 21, 9, 6, 9, 18, 6 };
    int k = 20;
    assertEquals(46, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case46() {
    int[] A = { 22, 1, 16, 21, 14, 27, 5, 3, 2, 37, 12, 35, 29, 10, 38, 23, 13, 18, 9, 6, 4, 34, 36, 31, 11, 8, 28, 19, 20, 33, 26, 24, 15, 30, 32, 17, 25 };
    int[] B = { 7, 22, 22, 22, 22, 14, 1, 16, 22, 14, 3, 27, 16, 35, 35, 3, 5, 14, 1, 35, 6, 21, 22, 38, 37, 36, 13, 28, 6, 8, 10, 16, 33, 20, 20, 23, 27 };
    int k = 34;
    assertEquals(4086, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case47() {
    int[] A = { 7, 12, 14, 4, 9, 3, 6, 13, 11, 1, 10, 8, 5 };
    int[] B = { 2, 7, 12, 14, 12, 14, 4, 6, 7, 13, 9, 2, 4 };
    int k = 1;
    assertEquals(14, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case48() {
    int[] A = { 30, 27, 14, 12, 16, 6, 20, 18, 23, 7, 5, 13, 9, 10, 8, 1, 28, 31, 24, 25, 3, 29, 19, 15, 22, 2, 26, 17, 4, 21 };
    int[] B = { 11, 11, 11, 30, 12, 14, 6, 27, 20, 18, 23, 5, 20, 9, 9, 8, 1, 10, 10, 10, 24, 25, 29, 25, 3, 15, 15, 26, 26, 15 };
    int k = 16;
    assertEquals(12270, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case49() {
    int[] A = { 1, 19, 10, 33, 27, 18, 24, 23, 14, 7, 5, 30, 20, 26, 8, 16, 3, 25, 13, 2, 6, 32, 28, 9, 17, 11, 15, 29, 12, 22, 31, 21 };
    int[] B = { 4, 4, 1, 19, 1, 19, 33, 24, 23, 14, 23, 7, 5, 30, 26, 26, 8, 16, 25, 16, 2, 13, 32, 2, 6, 17, 9, 15, 15, 11, 29, 29 };
    int k = 21;
    assertEquals(4216, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case50() {
    int[] A = { 7, 25, 5, 11, 24, 4, 1, 8, 19, 14, 2, 15, 18, 21, 20, 26, 16, 10, 12, 13, 22, 9, 3, 17, 23 };
    int[] B = { 6, 6, 7, 25, 11, 6, 25, 25, 6, 19, 5, 14, 8, 1, 19, 8, 26, 20, 15, 15, 21, 13, 9, 20, 22 };
    int k = 4;
    assertEquals(58, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case51() {
    int[] A = { 6, 5, 1, 2, 8, 4, 7 };
    int[] B = { 3, 6, 5, 1, 1, 2, 4 };
    int k = 5;
    assertEquals(7, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case52() {
    int[] A = { 1, 3, 6, 5, 4 };
    int[] B = { 2, 2, 1, 6, 1 };
    int k = 5;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case53() {
    int[] A = { 21, 17, 14, 39, 4, 33, 7, 45, 13, 32, 41, 3, 28, 6, 12, 47, 46, 11, 42, 44, 43, 38, 24, 29, 2, 10, 8, 34, 27, 23, 30, 18, 25, 15, 36, 31, 20, 19, 37, 35, 26, 16, 1, 9, 40, 5 };
    int[] B = { 22, 21, 21, 14, 21, 39, 39, 4, 14, 17, 4, 13, 7, 21, 14, 7, 21, 45, 46, 41, 47, 7, 4, 6, 24, 47, 10, 11, 10, 28, 42, 44, 43, 11, 29, 11, 8, 34, 24, 30, 29, 31, 37, 23, 31, 18 };
    int k = 29;
    assertEquals(39336636, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case54() {
    int[] A = { 37, 18, 38, 16, 24, 17, 1, 7, 9, 44, 10, 33, 43, 25, 8, 15, 22, 31, 39, 12, 23, 19, 36, 3, 5, 40, 13, 32, 4, 29, 26, 28, 35, 21, 20, 41, 2, 30, 27, 14, 42, 11, 34 };
    int[] B = { 6, 37, 18, 38, 18, 16, 37, 17, 37, 1, 44, 24, 38, 16, 1, 9, 7, 10, 44, 7, 7, 39, 16, 7, 24, 1, 3, 33, 12, 7, 17, 1, 29, 44, 22, 7, 35, 8, 15, 23, 10, 7, 35 };
    int k = 41;
    assertEquals(1950, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case55() {
    int[] A = { 6, 5, 8, 4, 10, 2, 3, 1, 7 };
    int[] B = { 9, 9, 5, 9, 6, 9, 5, 4, 8 };
    int k = 1;
    assertEquals(10, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case56() {
    int[] A = { 20, 2, 12, 6, 9, 1, 4, 8, 21, 10, 3, 11, 29, 23, 26, 17, 30, 28, 5, 32, 31, 14, 25, 16, 15, 18, 33, 7, 24, 27, 19, 13 };
    int[] B = { 22, 20, 2, 2, 20, 6, 20, 2, 9, 6, 8, 10, 12, 9, 11, 8, 8, 30, 23, 17, 23, 29, 28, 26, 26, 14, 16, 25, 31, 32, 25, 18 };
    int k = 6;
    assertEquals(297, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case57() {
    int[] A = { 1, 5, 4, 17, 21, 14, 9, 11, 10, 15, 19, 20, 18, 7, 12, 8, 16, 2, 3, 13 };
    int[] B = { 6, 1, 5, 4, 5, 4, 5, 21, 21, 10, 14, 15, 15, 10, 7, 19, 8, 8, 16, 3 };
    int k = 15;
    assertEquals(491, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case58() {
    int[] A = { 2 };
    int[] B = { 1 };
    int k = 1;
    assertEquals(2, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case59() {
    int[] A = { 4, 6, 13, 14, 10, 15, 2, 5, 11, 8, 9, 12, 1, 16, 17, 3 };
    int[] B = { 7, 4, 6, 6, 13, 10, 6, 13, 7, 2, 11, 14, 12, 4, 1, 13 };
    int k = 12;
    assertEquals(175, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case60() {
    int[] A = { 3, 4, 1, 2 };
    int[] B = { 5, 5, 3, 4 };
    int k = 5;
    assertEquals(1, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case61() {
    int[] A = { 4, 15, 3, 10, 26, 7, 23, 24, 31, 2, 27, 28, 13, 21, 17, 11, 8, 25, 5, 30, 18, 22, 12, 14, 20, 9, 32, 19, 6, 16, 29, 33 };
    int[] B = { 1, 4, 15, 4, 3, 4, 7, 15, 1, 3, 23, 7, 31, 2, 13, 26, 21, 10, 4, 15, 25, 4, 13, 12, 1, 30, 3, 10, 7, 14, 16, 21 };
    int k = 4;
    assertEquals(119, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case62() {
    int[] A = { 1, 5, 3, 4, 2, 8, 7 };
    int[] B = { 6, 1, 6, 6, 1, 5, 3 };
    int k = 1;
    assertEquals(8, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case63() {
    int[] A = { 23, 6, 26, 11, 22, 13, 32, 28, 33, 2, 24, 25, 27, 30, 5, 17, 20, 10, 31, 16, 4, 1, 14, 18, 8, 9, 15, 21, 29, 19, 3, 12 };
    int[] B = { 7, 7, 7, 26, 26, 22, 6, 32, 22, 28, 13, 2, 2, 27, 24, 30, 27, 30, 30, 17, 10, 4, 10, 16, 14, 1, 8, 14, 9, 29, 29, 21 };
    int k = 6;
    assertEquals(161, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case64() {
    int[] A = { 26, 12, 33, 15, 8, 28, 44, 4, 23, 40, 19, 2, 42, 34, 6, 31, 39, 1, 11, 7, 29, 47, 46, 3, 5, 25, 22, 45, 35, 36, 48, 21, 32, 13, 16, 37, 38, 27, 10, 41, 14, 18, 20, 30, 9, 24, 17, 43 };
    int[] B = { 49, 26, 26, 33, 33, 8, 15, 15, 12, 15, 40, 12, 19, 26, 19, 19, 12, 4, 26, 15, 4, 28, 42, 34, 28, 47, 44, 42, 19, 7, 8, 39, 12, 39, 15, 42, 37, 22, 8, 34, 12, 22, 38, 39, 41, 39, 4, 45 };
    int k = 21;
    assertEquals(178542617, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case65() {
    int[] A = { 26, 13, 6, 23, 28, 25, 24, 21, 29, 31, 2, 14, 15, 18, 19, 7, 3, 11, 9, 17, 8, 5, 10, 30, 16, 12, 27, 22, 20, 1 };
    int[] B = { 4, 26, 13, 26, 4, 6, 25, 25, 6, 26, 6, 24, 29, 2, 13, 21, 24, 26, 2, 21, 26, 9, 13, 2, 13, 30, 26, 7, 12, 2 };
    int k = 21;
    assertEquals(346351, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case66() {
    int[] A = { 4, 2, 3 };
    int[] B = { 1, 1, 2 };
    int k = 2;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case67() {
    int[] A = { 1, 4, 5, 3 };
    int[] B = { 2, 1, 4, 5 };
    int k = 3;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case68() {
    int[] A = { 11, 9, 17, 2, 4, 24, 32, 5, 30, 28, 26, 25, 23, 7, 12, 31, 14, 27, 19, 20, 22, 15, 21, 29, 13, 16, 3, 1, 6, 18, 8 };
    int[] B = { 10, 10, 11, 10, 11, 10, 2, 17, 5, 24, 9, 9, 2, 30, 32, 28, 4, 23, 12, 17, 10, 9, 24, 17, 17, 20, 22, 19, 16, 22, 22 };
    int k = 2;
    assertEquals(31, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case69() {
    int[] A = { 4, 17, 8, 40, 34, 10, 15, 1, 3, 21, 16, 11, 35, 38, 14, 25, 31, 22, 37, 19, 36, 6, 43, 28, 26, 18, 39, 20, 12, 32, 9, 44, 30, 29, 24, 27, 42, 5, 2, 33, 7, 13, 41 };
    int[] B = { 23, 23, 17, 8, 4, 34, 8, 4, 10, 8, 21, 4, 8, 1, 15, 8, 10, 16, 35, 21, 1, 14, 1, 40, 36, 38, 17, 4, 8, 43, 1, 18, 34, 11, 34, 37, 27, 24, 28, 21, 25, 2, 40 };
    int k = 37;
    assertEquals(259800, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case70() {
    int[] A = { 28, 13, 15, 24, 25, 16, 20, 9, 5, 8, 11, 1, 6, 3, 12, 4, 18, 29, 2, 30, 10, 27, 22, 7, 32, 23, 21, 14, 31, 26, 19 };
    int[] B = { 17, 28, 13, 15, 28, 17, 15, 13, 20, 15, 15, 16, 1, 11, 3, 3, 12, 1, 29, 11, 6, 29, 29, 18, 27, 27, 10, 7, 7, 31, 21 };
    int k = 2;
    assertEquals(31, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case71() {
    int[] A = { 9, 6, 15, 13, 12, 7, 3, 5, 8, 4, 11, 10, 14, 2, 17, 16, 1 };
    int[] B = { 18, 9, 6, 9, 15, 15, 6, 7, 9, 6, 4, 4, 11, 14, 3, 11, 8 };
    int k = 10;
    assertEquals(612, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case72() {
    int[] A = { 2 };
    int[] B = { 1 };
    int k = 2;
    assertEquals(1, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case73() {
    int[] A = { 11, 10, 12, 7, 1, 3, 9, 6, 15, 17, 18, 8, 2, 4, 19, 5, 13, 16 };
    int[] B = { 14, 11, 14, 10, 14, 12, 1, 3, 7, 1, 11, 18, 12, 12, 3, 9, 11, 13 };
    int k = 16;
    assertEquals(118, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case74() {
    int[] A = { 6, 1, 3, 2, 7, 5 };
    int[] B = { 4, 4, 6, 1, 3, 7 };
    int k = 1;
    assertEquals(7, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case75() {
    int[] A = { 2, 16, 8, 7, 15, 3, 5, 11, 12, 14, 9, 6, 13, 10, 4, 17 };
    int[] B = { 1, 2, 2, 8, 7, 15, 7, 15, 3, 12, 5, 14, 14, 13, 13, 10 };
    int k = 9;
    assertEquals(68, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case76() {
    int[] A = { 2 };
    int[] B = { 1 };
    int k = 1;
    assertEquals(2, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case77() {
    int[] A = { 5, 3, 37, 32, 14, 27, 44, 38, 29, 24, 18, 20, 7, 22, 45, 15, 9, 11, 34, 31, 19, 8, 30, 26, 16, 17, 1, 41, 42, 25, 10, 39, 4, 2, 33, 12, 36, 21, 43, 6, 35, 23, 40, 28 };
    int[] B = { 13, 13, 13, 5, 5, 37, 3, 32, 32, 29, 37, 32, 18, 27, 38, 18, 45, 20, 15, 15, 22, 11, 34, 9, 31, 31, 16, 31, 8, 1, 1, 10, 1, 42, 42, 33, 25, 39, 12, 36, 36, 43, 36, 36 };
    int k = 22;
    assertEquals(604374, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case78() {
    int[] A = { 22, 18, 3, 6, 14, 9, 12, 16, 26, 4, 21, 11, 13, 17, 24, 8, 7, 19, 15, 2, 25, 23, 20, 10, 1 };
    int[] B = { 5, 5, 5, 18, 18, 22, 9, 9, 16, 14, 4, 21, 26, 13, 11, 14, 16, 22, 3, 16, 8, 17, 11, 4, 7 };
    int k = 20;
    assertEquals(1875, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case79() {
    int[] A = { 7, 2, 17, 4, 22, 5, 10, 33, 28, 32, 29, 11, 18, 21, 3, 23, 6, 30, 1, 26, 19, 16, 20, 31, 8, 15, 14, 9, 12, 25, 27, 24 };
    int[] B = { 13, 13, 7, 17, 17, 2, 13, 5, 7, 17, 22, 33, 17, 4, 2, 29, 32, 23, 5, 17, 21, 5, 16, 30, 26, 19, 22, 8, 20, 9, 26, 8 };
    int k = 1;
    assertEquals(33, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case80() {
    int[] A = { 4, 12, 18, 1, 15, 20, 10, 2, 8, 11, 3, 7, 5, 17, 6, 19, 21, 22, 16, 9, 14 };
    int[] B = { 13, 4, 12, 4, 13, 15, 4, 10, 15, 10, 2, 4, 1, 20, 12, 17, 19, 18, 11, 20, 10 };
    int k = 11;
    assertEquals(1667, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case81() {
    int[] A = { 10, 20, 13, 28, 3, 26, 19, 1, 12, 6, 5, 9, 24, 23, 17, 22, 27, 7, 14, 21, 11, 8, 4, 15, 16, 2, 18 };
    int[] B = { 25, 25, 10, 20, 25, 13, 3, 19, 13, 10, 20, 20, 28, 3, 23, 6, 3, 22, 5, 26, 14, 6, 22, 4, 13, 27, 22 };
    int k = 9;
    assertEquals(2095, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case82() {
    int[] A = { 13, 17, 9, 16, 5, 6, 28, 27, 20, 21, 4, 31, 34, 14, 22, 12, 24, 10, 25, 23, 19, 8, 3, 29, 18, 11, 2, 33, 7, 30, 32, 26, 1 };
    int[] B = { 15, 15, 17, 13, 17, 15, 9, 28, 5, 28, 9, 15, 6, 13, 17, 5, 5, 9, 24, 31, 17, 4, 8, 8, 5, 18, 18, 2, 24, 24, 7, 30, 24 };
    int k = 25;
    assertEquals(406579, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case83() {
    int[] A = { 35, 6, 1, 22, 32, 33, 38, 16, 23, 5, 36, 12, 9, 25, 29, 17, 26, 4, 11, 18, 34, 2, 8, 14, 3, 15, 21, 20, 31, 13, 10, 30, 37, 19, 7, 27, 28 };
    int[] B = { 24, 35, 24, 1, 22, 22, 32, 32, 1, 22, 1, 23, 33, 35, 33, 36, 36, 25, 16, 23, 1, 12, 32, 16, 1, 32, 38, 26, 34, 1, 32, 20, 4, 36, 36, 3, 3 };
    int k = 15;
    assertEquals(1840442, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case84() {
    int[] A = { 2, 17, 30, 25, 13, 15, 29, 7, 22, 27, 4, 5, 10, 23, 16, 33, 18, 31, 34, 20, 6, 32, 26, 11, 28, 12, 14, 21, 1, 8, 3, 24, 19 };
    int[] B = { 9, 9, 2, 9, 30, 2, 25, 15, 7, 7, 15, 9, 13, 17, 13, 4, 16, 27, 13, 22, 15, 25, 18, 2, 34, 15, 11, 5, 30, 26, 31, 6, 3 };
    int k = 24;
    assertEquals(134318, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case85() {
    int[] A = { 1, 5, 2, 3 };
    int[] B = { 4, 4, 1, 2 };
    int k = 2;
    assertEquals(4, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case86() {
    int[] A = { 23, 29, 28, 7, 43, 21, 44, 26, 25, 17, 41, 34, 14, 39, 18, 42, 36, 27, 6, 45, 5, 31, 10, 35, 11, 9, 38, 24, 3, 2, 37, 12, 30, 22, 32, 13, 4, 20, 16, 19, 8, 1, 15, 33 };
    int[] B = { 40, 40, 23, 40, 29, 40, 43, 7, 44, 25, 17, 23, 44, 7, 43, 14, 14, 39, 23, 29, 34, 17, 21, 18, 42, 18, 44, 6, 25, 27, 21, 44, 2, 34, 39, 6, 37, 31, 22, 11, 16, 6, 6, 19 };
    int k = 24;
    assertEquals(20383362, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case87() {
    int[] A = { 8, 1, 2, 5, 9, 6, 7, 4 };
    int[] B = { 3, 3, 8, 2, 1, 5, 9, 9 };
    int k = 5;
    assertEquals(6, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case88() {
    int[] A = { 13, 10, 11, 5, 24, 6, 30, 20, 3, 16, 4, 2, 14, 22, 7, 26, 1, 19, 18, 15, 29, 12, 9, 25, 21, 8, 28, 27, 23 };
    int[] B = { 17, 13, 13, 11, 13, 5, 11, 6, 20, 11, 3, 24, 13, 17, 20, 2, 3, 6, 26, 13, 15, 3, 16, 2, 4, 12, 8, 19, 12 };
    int k = 22;
    assertEquals(29338, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case89() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int k = 18;
    assertEquals(21117453, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case90() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int k = 20;
    assertEquals(250632153, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case91() {
    int[] A = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int[] B = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1 };
    int k = 22;
    assertEquals(608335282, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case92() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int k = 20;
    assertEquals(923263934, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case93() {
    int[] A = { 1, 2, 3 };
    int[] B = { 2, 3, 4 };
    int k = 2;
    assertEquals(3, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case94() {
    int[] A = { 1, 1, 1, 2, 2, 2, 7, 8, 9, 9, 11, 4, 4 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
    int k = 5;
    assertEquals(33, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case95() {
    int[] A = { 1, 2, 2, 4, 4 };
    int[] B = { 2, 3, 4, 5, 6 };
    int k = 3;
    assertEquals(6, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case96() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int k = 47;
    assertEquals(18424, foxconnection2.ways(A, B, k));
  }

  @Test
  public void case97() {
    int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] B = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int k = 2;
    assertEquals(39, foxconnection2.ways(A, B, k));
  }

}