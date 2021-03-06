package topc.test.graph;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.graph.*;

public class RoboCourierTest {
  RoboCourier _calc = new RoboCourier();

  @Test
  public void case0() {
    String[] path = { "FRRFLLFLLFRRFLF" };
    assertEquals(15, _calc.timeToDeliver(path));
  }

  @Test
  public void case1() {
    String[] path = { "RFLLF" };
    assertEquals(17, _calc.timeToDeliver(path));
  }

  @Test
  public void case2() {
    String[] path = { "FLFRRFRFRRFLLFRRF" };
    assertEquals(0, _calc.timeToDeliver(path));
  }

  @Test
  public void case3()	{
    String[] path = { "FFFFFFFFFRRFFFFFFRRFFFFF",
      "FLLFFFFFFLLFFFFFFRRFFFF" };
    assertEquals(44, _calc.timeToDeliver(path));
  }

  @Test
  public void case4()	{
    String[] path = { "RFLLFLFLFRFRRFFFRFFRFFRRFLFFRLRRFFLFFLFLLFRFLFLRFF",
      "RFFLFLFFRFFLLFLLFRFRFLRLFLRRFLRFLFFLFFFLFLFFRLFRLF",
      "LLFLFLRLRRFLFLFRLFRF" };
    assertEquals(24, _calc.timeToDeliver(path));
  }

  @Test
  public void case5()	{
    String[] path = { "LLFLFRLRRLRFFLRRRRFFFLRFFRRRLLFLFLLRLRFFLFRRFFFLFL",
      "RLFFRRLRLRRFFFLLLRFRLLRFFLFRLFRRFRRRFRLRLRLFFLLFLF",
      "FRFLRFRRLLLRFFRRRLRFLFRRFLFFRLFLFLFRLLLLFRLLRFLLLF",
      "FFLFRFRRFLLFFLLLFFRLLFLRRFRLFFFRRFFFLLRFFLRFRRRLLR",
      "FFFRRLLFLLRLFRRLRLLFFFLFLRFFRLRLLFLRLFFLLFFLLFFFRR",
      "LRFRRFLRRLRRLRFFFLLLLRRLRFFLFRFFRLLRFLFRRFLFLFFLFR",
      "RFRRLRRFLFFFLLRFLFRRFRFLRLRLLLLFLFFFLFRLLRFRLFRLFR",
      "LLFLFRLFFFFFFFRRLRLRLLRFLRLRRRRRRRRLFLFLFLRFLFRLFF",
      "RLFRRLLRRRRFFFRRRLLLLRRLFFLLLLLRFFFFRFRRLRRRFFFLLF",
      "FFFFLRRLRFLLRRLRLRFRRRRLFLLRFLRRFFFRFRLFFRLLFFRRLL" };
    assertEquals(169, _calc.timeToDeliver(path));
  }

  @Test
  public void case11() {
    String[] path = {"FRRFLLFLLFRF"};
    assertEquals(11, _calc.timeToDeliver(path));
  }

  @Test
  public void case12() {
    String[] path = {"RRFFFLFLFLFLRFLFLFLFLFRLFLFLRF"};
    assertEquals(36, _calc.timeToDeliver(path));
  }

  @Test
  public void case13() {
    String[] path = {"RFLRFRFFRFRFRFFRRFRLRFRFLRRFRR", "FFRLLFLFLFFFLLFFFFLRFRLLFFFFRF"};
    assertEquals(61, _calc.timeToDeliver(path));
  }

  @Test
  public void case14() {
    String[] path = {"RFRFFFRLRLLFFFRLFLFFRRLLLFFLFRFRRFLLFFRLRRFFF", "RRLFRLRLLLRRLLLLRRFRLLLRLLFFFFFLRLFLFLLFRFFLR", "FLLRLFFFFR"};
    assertEquals(70, _calc.timeToDeliver(path));
  }

  @Test
  public void case15() {
    String[] path = {"FFFRRRRRRRRRFFFLLLLLLLFF"};
    assertEquals(14, _calc.timeToDeliver(path));
  }

