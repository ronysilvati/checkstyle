/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 15:59:33 GMT 2020
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.PropertyCacheFile;
import com.puppycrawl.tools.checkstyle.api.Configuration;
import java.nio.file.AccessDeniedException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyCacheFile_ESTest extends PropertyCacheFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "87R >WL;!TC,GAy");
      propertyCacheFile0.load();
      propertyCacheFile0.reset();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("5&kW]~C,*]");
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(defaultConfiguration0, "5&kW]~C,*]");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      // Undeclared exception!
      try { 
        propertyCacheFile0.putExternalResources(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "ly?mUcGb ");
      propertyCacheFile0.put("ly?mUcGb ", 0L);
      boolean boolean0 = propertyCacheFile0.isInCache("ly?mUcGb ", 0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "87R >WL;!TC,GAy");
      boolean boolean0 = propertyCacheFile0.isInCache("87R >WL;!TC,GAy", 0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "87R >WL;!TC,GAy");
      propertyCacheFile0.put("87R >WL;!TC,GAy", 0L);
      String string0 = propertyCacheFile0.get("87R >WL;!TC,GAy");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "VLsQ*U\";>!KDcI");
      // Undeclared exception!
      try { 
        propertyCacheFile0.remove((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "{~P\":tA/CwAW");
      // Undeclared exception!
      try { 
        propertyCacheFile0.persist();
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("5kW~g,*]");
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(defaultConfiguration0, "5kW~g,*]");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("5kW~g,*]");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<7niK]h4P5>^s4<");
      // Undeclared exception!
      try { 
        propertyCacheFile0.load();
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "");
      try { 
        propertyCacheFile0.load();
        fail("Expecting exception: AccessDeniedException");
      
      } catch(AccessDeniedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "vsM&[J]if-");
      // Undeclared exception!
      try { 
        propertyCacheFile0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "com.puppycrawl.tools.checkstyle.api.CheckstyleException");
      // Undeclared exception!
      try { 
        propertyCacheFile0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("5kW~g,*]");
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(defaultConfiguration0, "5kW~g,*]");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      propertyCacheFile0.putExternalResources(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
          PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "f:It;Z;");
          // Undeclared exception!
          try { 
            propertyCacheFile0.persist();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"f:\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.WindowsPath.checkWrite(WindowsPath.java:799)
             // sun.nio.fs.WindowsFileSystemProvider.createDirectory(WindowsFileSystemProvider.java:491)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // com.puppycrawl.tools.checkstyle.PropertyCacheFile.persist(PropertyCacheFile.java:147)
             // sun.reflect.GeneratedMethodAccessor74.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
          PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "sGq#h1t^KSZ]_c(t");
          // Undeclared exception!
          try { 
            propertyCacheFile0.persist();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"sGq#h1t^KSZ]_c(t\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.WindowsChannelFactory.open(WindowsChannelFactory.java:295)
             // sun.nio.fs.WindowsChannelFactory.newFileChannel(WindowsChannelFactory.java:162)
             // sun.nio.fs.WindowsFileSystemProvider.newByteChannel(WindowsFileSystemProvider.java:225)
             // java.nio.file.spi.FileSystemProvider.newOutputStream(FileSystemProvider.java:434)
             // java.nio.file.Files.newOutputStream(Files.java:216)
             // com.puppycrawl.tools.checkstyle.PropertyCacheFile.persist(PropertyCacheFile.java:149)
             // sun.reflect.GeneratedMethodAccessor74.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "sGq#h1t^KSZ]_c(t");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("sGq#h1t^KSZ]_c(t");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      try { 
        propertyCacheFile0.load();
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = null;
      try {
        propertyCacheFile0 = new PropertyCacheFile(configuration0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fileName can not be null
         //
         verifyException("com.puppycrawl.tools.checkstyle.PropertyCacheFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PropertyCacheFile propertyCacheFile0 = null;
      try {
        propertyCacheFile0 = new PropertyCacheFile((Configuration) null, "com.puppycrawl.tools.checkstyle.PropertyCacheFile");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // config can not be null
         //
         verifyException("com.puppycrawl.tools.checkstyle.PropertyCacheFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "com.puppycrawl.tools.checkstyle.api.CheckstyleException");
      // Undeclared exception!
      try { 
        propertyCacheFile0.isInCache((String) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("5kW~g,*]");
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(defaultConfiguration0, "5kW~g,*]");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("5kW~g,*]");
      propertyCacheFile0.load();
      propertyCacheFile0.putExternalResources(linkedHashSet0);
      propertyCacheFile0.putExternalResources(linkedHashSet0);
      assertEquals(1, linkedHashSet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "com.puppycrawl.tools.checkstyle.api.CheckstyleException");
      String string0 = propertyCacheFile0.get("u&(7]\r^y-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Configuration configuration0 = mock(Configuration.class, new ViolatedAssumptionAnswer());
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(configuration0, "");
      // Undeclared exception!
      try { 
        propertyCacheFile0.put((String) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("5kW~g,*]");
      PropertyCacheFile propertyCacheFile0 = new PropertyCacheFile(defaultConfiguration0, "5kW~g,*]");
      propertyCacheFile0.remove("5kW~g,*]");
  }
}