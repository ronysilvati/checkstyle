/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:07:51 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AvoidEscapedUnicodeCharactersCheck_ESTest extends AvoidEscapedUnicodeCharactersCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(detailAST0).getLineNo();
      doReturn("\\u0000|\\u0009|\\u000[bB]|\\u000[cC]|\\|0020|\\u007[fF]|\\u0085|\\u009[fF]|\\u00[aA]0|\\u00[aA][dD]|\\u04[fF]9|\\u05[bB][eE]|\\u05[dD]0|\\u05[eE][aA]|\\u05[fF]3|\\u05[fF]4|\\u0600|\\u0604|\\u061[cC]|\\u06[dD]{2}|\\u06[fF]{2}|\\u070[fF]|\\u0750|\\u077[fF]|\\u0[eE]00|\\u0[eE]7[fF]|\\u1680|\\u180[eE]|\\u1[eE]00|\\u2000|\\u2001|\\u2002|\\u2003|\\u2004|\\u2005|\\u2006|\\u2007|\\u2008|\\u2009|\\u200[aA]|\\u200[fF]|\\u2025|\\u2028|\\u2029|\\u202[fF]|\\u205[fF]|\\u2064|\\u2066|\\u2067|\\u2068|\\u2069|\\u206[aA]|\\u206[fF]|\\u20[aA][fF]|\\u2100|\\u213[aA]|\\u3000|\\u[dD]800|\\u[fF]8[fF]{2}|\\u[fF][bB]50|\\u[fF][dD][fF]{2}|\\u[fF][eE]70|\\u[fF][eE][fF]{2}|\\u[fF]{2}0[eE]|\\u[fF]{2}61|\\u[fF]{2}[dD][cC]|\\u[fF]{3}9|\\u[fF]{3}[aA]|\\u[fF]{3}[bB]|\\u[fF]{4}").when(detailAST0).getText();
      // Undeclared exception!
      try { 
        avoidEscapedUnicodeCharactersCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowNonPrintableEscapes(true);
      assertEquals(SeverityLevel.ERROR, avoidEscapedUnicodeCharactersCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowIfAllCharactersEscaped(true);
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(detailAST0).getLineNo();
      doReturn("\\u0000|\\u0009|\\u000[bB]|\\u000[cC]|\\|0020|\\u007[fF]|\\u0085|\\u009[fF]|\\u00[aA]0|\\u00[aA][dD]|\\u04[fF]9|\\u05[bB][eE]|\\u05[dD]0|\\u05[eE][aA]|\\u05[fF]3|\\u05[fF]4|\\u0600|\\u0604|\\u061[cC]|\\u06[dD]{2}|\\u06[fF]{2}|\\u070[fF]|\\u0750|\\u077[fF]|\\u0[eE]00|\\u0[eE]7[fF]|\\u1680|\\u180[eE]|\\u1[eE]00|\\u2000|\\u2001|\\u2002|\\u2003|\\u2004|\\u2005|\\u2006|\\u2007|\\u2008|\\u2009|\\u200[aA]|\\u200[fF]|\\u2025|\\u2028|\\u2029|\\u202[fF]|\\u205[fF]|\\u2064|\\u2066|\\u2067|\\u2068|\\u2069|\\u206[aA]|\\u206[fF]|\\u20[aA][fF]|\\u2100|\\u213[aA]|\\u3000|\\u[dD]800|\\u[fF]8[fF]{2}|\\u[fF][bB]50|\\u[fF][dD][fF]{2}|\\u[fF][eE]70|\\u[fF][eE][fF]{2}|\\u[fF]{2}0[eE]|\\u[fF]{2}61|\\u[fF]{2}[dD][cC]|\\u[fF]{3}9|\\u[fF]{3}[aA]|\\u[fF]{3}[bB]|\\u[fF]{4}").when(detailAST0).getText();
      // Undeclared exception!
      try { 
        avoidEscapedUnicodeCharactersCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn("forbid.escaped.unicode.char").when(detailAST0).getText();
      avoidEscapedUnicodeCharactersCheck0.visitToken(detailAST0);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        avoidEscapedUnicodeCharactersCheck0.beginTree(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowByTailComment(true);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowEscapesForControlCharacters(true);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }
}