  @Test
  public void case16() {
    String[] path = {"LLFFFFRRFLFFLFLFLLFRRFFLLFFFFLLFLFFFRRFF"};
    assertEquals(38, _calc.timeToDeliver(path));
  }

  @Test
  public void case17() {
    String[] path = {"RFLLFLFLFRFRRFFFRFFRFFRRFLFFRLRRFFLFFLFLLFRFLFLRFF", "RFFLFLFFRFFLLFLLFRFRFLRLFLRRFLRFLFFLFFFLFLFFRLFRLF", "LLFLFLRLRRFLFLFRLFRF"};
    assertEquals(24, _calc.timeToDeliver(path));
  }

  @Test
  public void case18() {
    String[] path = {"LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL"};
    assertEquals(0, _calc.timeToDeliver(path));
  }

  @Test
  public void case19() {
    String[] path = {"RRFLRRRFRRLRRRFRLRRLRFLRRFFLLLLRLLRRLLLRRLRLRLLFFF", "RLLLRFRLFLRFFFFLRLRFLLFLLRRLFLFRFRFLFRLRFFFRFLLLRF", "FLFLFFFFLLRFLLLFFFFLLRLLFFFFRLRRRRLRFRRLRFRLRRFFLF", "FFLFLFFFRFFLRLLFLRFLFRLLRRLFLLLLFRLRRRFLFLRRRFRLRL", "FRFRFLLLFRFLFFFRFFLRFLLFRRLLLFRFLLFFLFFFFFRFLLFLFR", "FLLFRLRLRFFRFRRLRRFRFRRFRLLRRRLLLRFFLFRRFFRLRRFRLF", "FFFLRRFFRLRRLFRLRLFFLFLFFLFFLLRLLLLFFFFFFFFRRFLLRL", "RRFLFFLLRRLLRRRRRLLFRLLLRRRFRFRFRLRLLFRFFLLLLLRRRL", "LFLLRLRLLRRRRLRLLFRRFFLFRLFRLLRLLFLFFLFFFLFRRRLRLR", "FRLLRRRLLLRLRLFLLFLLLFFLFFRRFRFFFFLLLLLFLFRRLRRLFR"};
    assertEquals(102, _calc.timeToDeliver(path));
  }

  @Test
  public void case110() {
    String[] path = {"FLFRRLLFLLRLLRLLLRFRRLLLRRLLRLLLFLLRLRRLLRFLLFLLLR", "RRFFLLFLRFFRLLLRRLLRFLFLFRRFLLRRLLFLLFRRFRLRFLRLFR", "RFFLFFRRFFLLFFFRLFFRRFRLLFLLRRFFRLFRFRLLFLLRFLLRLF", "RRRLRLLFRFRRLLLLLFRFRLLRFLFLFFRFRRLLRFFLLRLRLRFLRL", "RFFRFLLLRLRRLFFRFLLFFRLRRLRLRLLLLFLLLLLFLRRFLRFRLL", "FFLFRLRRRLLFLFLLRLLRLLRLRFLLRLFRFRFRFLFLLRRLLLLFFF", "LRFLRFLLFLLRLFFLFFLLLRLLRLLRFRLRLRLLFFRRLFFLLFLRLL", "FLLRLRRLLFFLLFLLLRLRFRFFRRLRFRLLRRLRFRFRRLLFLRLLLL", "LFFLRLRLLRRFFRLLRFFLLFLRRRFLFLFLLRLFFLLRFLFLLLRLFF", "LLFRLLFLFFRLFFLLFLRRLLFLRFFFRLLFFRLFRFRLLFFFLLRLRL"};
    assertEquals(145, _calc.timeToDeliver(path));
  }

