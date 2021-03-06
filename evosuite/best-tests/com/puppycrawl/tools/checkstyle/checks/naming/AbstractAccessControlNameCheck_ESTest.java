/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:37:22 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.naming;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DetailAstImpl;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.naming.MethodNameCheck;
import com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck;
import com.puppycrawl.tools.checkstyle.checks.naming.TypeNameCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractAccessControlNameCheck_ESTest extends AbstractAccessControlNameCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeNameCheck typeNameCheck0 = new TypeNameCheck();
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      assertNotNull(typeNameCheck0);
      
      // Undeclared exception!
      try { 
        typeNameCheck0.shouldCheckInScope((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.naming.AbstractAccessControlNameCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      assertFalse(detailAstImpl0.hasChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertNull(detailAstImpl0.getText());
      assertEquals(0, detailAstImpl0.getType());
      assertNotNull(detailAstImpl0);
      
      TypeNameCheck typeNameCheck0 = new TypeNameCheck();
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      assertNotNull(typeNameCheck0);
      
      typeNameCheck0.setApplyToPackage(false);
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      
      typeNameCheck0.setApplyToPrivate(false);
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      
      boolean boolean0 = typeNameCheck0.shouldCheckInScope(detailAstImpl0);
      assertFalse(boolean0);
      assertFalse(detailAstImpl0.hasChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertNull(detailAstImpl0.getText());
      assertEquals(0, detailAstImpl0.getType());
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getType());
      assertEquals(0, detailAstImpl0.getColumn());
      assertFalse(detailAstImpl0.hasChildren());
      assertNull(detailAstImpl0.getText());
      assertNotNull(detailAstImpl0);
      
      TypeNameCheck typeNameCheck0 = new TypeNameCheck();
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      assertNotNull(typeNameCheck0);
      
      typeNameCheck0.setApplyToPackage(false);
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
      
      boolean boolean0 = typeNameCheck0.shouldCheckInScope(detailAstImpl0);
      assertFalse(boolean0);
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getType());
      assertEquals(0, detailAstImpl0.getColumn());
      assertFalse(detailAstImpl0.hasChildren());
      assertNull(detailAstImpl0.getText());
      assertEquals(SeverityLevel.ERROR, typeNameCheck0.getSeverityLevel());
      assertFalse(typeNameCheck0.isCommentNodesRequired());
      assertNull(typeNameCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StaticVariableNameCheck staticVariableNameCheck0 = new StaticVariableNameCheck();
      assertNull(staticVariableNameCheck0.getId());
      assertFalse(staticVariableNameCheck0.isCommentNodesRequired());
      assertEquals(SeverityLevel.ERROR, staticVariableNameCheck0.getSeverityLevel());
      assertNotNull(staticVariableNameCheck0);
      
      staticVariableNameCheck0.setApplyToProtected(false);
      assertNull(staticVariableNameCheck0.getId());
      assertFalse(staticVariableNameCheck0.isCommentNodesRequired());
      assertEquals(SeverityLevel.ERROR, staticVariableNameCheck0.getSeverityLevel());
      
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getType());
      assertFalse(detailAstImpl0.hasChildren());
      assertNull(detailAstImpl0.getText());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertNotNull(detailAstImpl0);
      
      boolean boolean0 = staticVariableNameCheck0.shouldCheckInScope(detailAstImpl0);
      assertTrue(boolean0);
      assertNull(staticVariableNameCheck0.getId());
      assertFalse(staticVariableNameCheck0.isCommentNodesRequired());
      assertEquals(SeverityLevel.ERROR, staticVariableNameCheck0.getSeverityLevel());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getType());
      assertFalse(detailAstImpl0.hasChildren());
      assertNull(detailAstImpl0.getText());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MethodNameCheck methodNameCheck0 = new MethodNameCheck();
      assertEquals(SeverityLevel.ERROR, methodNameCheck0.getSeverityLevel());
      assertFalse(methodNameCheck0.isCommentNodesRequired());
      assertNull(methodNameCheck0.getId());
      assertNotNull(methodNameCheck0);
      
      methodNameCheck0.setApplyToPublic(false);
      assertEquals(SeverityLevel.ERROR, methodNameCheck0.getSeverityLevel());
      assertFalse(methodNameCheck0.isCommentNodesRequired());
      assertNull(methodNameCheck0.getId());
      
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      assertFalse(detailAstImpl0.hasChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertEquals(0, detailAstImpl0.getType());
      assertNull(detailAstImpl0.getText());
      assertNotNull(detailAstImpl0);
      
      boolean boolean0 = methodNameCheck0.shouldCheckInScope(detailAstImpl0);
      assertTrue(boolean0);
      assertEquals(SeverityLevel.ERROR, methodNameCheck0.getSeverityLevel());
      assertFalse(methodNameCheck0.isCommentNodesRequired());
      assertNull(methodNameCheck0.getId());
      assertFalse(detailAstImpl0.hasChildren());
      assertEquals(0, detailAstImpl0.getLine());
      assertEquals(0, detailAstImpl0.getColumn());
      assertEquals(0, detailAstImpl0.getNumberOfChildren());
      assertEquals(0, detailAstImpl0.getType());
      assertNull(detailAstImpl0.getText());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MethodNameCheck methodNameCheck0 = new MethodNameCheck();
      assertEquals(SeverityLevel.ERROR, methodNameCheck0.getSeverityLevel());
      assertFalse(methodNameCheck0.isCommentNodesRequired());
      assertNull(methodNameCheck0.getId());
      assertNotNull(methodNameCheck0);
      
      // Undeclared exception!
      try { 
        methodNameCheck0.mustCheckName((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.naming.AbstractAccessControlNameCheck", e);
      }
  }
}
