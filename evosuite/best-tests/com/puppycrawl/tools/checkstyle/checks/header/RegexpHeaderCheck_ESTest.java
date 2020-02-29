/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 16:04:48 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.header;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.LocalizedMessage;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegexpHeaderCheck_ESTest extends RegexpHeaderCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader("8bH5/");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("header.missing", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains("header.missing"));
      
      boolean boolean0 = vector0.add("header.missing");
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertTrue(boolean0);
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      boolean boolean1 = vector0.add("8bH5/");
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing, 8bH5/]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(2, vector0.size());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing, 8bH5/]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(2, vector0.size());
      assertEquals(2, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(9, intArray0.length);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing, 8bH5/]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(2, vector0.size());
      assertEquals(2, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      regexpHeaderCheck0.postProcessHeaderLines();
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      regexpHeaderCheck0.setHeader("8bH5/");
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      MockFile mockFile0 = new MockFile("", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains("8bH5/"));
      
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("");
      assertNotNull(defaultConfiguration0);
      assertEquals("", defaultConfiguration0.getName());
      
      regexpHeaderCheck0.configure(defaultConfiguration0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertEquals("", defaultConfiguration0.getName());
      
      boolean boolean0 = vector0.add("header.missing");
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertTrue(boolean0);
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains(""));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.canWrite());
      assertEquals("\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(1, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains(""));
      
      regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.canWrite());
      assertEquals("\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(1, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains(""));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader("Ll");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("header.missing");
      assertNotNull(mockFile0);
      
      DefaultConfiguration defaultConfiguration0 = new DefaultConfiguration("Ll");
      assertNotNull(defaultConfiguration0);
      assertEquals("Ll", defaultConfiguration0.getName());
      
      regexpHeaderCheck0.configure(defaultConfiguration0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      assertEquals("Ll", defaultConfiguration0.getName());
      
      ArrayList<String> arrayList0 = new ArrayList<String>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertFalse(arrayList0.contains("Ll"));
      
      FileText fileText0 = new FileText(mockFile0, arrayList0);
      assertNotNull(fileText0);
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canRead());
      assertEquals("header.missing", mockFile0.getName());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals("header.missing", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.exists());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.canExecute());
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, fileText0.size());
      assertFalse(arrayList0.contains("Ll"));
      
      int[] intArray0 = new int[1];
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(1, intArray0.length);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canRead());
      assertEquals("header.missing", mockFile0.getName());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals("header.missing", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.exists());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.canExecute());
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, fileText0.size());
      assertFalse(arrayList0.contains("Ll"));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.setMultiLines((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.setHeader(")Kb[GW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to parse format: )Kb[GW
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader((String) null);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertFalse(vector0.contains(""));
      
      boolean boolean0 = vector0.add("header.mismatch");
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.mismatch]", vector0.toString());
      assertEquals(1, vector0.size());
      assertTrue(boolean0);
      assertTrue(vector0.contains("header.mismatch"));
      assertFalse(vector0.contains(""));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isAbsolute());
      assertEquals("", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("", mockFile0.getName());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isFile());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.mismatch]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(1, fileText0.size());
      assertTrue(vector0.contains("header.mismatch"));
      assertFalse(vector0.contains(""));
      
      SortedSet<LocalizedMessage> sortedSet0 = regexpHeaderCheck0.process(mockFile0, fileText0);
      assertNotNull(sortedSet0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isAbsolute());
      assertEquals("", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("", mockFile0.getName());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isFile());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.mismatch]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(1, fileText0.size());
      assertTrue(sortedSet0.isEmpty());
      assertEquals(0, sortedSet0.size());
      assertTrue(vector0.contains("header.mismatch"));
      assertFalse(vector0.contains(""));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader("header.missing");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("header.missing", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains("header.missing"));
      
      boolean boolean0 = vector0.add("header.missing");
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertTrue(boolean0);
      assertFalse(vector0.contains("~_/1CAQ7M"));
      assertTrue(vector0.contains("header.missing"));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(1, fileText0.size());
      assertFalse(vector0.contains("~_/1CAQ7M"));
      assertTrue(vector0.contains("header.missing"));
      
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(9, intArray0.length);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(1, fileText0.size());
      assertFalse(vector0.contains("~_/1CAQ7M"));
      assertTrue(vector0.contains("header.missing"));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      regexpHeaderCheck0.setHeader("8bH5/");
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      MockFile mockFile0 = new MockFile("header.missing", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      boolean boolean0 = vector0.add("header.missing");
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertTrue(boolean0);
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canRead());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(1, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(9, intArray0.length);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canRead());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.isEmpty());
      assertEquals("[header.missing]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(1, fileText0.size());
      assertTrue(vector0.contains("header.missing"));
      assertFalse(vector0.contains("~_/1CAQ7M"));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader("header.missing");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("header.missing", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertEquals(0L, mockFile0.lastModified());
      assertTrue(mockFile0.isFile());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_\\1CAQ7M", mockFile0.toString());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.exists());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertEquals("C:\\Users\\ronys\\git\\checkstyle\\header.missing\\~_", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.length());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, fileText0.size());
      assertFalse(vector0.contains("~_/1CAQ7M"));
      
      int[] intArray0 = new int[9];
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(9, intArray0.length);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      regexpHeaderCheck0.setHeader("8bH5/");
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      assertNull(regexpHeaderCheck0.getId());
      
      MockFile mockFile0 = new MockFile("", "~_/1CAQ7M");
      assertNotNull(mockFile0);
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertFalse(vector0.contains(""));
      
      FileText fileText0 = new FileText(mockFile0, vector0);
      assertNotNull(fileText0);
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals("\\~_\\1CAQ7M", mockFile0.toString());
      assertEquals("1CAQ7M", mockFile0.getName());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.canExecute());
      assertEquals("\\~_", mockFile0.getParent());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
      assertEquals(0, fileText0.size());
      assertFalse(vector0.contains(""));
      
      // Undeclared exception!
      try { 
        regexpHeaderCheck0.processFiltered(mockFile0, fileText0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegexpHeaderCheck regexpHeaderCheck0 = new RegexpHeaderCheck();
      assertNotNull(regexpHeaderCheck0);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
      
      int[] intArray0 = new int[0];
      regexpHeaderCheck0.setMultiLines(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertEquals(0, intArray0.length);
      assertNull(regexpHeaderCheck0.getId());
      assertEquals(SeverityLevel.ERROR, regexpHeaderCheck0.getSeverityLevel());
  }
}