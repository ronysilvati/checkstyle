/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:41:45 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.imports;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.checks.imports.AbstractImportControl;
import com.puppycrawl.tools.checkstyle.checks.imports.ClassImportRule;
import com.puppycrawl.tools.checkstyle.checks.imports.FileImportControl;
import com.puppycrawl.tools.checkstyle.checks.imports.MismatchStrategy;
import com.puppycrawl.tools.checkstyle.checks.imports.PkgImportControl;
import com.puppycrawl.tools.checkstyle.checks.imports.PkgImportRule;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PkgImportControl_ESTest extends PkgImportControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "VB$|u>rA1N.}U-]l&";
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl("VB$|u>rA1N.}U-]l&", true, mismatchStrategy0);
      String string1 = "w-(4yUsHZ";
      PkgImportControl pkgImportControl1 = null;
      try {
        pkgImportControl1 = new PkgImportControl(pkgImportControl0, "w-(4yUsHZ", true, mismatchStrategy0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 49\r
         // (?:(?:VB$|u>rA1N.}U-]l&))\\.(?:w-(4yUsHZ)(?:\\..*)?
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PkgImportControl pkgImportControl0 = null;
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DISALLOWED;
      PkgImportControl pkgImportControl1 = null;
      try {
        pkgImportControl1 = new PkgImportControl((PkgImportControl) null, "", true, mismatchStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.imports.PkgImportControl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "rCb-`O7LU(mQ_";
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DISALLOWED;
      PkgImportControl pkgImportControl0 = null;
      try {
        pkgImportControl0 = new PkgImportControl("rCb-`O7LU(mQ_", true, mismatchStrategy0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 26\r
         // (?:rCb-`O7LU(mQ_)(?:\\..*)?
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = true;
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl((String) null, true, mismatchStrategy0);
      // Undeclared exception!
      try { 
        pkgImportControl0.matchesExactly((String) null, "ngS<;fqQ`T7l");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "TP0+5&\\d^Sngc";
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl("TP0+5&d^Sngc", false, mismatchStrategy0);
      String string1 = "";
      PkgImportControl pkgImportControl1 = new PkgImportControl(pkgImportControl0, "", false, mismatchStrategy0);
      String string2 = null;
      // Undeclared exception!
      try { 
        pkgImportControl1.locateFinest((String) null, "TP0+5&d^Sngc");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DISALLOWED;
      PkgImportControl pkgImportControl0 = new PkgImportControl("", false, mismatchStrategy0);
      PkgImportControl pkgImportControl1 = new PkgImportControl(pkgImportControl0, "(?:", false, mismatchStrategy0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.ALLOWED;
      PkgImportControl pkgImportControl0 = new PkgImportControl(")", false, mismatchStrategy0);
      pkgImportControl0.matchesExactly(")", ")");
      pkgImportControl0.checkAccess("&L/ws", "&L/ws", ")");
      PkgImportRule pkgImportRule0 = new PkgImportRule(false, true, (String) null, false, true);
      pkgImportControl0.addImportRule(pkgImportRule0);
      pkgImportControl0.addImportRule(pkgImportRule0);
      pkgImportControl0.checkAccess("~WuA3so)~X(}b", (String) null, ";o+tw*V!*h(R");
      AbstractImportControl abstractImportControl0 = pkgImportControl0.locateFinest(")", "");
      pkgImportControl0.locateFinest(")", ")");
      pkgImportControl0.locateFinest("W>)Dtee", "fF.fF.fF^");
      pkgImportControl0.locateFinest("(?:..*)?", ".");
      pkgImportControl0.locateFinest("W>)Dtee", "-*\"#&");
      pkgImportControl0.locateFinest("P!H+B", (String) null);
      pkgImportControl0.locateFinest("q|Iv[~$H{PFV!", "~WuA3so)~X(}b");
      pkgImportControl0.locateFinest("q|Iv[~$H{PFV!", "(?:..*)?");
      pkgImportControl0.locateFinest("rW@KPj&<", "q|Iv[~$H{PFV!");
      abstractImportControl0.locateFinest("q|Iv[~$H{PFV!", "ALLOWED");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DISALLOWED;
      PkgImportControl pkgImportControl0 = new PkgImportControl("5xV", false, mismatchStrategy0);
      pkgImportControl0.checkAccess("7A;[", "7A;[", "5xV");
      PkgImportControl pkgImportControl1 = new PkgImportControl(pkgImportControl0, "5xV", false, mismatchStrategy0);
      pkgImportControl1.matchesExactly("5xV", "\"");
      pkgImportControl1.locateFinest("", "7A;[");
      pkgImportControl1.matchesExactly("", "5xV");
      pkgImportControl1.matchesExactly("5xV", "");
      String string0 = null;
      // Undeclared exception!
      try { 
        pkgImportControl1.locateFinest((String) null, "it!HqnQzOhGS9S%j");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl("", false, mismatchStrategy0);
      pkgImportControl0.matchesExactly("", "");
      String string0 = "com.puppycrawl.tools.checkstyle.checks.imports.AccessResult";
      pkgImportControl0.matchesExactly("", "com.puppycrawl.tools.checkstyle.checks.imports.AccessResult");
      pkgImportControl0.matchesExactly("q7u$ab|F\"|TFB", "q7u$ab|F\"|TFB");
      PkgImportControl pkgImportControl1 = new PkgImportControl(pkgImportControl0, "q7u$ab|F\"|TFB", true, mismatchStrategy0);
      pkgImportControl1.matchesExactly("", "com.puppycrawl.tools.checkstyle.checks.imports.AbstractImportRule");
      pkgImportControl0.matchesExactly("(WO\"2)7K", "nR");
      pkgImportControl0.locateFinest("com.puppycrawl.tools.checkstyle.checks.imports.AbstractImportRule", "nR");
      String string1 = "nFbMN";
      pkgImportControl0.locateFinest("2$-c0/NRq~^N", "nFbMN");
      AbstractImportControl abstractImportControl0 = pkgImportControl0.locateFinest(".", "2$-c0/NRq~^N");
      pkgImportControl1.locateFinest("(?:..*)?", "@:pE6&'/saT}]8&");
      pkgImportControl1.matchesExactly("2$-c0/NRq~^N", "pNGe<aw_2)N'x");
      pkgImportControl0.locateFinest("&L\"z@Tlm&E", "2$-c0/NRq~^N");
      pkgImportControl0.addChild(abstractImportControl0);
      // Undeclared exception!
      try { 
        pkgImportControl1.matchesExactly((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "Y";
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.ALLOWED;
      PkgImportControl pkgImportControl0 = new PkgImportControl("Y", false, mismatchStrategy0);
      FileImportControl fileImportControl0 = new FileImportControl(pkgImportControl0, "Y", false);
      pkgImportControl0.addChild(fileImportControl0);
      ClassImportRule classImportRule0 = new ClassImportRule(false, false, "[kO?H^~,R(eyWd", false);
      String string1 = "3/Mo+5^pxrDo";
      pkgImportControl0.locateFinest("[kO?H^~,R(eyWd", "3/Mo+5^pxrDo");
      pkgImportControl0.addImportRule(classImportRule0);
      fileImportControl0.addImportRule(classImportRule0);
      fileImportControl0.locateFinest("tj[kU 2_FP8(9", "");
      pkgImportControl0.addChild((AbstractImportControl) null);
      String string2 = "HK%";
      String string3 = "MmJ2ph1zwz{P ;YGuYh";
      pkgImportControl0.locateFinest("HK%", "MmJ2ph1zwz{P ;YGuYh");
      pkgImportControl0.matchesExactly("HK%", "");
      String string4 = "y7!fS8[98}rG%";
      // Undeclared exception!
      try { 
        pkgImportControl0.locateFinest("Y", "y7!fS8[98}rG%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.imports.PkgImportControl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl("Ej,GW.%DLWtCAL6", true, mismatchStrategy0);
      MismatchStrategy mismatchStrategy1 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl1 = null;
      try {
        pkgImportControl1 = new PkgImportControl(pkgImportControl0, "F=uU Z_90o=)Y", false, mismatchStrategy1);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 35\r
         // (?:(?:Ej,GW.%DLWtCAL6))\\.F=uU Z_90o=)Y(?:\\..*)?\r
         //                                    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "^g~.!h,(yC%OOVE+@(";
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = null;
      try {
        pkgImportControl0 = new PkgImportControl("^g~.!h,(yC%OOVE+@(", true, mismatchStrategy0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 31\r
         // (?:^g~.!h,(yC%OOVE+@()(?:\\..*)?
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DELEGATE_TO_PARENT;
      PkgImportControl pkgImportControl0 = new PkgImportControl("j1RAnr!", true, mismatchStrategy0);
      MismatchStrategy mismatchStrategy1 = MismatchStrategy.ALLOWED;
      PkgImportControl pkgImportControl1 = new PkgImportControl("j1RAnr!", true, mismatchStrategy1);
      pkgImportControl1.addChild(pkgImportControl0);
      pkgImportControl1.matchesExactly("", ")");
      AbstractImportControl abstractImportControl0 = pkgImportControl1.locateFinest("", (String) null);
      assertNotNull(abstractImportControl0);
      
      ClassImportRule classImportRule0 = new ClassImportRule(false, true, (String) null, true);
      pkgImportControl0.addImportRule(classImportRule0);
      pkgImportControl0.addChild(pkgImportControl1);
      boolean boolean0 = pkgImportControl0.matchesExactly("", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MismatchStrategy mismatchStrategy0 = MismatchStrategy.DISALLOWED;
      PkgImportControl pkgImportControl0 = new PkgImportControl("", false, mismatchStrategy0);
      PkgImportRule pkgImportRule0 = new PkgImportRule(false, true, "", false, false);
      pkgImportControl0.addImportRule(pkgImportRule0);
      pkgImportControl0.matchesExactly("(?:..*)?", "com.puppycrawl.tools.checkstyle.checks.imports.AbstractImportControl");
      AbstractImportControl abstractImportControl0 = pkgImportControl0.locateFinest("DISALLOWED", "DISALLOWED");
      assertNull(abstractImportControl0);
  }
}