  @Test
  public void case111() {
    String[] path = {"RLFRFFRFRFFRFFLFFLRLRLFLFLRFFRFLRLRFLFFLFFFRLFRLFL", "RLRFRFRFLFLFLFFLRLFFLRLRFFFLFLFFLFRLFFFFRLFFLRLFFL", "FLRFRLRLFLRLFRLFLFFFRLRLRRFLFLFFFLRFLRFFLRFLRLLFLR", "LFFRLFRFRFRLLFLRFRLLFRLFFFRLRLLFRFLFLFRLLFFLFLRLFF", "FFLFLRRFFFLRFLRFLFLFFLRFLFFLFFFLRLFFFLRFLFRFFRFFFR", "FLRLRLRRFRLRFLFLFRRFLLFRFLRFFLRLFLFLRLFFLRLRFFLFLF", "LFLFLRFFFFRFRLFRFFFFFLFLFFLRLFFFRFFFFFLFFFLFLFRFRL", "LRLFLRLRRLFRLRRLRLRLRFLFLRLRLLRFLFRFRRLFFFLFLFFLLR", "LRLFFRFLFFFLLFRFLFRLRFFLFLFRRFFFFFLRRFFRLRLFFRLRLF", "LFRLRRLRLRRLRLRFLLFLRLLFLFLFLRLRFFRLRFLRFFRFLLFRFF"};
    assertEquals(143, _calc.timeToDeliver(path));
  }

  @Test
  public void case112() {
    String[] path = {"FLRLRFLRLRFLFLRFFFFLRFLFFFLRFFRLFRLRFLRLRRFRLRFRRF", "LRFFFRRFFLFLFLFRLLFFFLFFLFLLFLFFLFFFRFFFFLRLRLFLRF", "LFRLFLFFLFLRRFLRFRLFRLLFLRFLFLRFFFLRFLFRLFLRRFFLRL", "LRFFLLFLRLRLLFFFRFFRLFRFRLRLFFFRLRFLFLFLFRLRRFLRRF", "FLFFLFLFRLRLRLFRFFLLFLFLRFFRRFLRFFLRLRLRFRLFLFLFLR", "LFLRRFLLFLFLFLFFLLFFFLFFRFRLRFLFRFRLFLRFFLFRRFFFLL", "RFFFLRLFFRLFRFLRLFRFLFRFLFRRLFFLFRLRLLFRLFLFFFLFFR", "LRLLFFRFRFRLRLRFFRLFFLLFFFLRFFRFLFRFLRLRLRLFLFLFLF", "LLFLFRFLLFFLFFLRLFRRFLRLRLRFFRLFFLRFLFFRFLFLFLFFLR", "FFFLLFRFRLLFFFLRLFLRLFRLRRFLRFLRFFRFRFLFLLRFLFLRFL"};
    assertEquals(169, _calc.timeToDeliver(path));
  }

  @Test
  public void case113() {
    String[] path = {"RFRRFLRRFFFLFRLRFLLFFLFFFLRLRLFLFFRLFFRLFFLLFFLRFL", "FFLFFFFLFFFFLLFLRLLRFFLRFFFFLFFLFLFFLFRLRFLRLFLRFL", "LRFRFFFLRFFLRFFRLRLLFLRLFFFFRFFFLFLFLRRRRFLFFFLFLR", "LRFFFLFRLRFLLFLRLRLFFFRFLRLLFFFRLFLRFFRFFLRFLRFLRR", "FLFLFLRLRFFLLFFFRFFFLRLRFFLRLLFRFLFFLFLFFLFLRLRLFF", "LLFFFLRFFFLFLRFLRFFFRLFRFLLFLFLRRFLRFFLFFLFFLFFLLF", "FLFLFLRLFLRFFLRLFLRLRLFRFLRLRLFLFLRFFLFRLFLFLLFLFF", "RLRFLRRFRFRLRFRLRFLFFLLFLFFFLLFLRLFRLRLRLFLRFLFLRL", "LFRFFLRRFRFLFFFLFFFLFLFFLFRLLFFFLRFRLRLFLRLRFLRFFR", "LLFRLRFRLRLFLLFRFRFLLLFFLRFLRLRLFFRLLFLFLRRFLFRRFL"};
    assertEquals(158, _calc.timeToDeliver(path));
  }

  @Test
  public void case114() {
    String[] path = {"FFFF", "LFFFFFFFF", "FFFFFFFFFFFFFR", "LRFFFFFFF"};
    assertEquals(82, _calc.timeToDeliver(path));
  }

