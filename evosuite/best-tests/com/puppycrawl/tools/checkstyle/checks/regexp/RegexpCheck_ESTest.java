/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:03:03 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.DetailAstImpl;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.regexp.RegexpCheck;
import java.io.File;
import java.util.Vector;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegexpCheck_ESTest extends RegexpCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setDuplicateLimit((-488));
      assertNull(regexpCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      RegexpCheck regexpCheck0 = new RegexpCheck();
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("illegal.regexp");
      regexpCheck0.configure(defaultConfiguration0);
      File file0 = MockFile.createTempFile("required.regexp", "");
      Vector<String> vector0 = new Vector<String>();
      FileText fileText0 = new FileText(file0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      regexpCheck0.setFileContents(fileContents0);
      regexpCheck0.beginTree(detailAstImpl0);
      assertEquals(0, detailAstImpl0.getType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      // Undeclared exception!
      try { 
        regexpCheck0.setFormat((Pattern) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.regexp.RegexpCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      Pattern pattern0 = Pattern.compile("1qoA `OWmm_/`MPND(a", (-1));
      // Undeclared exception!
      try { 
        regexpCheck0.setFormat(pattern0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to initialise regular expression 1qoA `OWmm_/`MPND(a
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.CommonUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      int[] intArray0 = regexpCheck0.getRequiredTokens();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      RegexpCheck regexpCheck0 = new RegexpCheck();
      File file0 = MockFile.createTempFile("required.regexp", "");
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      FileText fileText0 = new FileText(file0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      regexpCheck0.setFileContents(fileContents0);
      regexpCheck0.beginTree(detailAstImpl0);
      assertEquals(0, detailAstImpl0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      RegexpCheck regexpCheck0 = new RegexpCheck();
      File file0 = MockFile.createTempFile("required.regexp", "required.regexp");
      Vector<String> vector0 = new Vector<String>();
      FileText fileText0 = new FileText(file0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      regexpCheck0.setFileContents(fileContents0);
      // Undeclared exception!
      try { 
        regexpCheck0.beginTree(detailAstImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setDuplicateLimit(2550);
      assertFalse(regexpCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setDuplicateLimit((-1));
      assertEquals(SeverityLevel.ERROR, regexpCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setMessage((String) null);
      assertEquals(SeverityLevel.ERROR, regexpCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setMessage("required.regexp");
      assertEquals(SeverityLevel.ERROR, regexpCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      int[] intArray0 = regexpCheck0.getAcceptableTokens();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setIllegalPattern(true);
      assertFalse(regexpCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      Pattern pattern0 = Pattern.compile("illegal.regexp");
      regexpCheck0.setFormat(pattern0);
      assertFalse(regexpCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setErrorLimit((-1));
      assertEquals(SeverityLevel.ERROR, regexpCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      regexpCheck0.setIgnoreComments(true);
      assertFalse(regexpCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegexpCheck regexpCheck0 = new RegexpCheck();
      int[] intArray0 = regexpCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {}, intArray0);
  }
}
