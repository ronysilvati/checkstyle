/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 18:35:16 GMT 2020
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.AstTreeStringPrinter;
import com.puppycrawl.tools.checkstyle.JavaParser;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileText;
import java.io.File;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstTreeStringPrinter_ESTest extends AstTreeStringPrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(10009).when(detailAST1).getColumnNo();
      doReturn((-166)).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST1).getParent();
      doReturn("?>").when(detailAST1).getText();
      doReturn(66).when(detailAST1).getType();
      String string0 = AstTreeStringPrinter.printBranch(detailAST1);
      assertEquals("LITERAL_NATIVE -> ?> [-166:10009]\r\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      doReturn((String) null).when(file0).getPath();
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(file1).getAbsoluteFile();
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree(file1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // null (No such file or directory)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      doReturn((String) null).when(file0).getPath();
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(file1).getAbsoluteFile();
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      try { 
        AstTreeStringPrinter.printFileAst(file1, javaParser_Options0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // null (No such file or directory)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn((DetailAST) null, detailAST0, (DetailAST) null).when(detailAST1).getParent();
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printBranch(detailAST1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.AstTreeStringPrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST0).getNextSibling();
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST0).getParent();
      doReturn((-2668)).when(detailAST0).getType();
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST0).when(detailAST1).getParent();
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printBranch(detailAST1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2668
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.TokenUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = AstTreeStringPrinter.printBranch((DetailAST) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DetailAST detailAST0 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      DetailAST detailAST1 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(detailAST1).getColumnNo();
      doReturn(0).when(detailAST1).getLineNo();
      doReturn(detailAST0).when(detailAST1).getNextSibling();
      doReturn((DetailAST) null, (DetailAST) null).when(detailAST1).getParent();
      doReturn("\r").when(detailAST1).getText();
      doReturn(66).when(detailAST1).getType();
      DetailAST detailAST2 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn((DetailAST) null).when(detailAST2).getNextSibling();
      doReturn(detailAST1, (DetailAST) null).when(detailAST2).getParent();
      doReturn(0).when(detailAST2).getType();
      DetailAST detailAST3 = mock(DetailAST.class, new ViolatedAssumptionAnswer());
      doReturn(detailAST2).when(detailAST3).getParent();
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printBranch(detailAST3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // given id 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.TokenUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(file0).getAbsoluteFile();
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(file0).getAbsoluteFile();
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printFileAst(file0, javaParser_Options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FileText fileText0 = mock(FileText.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileText0).getFile();
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printAst(fileText0, javaParser_Options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileContents", e);
      }
  }
}