  @Test
  public void case115() {
    String[] path = {"FLFFLFLRLRLRLFFLRLRLFLFLRLFFFLRLFRLFRFFLRRFLFLRLLF", "FFLFRLFLFFLFLRFRRFLFFFLFLFRRFRLFFFRLRLRFRRFLRFLRFL", "FFFFRFLFRFFFFLLFLFLFLFFLRLFLFLLFFRFLLFLFFRFRFLRFRL", "RRFLFLRLFFLRFRLRLFLRLRLLFFFLRFFLFLFLFFFRFRFFFLLFRL", "FFLRLRLFRLLFRFLFLRFRLFFLLFRFLRLFFRLFRLLFLFLFFFLLFR", "FLRFFLRLLFFRRFRLFLFLFLFFRFLFLRFRFFFLFLRLRFLFRFLRLR", "LFLFFLLFRLFLRRLRLRLRFLRRFLRLFFRFFLRFFLFLFFLRFLRLRL", "FLLFRFRLFRFFFFFLRRRFLFLRFFLRFLLFFLRFLRLRLRLRLFFLRR"};
    assertEquals(109, _calc.timeToDeliver(path));
  }

  @Test
  public void case116() {
    String[] path = {"LLFLFRLRRLRFFLRRRRFFFLRFFRRRLLFLFLLRLRFFLFRRFFFLFL", "RLFFRRLRLRRFFFLLLRFRLLRFFLFRLFRRFRRRFRLRLRLFFLLFLF", "FRFLRFRRLLLRFFRRRLRFLFRRFLFFRLFLFLFRLLLLFRLLRFLLLF", "FFLFRFRRFLLFFLLLFFRLLFLRRFRLFFFRRFFFLLRFFLRFRRRLLR", "FFFRRLLFLLRLFRRLRLLFFFLFLRFFRLRLLFLRLFFLLFFLLFFFRR", "LRFRRFLRRLRRLRFFFLLLLRRLRFFLFRFFRLLRFLFRRFLFLFFLFR", "RFRRLRRFLFFFLLRFLFRRFRFLRLRLLLLFLFFFLFRLLRFRLFRLFR", "LLFLFRLFFFFFFFRRLRLRLLRFLRLRRRRRRRRLFLFLFLRFLFRLFF", "RLFRRLLRRRRFFFRRRLLLLRRLFFLLLLLRFFFFRFRRLRRRFFFLLF", "FFFFLRRLRFLLRRLRLRFRRRRLFLLRFLRRFFFRFRLFFRLLFFRRLL"};
    assertEquals(169, _calc.timeToDeliver(path));
  }

  @Test
  public void case117() {
    String[] path = {"FFFFFFFFFFFFFFFFFFFF"};
    assertEquals(44, _calc.timeToDeliver(path));
  }

  @Test
  public void case118() {
    String[] path = {"FLFLFFRFFLRLRFLRFLRLLLFLRLFLFRFRRFFFLFLRLFLFLLFLFL", "RFFLFFLRFRLFRFFFRFRFRFRFLFLRFLFRLFLFLLFRFLFLFLFLRL", "FRLFFFFRFFLFFFFRLLRLFFLLFRLFFLRFLRLRFRFRLLFLRLFRFF", "LRLRLRFLRRFLFFLFFLFRFLFLFLRFFFLLFRFRLFFLFFFLFRLLFL", "LRFFLRFRRFRLRFFFLLFRRFFFLFFFLLFLFFFRRFLFRFLFFFLRLF", "FLFRFLFRFFFLLFFLRLFLFLLFLLFFLRRLRLFLFFFLRRFLLFLRFF", "RFLRFLFRLFLLFRFLFFLFLFLRLLFRLFLRLFLFLFLFFRLRLFLFRL", "LRLLRFLFLFLRLLFRFLRLFFFFLFLRLLFFFFLFLRLFRFLFLRFLRF"};
    assertEquals(54, _calc.timeToDeliver(path));
  }

