/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:01:18 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.header;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.ThreadModeSettings;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.header.HeaderCheck;
import com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.IllegalCharsetNameException;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractHeaderCheck_ESTest extends AbstractHeaderCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      List<String> list0 = regexpHeaderCheck0.getHeaderLines();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      ThreadModeSettings threadModeSettings0 = new ThreadModeSettings((-1), (-1));
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("header.missing", threadModeSettings0);
      regexpHeaderCheck0.configure(defaultConfiguration0);
      try { 
        regexpHeaderCheck0.setHeaderFile((URI) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // property 'headerFile' is missing or invalid in module header.missing
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      // Undeclared exception!
      try { 
        headerCheck0.setCharset("\\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \\n
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.setCharset((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      URI uRI0 = MockURI.aHttpURI;
      headerCheck0.setHeaderFile(uRI0);
      try { 
        headerCheck0.finishLocalSetup();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to load header file http://foo.bar
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      URI uRI0 = MockURI.aFTPURI;
      regexpHeaderCheck0.setHeaderFile(uRI0);
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.finishLocalSetup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      URI uRI0 = MockURI.create("header.missing");
      regexpHeaderCheck0.setHeaderFile(uRI0);
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.finishLocalSetup();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      headerCheck0.setHeader("unable to load header");
      // Undeclared exception!
      try { 
        headerCheck0.setHeader("net.sf.saxon.event.ComplexContentOutputter");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // header has already been set - set either header or headerFile, not both
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      Set<String> set0 = regexpHeaderCheck0.getExternalResourceLocations();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      URI uRI0 = MockURI.aHttpURI;
      regexpHeaderCheck0.setHeaderFile(uRI0);
      Set<String> set0 = regexpHeaderCheck0.getExternalResourceLocations();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      regexpHeaderCheck0.finishLocalSetup();
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      regexpHeaderCheck0.setHeader("\\n");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      headerCheck0.setHeader("");
      assertEquals(SeverityLevel.ERROR, headerCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      regexpHeaderCheck0.setHeader("x>DZ9p]R");
      URI uRI0 = MockURI.aFTPURI;
      regexpHeaderCheck0.setHeaderFile(uRI0);
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.finishLocalSetup();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // header has already been set - set either header or headerFile, not both
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      // Undeclared exception!
      try { 
        headerCheck0.setHeaderFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      try { 
        regexpHeaderCheck0.setCharset("header.mismatch");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // unsupported charset: 'header.mismatch'
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HeaderCheck headerCheck0 = new HeaderCheck();
      URI uRI0 = MockURI.aHttpURI;
      headerCheck0.setHeaderFile(uRI0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.bar");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "header.mismatch");
      headerCheck0.finishLocalSetup();
      assertNull(headerCheck0.getId());
  }
}