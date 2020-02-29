/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:04:10 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.annotation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationLocationCheck_ESTest extends AnnotationLocationCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      annotationLocationCheck0.setAllowSamelineSingleParameterlessAnnotation(false);
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn(154, 161).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(161, 161, 0).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn(161, 159).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST2).findFirstToken(anyInt());
      doReturn(0).when(detailAST2).getColumnNo();
      doReturn(detailAST1).when(detailAST2).getFirstChild();
      doReturn(159, 1036, 0, 0).when(detailAST2).getLineNo();
      doReturn(detailAST1).when(detailAST2).getNextSibling();
      doReturn(detailAST1, (DetailAST) null).when(detailAST2).getPreviousSibling();
      doReturn(159).when(detailAST2).getType();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST3).getColumnNo();
      doReturn(detailAST2).when(detailAST3).getFirstChild();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST3).when(detailAST4).findFirstToken(anyInt());
      doReturn(741).when(detailAST4).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      annotationLocationCheck0.getFileContents();
      annotationLocationCheck0.getDefaultTokens();
      annotationLocationCheck0.setAllowSamelineSingleParameterlessAnnotation(false);
      annotationLocationCheck0.setAllowSamelineSingleParameterlessAnnotation(true);
      annotationLocationCheck0.getMessages();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST2).findFirstToken(anyInt());
      doReturn(0).when(detailAST2).getColumnNo();
      doReturn((DetailAST) null).when(detailAST2).getFirstChild();
      doReturn(0, 0, 0).when(detailAST2).getLineNo();
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST2).getPreviousSibling();
      doReturn(159).when(detailAST2).getType();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST3).getColumnNo();
      doReturn(detailAST2).when(detailAST3).getFirstChild();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST3).when(detailAST4).findFirstToken(anyInt());
      doReturn(741).when(detailAST4).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(957).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getParent();
      doReturn(10).when(detailAST1).getType();
      annotationLocationCheck0.visitToken(detailAST1);
      assertNull(annotationLocationCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      annotationLocationCheck0.setAllowSamelineSingleParameterlessAnnotation(false);
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn(0, 0).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn(79, 2801).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(177, 1036).when(detailAST2).getLineNo();
      doReturn(detailAST1).when(detailAST2).getNextSibling();
      doReturn(1036, 79).when(detailAST2).getType();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn("annotation.location").when(detailAST3).getText();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST3).when(detailAST4).findFirstToken(anyInt());
      doReturn(detailAST2).when(detailAST4).getFirstChild();
      doReturn(1036, 1036, 2304).when(detailAST4).getLineNo();
      doReturn(detailAST2).when(detailAST4).getNextSibling();
      doReturn(detailAST2).when(detailAST4).getPreviousSibling();
      doReturn(159).when(detailAST4).getType();
      DetailAST detailAST5 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST5).getColumnNo();
      doReturn(detailAST4).when(detailAST5).getFirstChild();
      DetailAST detailAST6 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST5).when(detailAST6).findFirstToken(anyInt());
      doReturn(741).when(detailAST6).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn(0, 0).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn((-1622), (-557)).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST2).getLineNo();
      doReturn(detailAST1).when(detailAST2).getNextSibling();
      doReturn(5, 1036).when(detailAST2).getType();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST2).when(detailAST3).getFirstChild();
      doReturn(1036, 1036, 0).when(detailAST3).getLineNo();
      doReturn((DetailAST) null).when(detailAST3).getNextSibling();
      doReturn((DetailAST) null).when(detailAST3).getParent();
      doReturn(detailAST2, (DetailAST) null).when(detailAST3).getPreviousSibling();
      doReturn(159).when(detailAST3).getType();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST4).getColumnNo();
      doReturn(detailAST3).when(detailAST4).getFirstChild();
      DetailAST detailAST5 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST4).when(detailAST5).findFirstToken(anyInt());
      doReturn(741).when(detailAST5).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(detailAST0).getText();
      annotationLocationCheck0.setAllowSamelineMultipleAnnotations(true);
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).findFirstToken(anyInt());
      doReturn(159, 0).when(detailAST1).getColumnNo();
      doReturn((DetailAST) null).when(detailAST1).getFirstChild();
      doReturn(51, 15).when(detailAST1).getLineNo();
      doReturn((DetailAST) null).when(detailAST1).getPreviousSibling();
      doReturn(159).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(50).when(detailAST2).getColumnNo();
      doReturn(detailAST1).when(detailAST2).getFirstChild();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST2).when(detailAST3).findFirstToken(anyInt());
      doReturn(741).when(detailAST3).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn(154, 161).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(161).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn(161, 159).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(15).when(detailAST2).getLineNo();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST3).findFirstToken(anyInt());
      doReturn(3).when(detailAST3).getColumnNo();
      doReturn(detailAST1).when(detailAST3).getFirstChild();
      doReturn(159, 3, 15).when(detailAST3).getLineNo();
      doReturn(detailAST1, detailAST2).when(detailAST3).getPreviousSibling();
      doReturn(159).when(detailAST3).getType();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST4).getColumnNo();
      doReturn(detailAST3).when(detailAST4).getFirstChild();
      DetailAST detailAST5 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST4).when(detailAST5).findFirstToken(anyInt());
      doReturn(741).when(detailAST5).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((-1807), 160).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn(5, 1036).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn("annotation.location.alone").when(detailAST2).getText();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST2).when(detailAST3).findFirstToken(anyInt());
      doReturn(detailAST1).when(detailAST3).getFirstChild();
      doReturn(1036, 1036).when(detailAST3).getLineNo();
      doReturn(detailAST1).when(detailAST3).getPreviousSibling();
      doReturn(159).when(detailAST3).getType();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST4).getColumnNo();
      doReturn(detailAST3).when(detailAST4).getFirstChild();
      DetailAST detailAST5 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST4).when(detailAST5).findFirstToken(anyInt());
      doReturn(741).when(detailAST5).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST0).findFirstToken(anyInt());
      doReturn(0).when(detailAST0).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((-667)).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getParent();
      doReturn(10).when(detailAST1).getType();
      annotationLocationCheck0.visitToken(detailAST1);
      assertNull(annotationLocationCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(detailAST1).getColumnNo();
      doReturn((DetailAST) null).when(detailAST1).getFirstChild();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST1).when(detailAST2).findFirstToken(anyInt());
      doReturn(detailAST0).when(detailAST2).getParent();
      doReturn(10).when(detailAST2).getType();
      annotationLocationCheck0.visitToken(detailAST2);
      assertNull(annotationLocationCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      int[] intArray0 = annotationLocationCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {14, 15, 16, 155, 154, 9, 8, 10, 157, 161}, intArray0);
      assertEquals(10, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      int[] intArray0 = annotationLocationCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      annotationLocationCheck0.setAllowSamelineParameterizedAnnotation(false);
      assertEquals(SeverityLevel.ERROR, annotationLocationCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnnotationLocationCheck annotationLocationCheck0 = new AnnotationLocationCheck();
      annotationLocationCheck0.setAllowSamelineSingleParameterlessAnnotation(false);
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn(154, 161).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(161, 161).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn(161, 159).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST3).findFirstToken(anyInt());
      doReturn(0).when(detailAST3).getColumnNo();
      doReturn(detailAST1).when(detailAST3).getFirstChild();
      doReturn(159, 3, 15, 0).when(detailAST3).getLineNo();
      doReturn(detailAST1).when(detailAST3).getNextSibling();
      doReturn(detailAST1, (DetailAST) null).when(detailAST3).getPreviousSibling();
      doReturn(159).when(detailAST3).getType();
      DetailAST detailAST4 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(1036).when(detailAST4).getColumnNo();
      doReturn(detailAST3).when(detailAST4).getFirstChild();
      DetailAST detailAST5 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST4).when(detailAST5).findFirstToken(anyInt());
      doReturn(741).when(detailAST5).getType();
      // Undeclared exception!
      try { 
        annotationLocationCheck0.visitToken(detailAST5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationLocationCheck", e);
      }
  }
}