  @Test
  public void case119() {
    String[] path = {"FFFFRLLFLFRFFFLRLFFFRFFLRLLFFFFFL", "FFFFFFRLFFRLFFRFRFFFFLFFFFLRFFFLR", "FRLLLFRFRFFFFFFRLFFFFFFLRRFFFRLRL", "F"};
    assertEquals(218, _calc.timeToDeliver(path));
  }

  @Test
  public void case120() {
    String[] path = {"FFLRLFRRFRFFRLFRLRLRLRLRLFFRLRLRLFRLFRFFLLFFFFR", "RLFFLRLFRFFFLLFFFFFRFRLFLRLRFFFLFFFRFFFFFLFFFFF", "FFFRLRFFRFFFRFLRFFFLRFFFLRFFRLFFFFFFFRLFFFLRLRL", "RLFRLFFFRLRLRFLRLFFFFFFFRLFFFFRFFFRRFLFFFFFLLFF", "FFRLFFFFRFFLFFLFRLFFFFFFFFFFRFFFFFLFRLRRFFFLRLF", "LFRLFFFFFFFFFRFFFLRFFFFFFFRLFLFLRRFLFFFRFFFLLFF", "RFFLFFRFFRFFFFFFFRFFFRFLFFLRFFRLFFFFFFFLFFLFFLR", "FFFFRFFFFFRLFFFFLFFLRFFFLFFFFFFFFLFLFFRRLRLRLRF", "FFRFLFFFLRFFLRLLFRLRLRFFFRFFFFRFRRFLLFFFFRLRLRF", "FFFFFRRFFFRLLFFFFFLRFRFFFFR"};
    assertEquals(988, _calc.timeToDeliver(path));
  }

  @Test
  public void case121() {
    String[] path = {"FLRRFFFFFRLFLRFFFLRFFRR", "RFLRLRFFFRLFFRFLRLRFFFR", "RLRRFFFLRFRLFLFLFLLFFFF", "FFFFLLFFFLLFFRLFRLRRRFF", "RFRFF"};
    assertEquals(7, _calc.timeToDeliver(path));
  }

  @Test
  public void case122() {
    String[] path = {"RLRFLFRLLRFLFLRFFLFLFLFRLFLRFFRLLFLFLFLF", "LFLFRLLFLRLLFRFFLLFLFFRFRFRLRFLRFLFLFFLL"};
    assertEquals(44, _calc.timeToDeliver(path));
  }

  @Test
  public void case123() {
    String[] path = {"F"};
    assertEquals(4, _calc.timeToDeliver(path));
  }

  @Test
  public void case124() {
    String[] path = {"R"};
    assertEquals(0, _calc.timeToDeliver(path));
  }

  @Test
  public void case125() {
    String[] path = {"FFLFLLRLFLFLLFRLFLLFFRFF"};
    assertEquals(33, _calc.timeToDeliver(path));
  }

  @Test
  public void case126() {
    String[] path = {"FFLFLFRF"};
    assertEquals(29, _calc.timeToDeliver(path));
  }

  @Test
  public void case127() {
    String[] path = {"FFFFFFF", "F", "F", "RRFFF", "F", "FFR", "RFFFFF", "FLLFFFFFFLLFFFFFFRRFFF", "F"};
    assertEquals(44, _calc.timeToDeliver(path));
  }

  @Test
  public void case128() {
    String[] path = {"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"};
    assertEquals(1004, _calc.timeToDeliver(path));
  }

  @Test
  public void case129() {
    String[] path = {"RRRFRFRFRFFRFRF"};
    assertEquals(52, _calc.timeToDeliver(path));
  }

  @Test 
  public void case130() {
    String[] path = {"RFRFLFLLFFLLFLLFF"};
    assertEquals(13, _calc.timeToDeliver(path));
  }

  @Test
  public void case131() {
    String[] path = {"RFLFFLFFFLFLFLFFFFLFLFLFLF", "LFLFLFLLFRFFLLFLFFRFRFRFFLFLFF"};
    assertEquals(44, _calc.timeToDeliver(path));
  }
}
