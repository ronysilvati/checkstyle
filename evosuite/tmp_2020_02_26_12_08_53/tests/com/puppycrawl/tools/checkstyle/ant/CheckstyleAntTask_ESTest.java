/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 15:43:45 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask;
import com.puppycrawl.tools.checkstyle.api.AuditListener;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckstyleAntTask_ESTest extends CheckstyleAntTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckstyleAntTask.FormatterType checkstyleAntTask_FormatterType0 = new CheckstyleAntTask.FormatterType();
      String[] stringArray0 = checkstyleAntTask_FormatterType0.getValues();
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask.Formatter checkstyleAntTask_Formatter0 = new CheckstyleAntTask.Formatter();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      String[] stringArray0 = new String[8];
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      // Undeclared exception!
      try { 
        checkstyleAntTask0.setFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask.Formatter checkstyleAntTask_Formatter0 = new CheckstyleAntTask.Formatter();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      checkstyleAntTask_Formatter0.setUseFile(false);
      checkstyleAntTask_Formatter0.setTofile(file0);
      AuditListener auditListener0 = checkstyleAntTask_Formatter0.createListener(checkstyleAntTask0);
      assertNotNull(auditListener0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask.Formatter checkstyleAntTask_Formatter0 = new CheckstyleAntTask.Formatter();
      CheckstyleAntTask.FormatterType checkstyleAntTask_FormatterType0 = new CheckstyleAntTask.FormatterType();
      checkstyleAntTask_Formatter0.setType(checkstyleAntTask_FormatterType0);
      AuditListener auditListener0 = checkstyleAntTask_Formatter0.createListener(checkstyleAntTask0);
      assertNotNull(auditListener0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      List<File> list0 = checkstyleAntTask0.scanFileSets();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      // Undeclared exception!
      try { 
        checkstyleAntTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Must specify at least one of 'file' or nested 'fileset' or 'path'.
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setConfig("/G)XqFd4ujz<U}Wt,");
      // Undeclared exception!
      try { 
        checkstyleAntTask0.setConfig("");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Attribute 'config' has already been set
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setConfig("GaJ");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("o~:9{&}mK\"{nb>Ob;M=").when(file0).getAbsolutePath();
      checkstyleAntTask0.setFile(file0);
      // Undeclared exception!
      try { 
        checkstyleAntTask0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      org.apache.tools.ant.types.Path path0 = checkstyleAntTask0.createClasspath();
      org.apache.tools.ant.types.Path path1 = checkstyleAntTask0.createClasspath();
      assertFalse(path1.equals((Object)path0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask checkstyleAntTask1 = new CheckstyleAntTask();
      org.apache.tools.ant.types.Path path0 = checkstyleAntTask1.createClasspath();
      checkstyleAntTask0.setClasspath(path0);
      assertFalse(checkstyleAntTask0.equals((Object)checkstyleAntTask1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      org.apache.tools.ant.types.Path path0 = checkstyleAntTask0.createClasspath();
      checkstyleAntTask0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask.Property checkstyleAntTask_Property0 = new CheckstyleAntTask.Property();
      checkstyleAntTask0.addProperty(checkstyleAntTask_Property0);
      assertNull(checkstyleAntTask_Property0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("o~:9{&}mK\"{nb>Ob;M=").when(file0).getAbsolutePath();
      checkstyleAntTask0.setFile(file0);
      // Undeclared exception!
      try { 
        checkstyleAntTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Must specify 'config'.
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      CheckstyleAntTask.Formatter checkstyleAntTask_Formatter0 = new CheckstyleAntTask.Formatter();
      checkstyleAntTask0.addFormatter(checkstyleAntTask_Formatter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setExecuteIgnoredModules(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      org.apache.tools.ant.types.Path path0 = checkstyleAntTask0.createClasspath();
      checkstyleAntTask0.addPath(path0);
      // Undeclared exception!
      try { 
        checkstyleAntTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Must specify 'config'.
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      checkstyleAntTask0.setClasspathRef(reference0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setMaxErrors(4857);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setFailOnViolation(true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn((DirectoryScanner) null).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      checkstyleAntTask0.addFileset(fileSet0);
      // Undeclared exception!
      try { 
        checkstyleAntTask0.scanFileSets();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setMaxWarnings(361);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      checkstyleAntTask0.addFileset(fileSet0);
      // Undeclared exception!
      try { 
        checkstyleAntTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Must specify 'config'.
         //
         verifyException("com.puppycrawl.tools.checkstyle.ant.CheckstyleAntTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      checkstyleAntTask0.setProperties(file0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckstyleAntTask checkstyleAntTask0 = new CheckstyleAntTask();
      checkstyleAntTask0.setFailureProperty("]>}");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckstyleAntTask.Listener checkstyleAntTask_Listener0 = new CheckstyleAntTask.Listener();
      String string0 = checkstyleAntTask_Listener0.getClassname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckstyleAntTask.Listener checkstyleAntTask_Listener0 = new CheckstyleAntTask.Listener();
      checkstyleAntTask_Listener0.setClassname("^Y;R");
      assertEquals("^Y;R", checkstyleAntTask_Listener0.getClassname());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckstyleAntTask.Property checkstyleAntTask_Property0 = new CheckstyleAntTask.Property();
      String string0 = checkstyleAntTask_Property0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckstyleAntTask.Property checkstyleAntTask_Property0 = new CheckstyleAntTask.Property();
      checkstyleAntTask_Property0.setKey((String) null);
      assertNull(checkstyleAntTask_Property0.getKey());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckstyleAntTask.Property checkstyleAntTask_Property0 = new CheckstyleAntTask.Property();
      checkstyleAntTask_Property0.setValue((String) null);
      assertNull(checkstyleAntTask_Property0.getValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckstyleAntTask.Property checkstyleAntTask_Property0 = new CheckstyleAntTask.Property();
      String string0 = checkstyleAntTask_Property0.getKey();
      assertNull(string0);
  }
}
