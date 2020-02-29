/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 26 15:43:42 GMT 2020
 */

package com.puppycrawl.tools.checkstyle;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Checker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.Checker"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\ronys\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\ronys\\git\\checkstyle"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\ronys"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "ronys"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Checker_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFilterSet",
      "antlr.collections.AST",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.PropertyUtils",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "org.apache.commons.beanutils.expression.Resolver",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtil",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "org.apache.commons.beanutils.converters.LongConverter",
      "com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck$FileContext",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory$ModuleLoadOption",
      "org.apache.commons.beanutils.Converter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "org.apache.commons.beanutils.BeanIntrospector",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.api.RootModule",
      "com.puppycrawl.tools.checkstyle.checks.naming.AccessModifier",
      "org.apache.commons.beanutils.MethodUtils",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFileSet",
      "com.puppycrawl.tools.checkstyle.api.AuditEvent",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedAccessModifierArrayConverter",
      "org.apache.commons.beanutils.BeanUtils",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.puppycrawl.tools.checkstyle.CheckerTest$CheckWhichDoesNotRequireCommentNodes",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.converters.DateConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$UriConverter",
      "com.puppycrawl.tools.checkstyle.api.MessageDispatcher",
      "com.puppycrawl.tools.checkstyle.CheckerTest$CheckWhichRequiresCommentNodes",
      "com.puppycrawl.tools.checkstyle.PropertyCacheFile",
      "com.puppycrawl.tools.checkstyle.api.Filter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$PatternConverter",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory",
      "com.puppycrawl.tools.checkstyle.grammar.CommentListener",
      "org.apache.commons.beanutils.ConvertUtils",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevelCounter",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$SeverityLevelConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.api.FilterSet",
      "com.puppycrawl.tools.checkstyle.api.AuditListener",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheck",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilterSet",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.DynaBean",
      "com.puppycrawl.tools.checkstyle.api.ExternalResourceHolder",
      "com.puppycrawl.tools.checkstyle.XmlLoader",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "com.puppycrawl.tools.checkstyle.api.Scope",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFileSetViolationCheck",
      "org.apache.commons.beanutils.SuppressPropertiesBeanIntrospector",
      "org.apache.commons.beanutils.ConversionException",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DynamicalResourceHolderCheck",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFilter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$ScopeConverter",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "com.puppycrawl.tools.checkstyle.XmlLoader$LoadExternalDtdFeatureProvider",
      "com.puppycrawl.tools.checkstyle.ModuleFactory",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.NestedNullException",
      "com.puppycrawl.tools.checkstyle.CheckerTest$CheckWhichThrowsError",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.puppycrawl.tools.checkstyle.PackageNamesLoader",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.puppycrawl.tools.checkstyle.AbstractPathTestSupport",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "org.apache.commons.beanutils.converters.URLConverter",
      "com.puppycrawl.tools.checkstyle.CheckerTest",
      "org.apache.commons.beanutils.converters.CalendarConverter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.puppycrawl.tools.checkstyle.ModuleFactory", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.puppycrawl.tools.checkstyle.api.AuditListener", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.puppycrawl.tools.checkstyle.api.Configuration", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.puppycrawl.tools.checkstyle.api.Filter", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.lang.ClassLoader", false, Checker_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.Enumeration", false, Checker_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Checker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtil",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevelCounter",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilterSet",
      "com.puppycrawl.tools.checkstyle.api.FilterSet",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.puppycrawl.tools.checkstyle.api.AuditEvent",
      "com.puppycrawl.tools.checkstyle.PropertyCacheFile",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.XmlLoader",
      "com.puppycrawl.tools.checkstyle.PackageNamesLoader",
      "com.puppycrawl.tools.checkstyle.XmlLoader$LoadExternalDtdFeatureProvider",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.apache.commons.beanutils.converters.DateConverter",
      "org.apache.commons.beanutils.converters.CalendarConverter",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.converters.URLConverter",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$PatternConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$SeverityLevelConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$ScopeConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$UriConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedAccessModifierArrayConverter",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.SuppressPropertiesBeanIntrospector",
      "org.apache.commons.beanutils.PropertyUtils",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.MethodUtils",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory$ModuleLoadOption",
      "net.sf.saxon.tree.linked.NodeImpl",
      "net.sf.saxon.tree.linked.ParentNodeImpl",
      "net.sf.saxon.tree.linked.ElementImpl",
      "net.sf.saxon.style.StyleElement",
      "net.sf.saxon.style.XSLOutput",
      "net.sf.saxon.om.StructuredQName",
      "net.sf.saxon.type.Untyped",
      "net.sf.saxon.tree.linked.TextImpl",
      "net.sf.saxon.style.TextValueTemplateNode",
      "net.sf.saxon.style.ExpressionContext",
      "net.sf.saxon.style.TextValueTemplateContext",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFilterSet",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBeanTest$TestBean",
      "net.sf.saxon.expr.instruct.Actor",
      "net.sf.saxon.expr.accum.Accumulator",
      "net.sf.saxon.trans.Mode",
      "net.sf.saxon.trans.SimpleMode",
      "net.sf.saxon.trans.rules.RuleChain",
      "net.sf.saxon.z.IntHashMap",
      "net.sf.saxon.trans.rules.TextOnlyCopyRuleSet",
      "net.sf.saxon.value.AtomicValue",
      "net.sf.saxon.value.NumericValue",
      "net.sf.saxon.type.AnySimpleType",
      "net.sf.saxon.pattern.NodeTest",
      "net.sf.saxon.pattern.AnyNodeTest",
      "net.sf.saxon.type.AnyItemType",
      "net.sf.saxon.type.Type",
      "net.sf.saxon.type.PrimitiveUType",
      "net.sf.saxon.type.UType",
      "net.sf.saxon.type.AnyType",
      "net.sf.saxon.type.ErrorType",
      "net.sf.saxon.type.NumericType",
      "net.sf.saxon.type.BuiltInType",
      "net.sf.saxon.om.FingerprintedQName",
      "net.sf.saxon.om.StandardNames",
      "net.sf.saxon.type.Converter",
      "net.sf.saxon.type.StringConverter",
      "net.sf.saxon.type.StringConverter$StringToString",
      "net.sf.saxon.type.StringConverter$StringToLanguage",
      "net.sf.saxon.type.StringConverter$StringToNormalizedString",
      "net.sf.saxon.type.StringConverter$StringToToken",
      "net.sf.saxon.type.StringConverter$StringToNCName",
      "net.sf.saxon.type.StringConverter$StringToName",
      "net.sf.saxon.type.StringConverter$StringToNMTOKEN",
      "net.sf.saxon.type.StringConverter$StringToDecimal",
      "net.sf.saxon.type.StringConverter$StringToInteger",
      "net.sf.saxon.type.StringConverter$StringToDuration",
      "net.sf.saxon.type.StringConverter$StringToGMonth",
      "net.sf.saxon.type.StringConverter$StringToGMonthDay",
      "net.sf.saxon.type.StringConverter$StringToGDay",
      "net.sf.saxon.type.StringConverter$StringToDayTimeDuration",
      "net.sf.saxon.type.StringConverter$StringToYearMonthDuration",
      "net.sf.saxon.type.StringConverter$StringToTime",
      "net.sf.saxon.type.StringConverter$StringToBoolean",
      "net.sf.saxon.type.StringConverter$StringToHexBinary",
      "net.sf.saxon.type.StringConverter$StringToBase64Binary",
      "net.sf.saxon.type.StringConverter$StringToUntypedAtomic",
      "net.sf.saxon.type.StringConverter$StringToIntegerSubtype",
      "net.sf.saxon.type.BuiltInAtomicType",
      "net.sf.saxon.value.DoubleValue",
      "net.sf.saxon.value.DecimalValue",
      "net.sf.saxon.value.IntegerValue",
      "net.sf.saxon.value.BigIntegerValue",
      "net.sf.saxon.functions.AbstractFunction",
      "net.sf.saxon.functions.SystemFunction",
      "net.sf.saxon.functions.FormatNumber",
      "net.sf.saxon.tree.util.FastStringBuffer",
      "net.sf.saxon.value.BigDecimalValue",
      "net.sf.saxon.value.Int64Value",
      "net.sf.saxon.expr.Expression",
      "net.sf.saxon.expr.Literal",
      "net.sf.saxon.value.EmptySequence",
      "net.sf.saxon.expr.parser.ExplicitLocation",
      "net.sf.saxon.z.IntHashMap$IntHashMapKeyIterator",
      "net.sf.saxon.s9api.XdmValue",
      "net.sf.saxon.s9api.XdmItem",
      "net.sf.saxon.s9api.XdmFunctionItem",
      "net.sf.saxon.s9api.XdmMap",
      "net.sf.saxon.type.AnyFunctionType",
      "net.sf.saxon.pattern.NodeKindTest",
      "net.sf.saxon.value.Cardinality",
      "net.sf.saxon.value.SequenceType",
      "net.sf.saxon.ma.map.MapType",
      "net.sf.saxon.ma.map.HashTrieMap",
      "net.sf.saxon.ma.trie.ImmutableHashTrieMap$EmptyHashNode",
      "net.sf.saxon.ma.trie.ImmutableHashTrieMap",
      "net.sf.saxon.style.XSLTemplate",
      "net.sf.saxon.trans.Visibility",
      "net.sf.saxon.sxpath.AbstractStaticContext",
      "net.sf.saxon.style.UseWhenStaticContext",
      "net.sf.saxon.functions.FunctionLibraryList",
      "net.sf.saxon.lib.Feature",
      "net.sf.saxon.Configuration",
      "net.sf.saxon.trans.packages.PackageDetails",
      "net.sf.saxon.style.XSLMergeAction",
      "net.sf.saxon.style.XSLGeneralVariable",
      "net.sf.saxon.style.XSLWithParam",
      "net.sf.saxon.style.SourceBinding",
      "net.sf.saxon.style.XSLContextItem",
      "net.sf.saxon.style.XSLGlobalContextItem",
      "net.sf.saxon.query.Annotation",
      "net.sf.saxon.om.NamePool",
      "net.sf.saxon.trans.DynamicLoader",
      "net.sf.saxon.lib.StandardCollationURIResolver",
      "net.sf.saxon.resource.StandardCollectionFinder",
      "net.sf.saxon.lib.StandardEnvironmentVariableResolver",
      "net.sf.saxon.lib.ParseOptions",
      "net.sf.saxon.lib.StaticQueryContextFactory",
      "net.sf.saxon.expr.parser.OptimizerOptions",
      "net.sf.saxon.trans.CompilerInfo",
      "net.sf.saxon.lib.StandardOutputResolver",
      "net.sf.saxon.expr.instruct.GlobalParameterSet",
      "net.sf.saxon.trans.packages.PackageLibrary",
      "net.sf.saxon.tree.util.DocumentNumberAllocator",
      "net.sf.saxon.z.IntHashSet",
      "net.sf.saxon.om.DocumentPool",
      "net.sf.saxon.functions.IntegratedFunctionLibrary",
      "net.sf.saxon.lib.SerializerFactory",
      "net.sf.saxon.lib.Logger",
      "net.sf.saxon.lib.StandardLogger",
      "net.sf.saxon.java.JavaPlatform",
      "net.sf.saxon.Version",
      "net.sf.saxon.lib.StandardModuleURIResolver",
      "net.sf.saxon.lib.StandardURIResolver",
      "net.sf.saxon.lib.StandardUnparsedTextResolver",
      "net.sf.saxon.expr.parser.TypeChecker",
      "net.sf.saxon.expr.compat.TypeChecker10",
      "net.sf.saxon.tree.tiny.TreeStatistics",
      "net.sf.saxon.tree.tiny.Statistics",
      "net.sf.saxon.dom.DOMEnvelope",
      "net.sf.saxon.om.TreeModel$TinyTree",
      "net.sf.saxon.om.TreeModel$TinyTreeCondensed",
      "net.sf.saxon.om.TreeModel$LinkedTree",
      "net.sf.saxon.om.TreeModel",
      "net.sf.saxon.dom.DOMObjectModel",
      "net.sf.saxon.lib.StandardEntityResolver",
      "net.sf.saxon.resource.XmlResource$1",
      "net.sf.saxon.resource.XmlResource",
      "net.sf.saxon.resource.UnparsedTextResource$1",
      "net.sf.saxon.resource.UnparsedTextResource",
      "net.sf.saxon.resource.BinaryResource$1",
      "net.sf.saxon.resource.BinaryResource",
      "net.sf.saxon.resource.JSONResource$1",
      "net.sf.saxon.resource.JSONResource",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler$DisallowedCombination",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler",
      "net.sf.saxon.event.PipelineConfiguration",
      "net.sf.saxon.trans.XPathException",
      "net.sf.saxon.query.StaticQueryContext",
      "net.sf.saxon.expr.EarlyEvaluationContext",
      "net.sf.saxon.expr.parser.XPathParser",
      "net.sf.saxon.query.XQueryParser",
      "net.sf.saxon.expr.parser.ParserExtension",
      "net.sf.saxon.query.QueryModule",
      "net.sf.saxon.expr.instruct.Executable",
      "net.sf.saxon.query.XQueryFunctionLibrary",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet$Entry",
      "net.sf.saxon.expr.OperandUsage",
      "net.sf.saxon.value.BooleanValue",
      "net.sf.saxon.regex.UnicodeString",
      "net.sf.saxon.regex.EmptyString",
      "net.sf.saxon.regex.LatinString",
      "net.sf.saxon.value.StringValue",
      "net.sf.saxon.functions.registry.XPath20FunctionSet",
      "net.sf.saxon.functions.registry.XPath30FunctionSet",
      "net.sf.saxon.type.SpecificFunctionType",
      "net.sf.saxon.query.AnnotationList",
      "net.sf.saxon.functions.OptionsParameter",
      "net.sf.saxon.ma.json.JsonToXMLFn",
      "net.sf.saxon.ma.json.ParseJsonFn",
      "net.sf.saxon.functions.Serialize",
      "net.sf.saxon.functions.TransformFn",
      "net.sf.saxon.ma.arrays.ArrayItemType",
      "net.sf.saxon.ma.json.XMLToJsonFn",
      "net.sf.saxon.functions.registry.XPath31FunctionSet",
      "net.sf.saxon.functions.Doc_2",
      "net.sf.saxon.functions.registry.VendorFunctionSetHE",
      "net.sf.saxon.functions.MathFunctionSet",
      "net.sf.saxon.ma.map.MapFunctionSet",
      "net.sf.saxon.ma.arrays.ArrayFunctionSet",
      "net.sf.saxon.functions.registry.ExsltCommonFunctionSet",
      "net.sf.saxon.functions.registry.ConstructorFunctionLibrary",
      "net.sf.saxon.query.ImportedFunctionLibrary",
      "net.sf.saxon.query.UnboundFunctionLibrary",
      "net.sf.saxon.expr.PackageData",
      "net.sf.saxon.expr.instruct.SlotManager",
      "net.sf.saxon.functions.ExecutableFunctionLibrary",
      "net.sf.saxon.expr.parser.Tokenizer",
      "net.sf.saxon.expr.parser.XPathParser$NestedLocation",
      "net.sf.saxon.lib.StandardErrorListener",
      "net.sf.saxon.trans.Err",
      "net.sf.saxon.serialize.charcode.UTF16CharacterSet",
      "net.sf.saxon.style.XSLResultDocument",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheckTest$ViolationFileSetCheck",
      "net.sf.saxon.xpath.JAXPXPathStaticContext",
      "net.sf.saxon.xpath.JAXPXPathStaticContext$MinimalNamespaceContext",
      "net.sf.saxon.xpath.XPathFunctionLibrary",
      "net.sf.saxon.s9api.XdmAtomicValue",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DummyFileSetViolationCheck",
      "com.puppycrawl.tools.checkstyle.utils.ModuleReflectionUtil",
      "com.google.common.reflect.ClassPath$1",
      "com.google.common.base.Splitter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.reflect.ClassPath",
      "com.google.common.reflect.ClassPath$Scanner",
      "com.google.common.reflect.ClassPath$DefaultScanner",
      "com.google.common.collect.Sets",
      "com.google.common.collect.MultimapBuilder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys",
      "com.google.common.collect.MultimapBuilder$1",
      "com.google.common.collect.MultimapBuilder$SetMultimapBuilder",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4",
      "com.google.common.collect.Platform",
      "com.google.common.collect.Maps",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "com.google.common.collect.Multimaps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.Multimaps$CustomSetMultimap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.common.collect.AbstractMapBasedMultimap$Itr",
      "com.google.common.collect.AbstractMapBasedMultimap$2",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.google.common.collect.RegularImmutableSet",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheckTest$TestFileSetCheck",
      "net.sf.saxon.sxpath.IndependentContext",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheckTest$VisitCounterCheck",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheckTest$MultiFileViolationFileSetCheck",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.puppycrawl.tools.checkstyle.CheckerTest$DynamicalResourceHolderCheck",
      "net.sf.saxon.type.StringToDouble",
      "net.sf.saxon.value.StringToDouble11",
      "net.sf.saxon.expr.sort.LRUCache",
      "net.sf.saxon.expr.sort.LRUCache$1",
      "net.sf.saxon.lib.ConversionRules",
      "net.sf.saxon.value.CalendarValue",
      "net.sf.saxon.value.GDateValue",
      "net.sf.saxon.value.DateValue",
      "net.sf.saxon.value.Whitespace",
      "net.sf.saxon.value.DurationValue",
      "net.sf.saxon.type.ValidationFailure",
      "net.sf.saxon.type.ValidationException",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheckTest$ViolationAstCheck",
      "net.sf.saxon.style.XSLBreakOrContinue",
      "net.sf.saxon.style.XSLBreak",
      "net.sf.saxon.style.StylesheetModule",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheckTest$ViolationCheck",
      "net.sf.saxon.style.XSLModuleRoot",
      "net.sf.saxon.style.XSLStylesheet",
      "net.sf.saxon.style.XSLPackage",
      "net.sf.saxon.style.PrincipalStylesheetModule",
      "net.sf.saxon.tree.util.AttributeCollectionImpl",
      "net.sf.saxon.style.PackageVersion",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheckTest$DummyAbstractCheck",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporterTest$EmptyCheck",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBeanTest$ConverterBean",
      "net.sf.saxon.trans.ConfigurationReader",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "net.sf.saxon.expr.sort.CodepointCollator",
      "net.sf.saxon.style.XSLFork",
      "net.sf.saxon.value.DateTimeValue",
      "net.sf.saxon.trans.CompoundMode",
      "net.sf.saxon.s9api.Processor",
      "net.sf.saxon.event.ContentHandlerProxy",
      "net.sf.saxon.trans.ConfigurationReader$1",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheckTest$ExceptionFileSetCheck",
      "net.sf.saxon.expr.parser.RetainedStaticContext",
      "net.sf.saxon.style.XSLPreserveSpace",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.DetailAstImpl",
      "net.sf.saxon.s9api.QName",
      "net.sf.saxon.value.QualifiedNameValue",
      "net.sf.saxon.value.QNameValue",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "net.sf.saxon.style.XSLLeafNodeConstructor",
      "net.sf.saxon.style.XSLValueOf",
      "net.sf.saxon.style.XSLSortOrMergeKey",
      "net.sf.saxon.style.XSLSort",
      "net.sf.saxon.expr.Component",
      "net.sf.saxon.expr.Component$M",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.base.Optional",
      "com.google.common.base.Present",
      "com.google.common.base.Predicates",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.Iterables$4",
      "com.google.common.base.Absent",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.AbstractIterator$1",
      "net.sf.saxon.style.XSLChoose",
      "net.sf.saxon.style.XSLSequence",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheckTest$DummyFileSetCheck",
      "net.sf.saxon.expr.number.AbstractNumberer",
      "net.sf.saxon.expr.number.Numberer_en",
      "org.apache.commons.beanutils.ConversionException",
      "org.apache.commons.beanutils.BeanUtils",
      "net.sf.saxon.style.Compilation",
      "net.sf.saxon.om.QNameParser",
      "net.sf.saxon.style.XSLFallback",
      "net.sf.saxon.functions.registry.UseWhen30FunctionSet",
      "net.sf.saxon.expr.parser.ExpressionVisitor",
      "net.sf.saxon.style.XSLNamespaceAlias",
      "net.sf.saxon.style.XSLNextIteration",
      "net.sf.saxon.ma.map.DictionaryMap",
      "net.sf.saxon.style.DataElement",
      "net.sf.saxon.expr.instruct.Instruction",
      "net.sf.saxon.expr.OperandRole",
      "net.sf.saxon.expr.instruct.ParentNodeConstructor",
      "net.sf.saxon.expr.instruct.DocumentInstr",
      "net.sf.saxon.expr.UnaryExpression",
      "net.sf.saxon.expr.TailExpression",
      "net.sf.saxon.expr.Operand",
      "net.sf.saxon.expr.parser.ExpressionTool",
      "net.sf.saxon.expr.AdjacentTextNodeMerger",
      "net.sf.saxon.style.XSLOutputCharacter",
      "net.sf.saxon.type.SchemaException",
      "net.sf.saxon.style.AbsentExtensionElement",
      "net.sf.saxon.expr.StringLiteral",
      "net.sf.saxon.om.ZeroOrOne",
      "net.sf.saxon.om.One",
      "net.sf.saxon.functions.ScalarSystemFunction",
      "net.sf.saxon.functions.EscapeHtmlUri"
    );
  }
}
