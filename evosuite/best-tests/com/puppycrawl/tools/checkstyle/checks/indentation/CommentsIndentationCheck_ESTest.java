/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 15:14:18 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DetailAstImpl;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.checks.indentation.CommentsIndentationCheck;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommentsIndentationCheck_ESTest extends CommentsIndentationCheck_ESTest_scaffolding {

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Não
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Basicamente o teste em questão, determina se
   * a verificação de identação de comentários está funcionando
   * corretamente. Não foi possível aprofundar nos detalhes do
   * funcionamento.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommentsIndentationCheck commentsIndentationCheck0 = new CommentsIndentationCheck();
      MockFile mockFile0 = new MockFile("comments.indentation.block", "");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FileText fileText0 = new FileText(mockFile0, linkedList0);
      FileContents fileContents0 = new FileContents(fileText0);
      commentsIndentationCheck0.setFileContents(fileContents0);
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      detailAstImpl0.initialize(145, "comments.indentation.block");
      // Undeclared exception!
      try { 
        commentsIndentationCheck0.visitToken(detailAstImpl0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483647
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Não
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Basicamente o teste em questão, determina se
   * a verificação de identação de comentários está funcionando
   * corretamente. Não foi possível aprofundar nos detalhes do
   * funcionamento e determinar o ponto responsável por gerar
   * a NullPointerException
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommentsIndentationCheck commentsIndentationCheck0 = new CommentsIndentationCheck();
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      detailAstImpl0.initialize(145, "comments.indentation.block");
      // Undeclared exception!
      try { 
        commentsIndentationCheck0.visitToken(detailAstImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Não
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Basicamente o teste em questão, determina se
   * a verificação de identação de comentários está funcionando
   * corretamente. Não foi possível aprofundar nos detalhes do
   * funcionamento e determinar o ponto responsável por gerar
   * a IllegalArgumentException
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommentsIndentationCheck commentsIndentationCheck0 = new CommentsIndentationCheck();
      DetailAstImpl detailAstImpl0 = new DetailAstImpl();
      // Undeclared exception!
      try { 
        commentsIndentationCheck0.visitToken(detailAstImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected token type: null
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.CommentsIndentationCheck", e);
      }
  }
}