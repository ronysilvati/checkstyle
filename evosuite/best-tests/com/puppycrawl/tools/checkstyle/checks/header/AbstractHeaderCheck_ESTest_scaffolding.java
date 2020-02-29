/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 26 16:01:18 GMT 2020
 */

package com.puppycrawl.tools.checkstyle.checks.header;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractHeaderCheck_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractHeaderCheck_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "org.apache.commons.beanutils.ConversionException",
      "com.puppycrawl.tools.checkstyle.StatelessCheck",
      "com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheck",
      "com.puppycrawl.tools.checkstyle.api.MessageDispatcher",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtil",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "com.puppycrawl.tools.checkstyle.api.ExternalResourceHolder",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.grammar.CommentListener",
      "org.apache.commons.beanutils.Converter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.checks.header.HeaderCheck",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.api.RootModule",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractHeaderCheck_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.puppycrawl.tools.checkstyle.checks.header.AbstractHeaderCheck",
      "com.puppycrawl.tools.checkstyle.checks.header.HeaderCheck",
      "com.puppycrawl.tools.checkstyle.checks.header.RegexpHeaderCheck",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtil",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "net.sf.saxon.s9api.XsltExecutable",
      "net.sf.saxon.jaxp.TemplatesImpl",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "net.sf.saxon.tree.linked.NodeImpl",
      "net.sf.saxon.tree.linked.ParentNodeImpl",
      "net.sf.saxon.tree.linked.ElementImpl",
      "net.sf.saxon.style.StyleElement",
      "net.sf.saxon.style.XSLEvaluate",
      "net.sf.saxon.om.StructuredQName",
      "net.sf.saxon.type.Untyped",
      "net.sf.saxon.type.AnyItemType",
      "net.sf.saxon.type.AnySimpleType",
      "net.sf.saxon.pattern.NodeTest",
      "net.sf.saxon.pattern.AnyNodeTest",
      "net.sf.saxon.type.Type",
      "net.sf.saxon.type.PrimitiveUType",
      "net.sf.saxon.type.UType",
      "net.sf.saxon.z.IntHashMap",
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
      "net.sf.saxon.pattern.NodeKindTest",
      "net.sf.saxon.type.AnyFunctionType",
      "net.sf.saxon.value.Cardinality",
      "net.sf.saxon.value.SequenceType",
      "net.sf.saxon.tree.linked.AttributeEnumeration",
      "net.sf.saxon.tree.util.AttributeCollectionImpl",
      "net.sf.saxon.value.AtomicValue",
      "net.sf.saxon.value.NumericValue",
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
      "net.sf.saxon.expr.UnaryExpression",
      "net.sf.saxon.expr.AdjacentTextNodeMerger",
      "net.sf.saxon.expr.parser.ExplicitLocation",
      "net.sf.saxon.expr.Operand",
      "net.sf.saxon.expr.OperandUsage",
      "net.sf.saxon.expr.OperandRole",
      "net.sf.saxon.expr.parser.ExpressionTool",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.logging.impl.Jdk14Logger",
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
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.MethodUtils",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheckTest$ViolationDispatcher",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "net.sf.saxon.s9api.streams.XdmStream",
      "net.sf.saxon.dom.NodeOverNodeInfo",
      "net.sf.saxon.dom.AttrOverNodeInfo",
      "net.sf.saxon.expr.PseudoExpression",
      "net.sf.saxon.expr.sort.SortKeyDefinition",
      "net.sf.saxon.expr.Literal",
      "net.sf.saxon.expr.StringLiteral",
      "net.sf.saxon.regex.UnicodeString",
      "net.sf.saxon.regex.EmptyString",
      "net.sf.saxon.regex.LatinString",
      "net.sf.saxon.value.StringValue",
      "net.sf.saxon.java.JavaPlatform",
      "net.sf.saxon.Version",
      "net.sf.saxon.expr.sort.SimpleCollation",
      "net.sf.saxon.expr.instruct.Instruction",
      "net.sf.saxon.expr.sort.MergeInstr",
      "net.sf.saxon.expr.sort.SortKeyDefinitionList",
      "net.sf.saxon.expr.sort.MergeInstr$MergeSource",
      "net.sf.saxon.expr.instruct.ForEachGroup",
      "net.sf.saxon.pattern.Pattern",
      "net.sf.saxon.pattern.AnchorPattern",
      "net.sf.saxon.pattern.VennPattern",
      "net.sf.saxon.pattern.UnionPattern",
      "net.sf.saxon.pattern.AncestorQualifiedPattern",
      "net.sf.saxon.lib.Feature",
      "net.sf.saxon.Configuration",
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
      "net.sf.saxon.trans.DynamicLoader",
      "net.sf.saxon.z.IntHashSet",
      "net.sf.saxon.om.DocumentPool",
      "net.sf.saxon.functions.IntegratedFunctionLibrary",
      "net.sf.saxon.om.NamePool",
      "net.sf.saxon.lib.SerializerFactory",
      "net.sf.saxon.lib.Logger",
      "net.sf.saxon.lib.StandardLogger",
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
      "net.sf.saxon.query.Annotation",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler",
      "net.sf.saxon.style.Compilation",
      "net.sf.saxon.om.QNameParser",
      "net.sf.saxon.style.StylesheetModule",
      "net.sf.saxon.style.PrincipalStylesheetModule",
      "net.sf.saxon.tree.linked.TextImpl",
      "net.sf.saxon.style.TextValueTemplateNode",
      "net.sf.saxon.trans.ConfigurationReader",
      "net.sf.saxon.event.ContentHandlerProxy",
      "net.sf.saxon.trans.ConfigurationReader$1",
      "net.sf.saxon.style.XSLOverride",
      "net.sf.saxon.style.XSLIf",
      "net.sf.saxon.query.StaticQueryContext",
      "net.sf.saxon.functions.ResolveURI",
      "net.sf.saxon.style.XSLTemplate",
      "net.sf.saxon.trans.Visibility",
      "net.sf.saxon.style.ExpressionContext",
      "net.sf.saxon.expr.parser.RetainedStaticContext",
      "net.sf.saxon.om.GenericTreeInfo",
      "net.sf.saxon.tree.tiny.TinyTree",
      "net.sf.saxon.om.NoElementsSpaceStrippingRule",
      "net.sf.saxon.om.PrefixPool",
      "net.sf.saxon.event.SequenceReceiver",
      "net.sf.saxon.event.ProxyReceiver",
      "net.sf.saxon.event.TypeCheckingFilter",
      "net.sf.saxon.event.Builder",
      "net.sf.saxon.dom.DOMWriter",
      "net.sf.saxon.expr.AttributeGetter",
      "net.sf.saxon.expr.SuppliedParameterReference",
      "net.sf.saxon.style.XSLForEach",
      "net.sf.saxon.expr.instruct.SimpleNodeConstructor",
      "net.sf.saxon.expr.instruct.AttributeCreator",
      "net.sf.saxon.expr.instruct.ComputedAttribute",
      "net.sf.saxon.value.EmptySequence",
      "net.sf.saxon.expr.Assignation",
      "net.sf.saxon.expr.LetExpression",
      "net.sf.saxon.expr.EagerLetExpression",
      "net.sf.saxon.expr.instruct.Actor",
      "net.sf.saxon.trans.Mode",
      "net.sf.saxon.trans.SimpleMode",
      "net.sf.saxon.trans.rules.RuleChain",
      "net.sf.saxon.trans.rules.TextOnlyCopyRuleSet",
      "net.sf.saxon.trans.rules.RuleManager",
      "net.sf.saxon.style.XSLIterate",
      "net.sf.saxon.s9api.XdmValue",
      "net.sf.saxon.s9api.XdmItem",
      "net.sf.saxon.s9api.XdmNode",
      "net.sf.saxon.style.XSLWhen",
      "net.sf.saxon.style.XSLOnCompletion",
      "net.sf.saxon.dom.ElementOverNodeInfo",
      "net.sf.saxon.s9api.AbstractDestination",
      "net.sf.saxon.s9api.DOMDestination",
      "net.sf.saxon.s9api.DestinationHelper",
      "net.sf.saxon.dom.DocumentOverNodeInfo",
      "net.sf.saxon.s9api.XdmDestination",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "net.sf.saxon.sxpath.AbstractStaticContext",
      "net.sf.saxon.sxpath.IndependentContext",
      "net.sf.saxon.functions.FunctionLibraryList",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet$Entry",
      "net.sf.saxon.value.BooleanValue",
      "net.sf.saxon.functions.registry.XPath20FunctionSet",
      "net.sf.saxon.functions.registry.XPath30FunctionSet",
      "net.sf.saxon.ma.map.MapType",
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
      "net.sf.saxon.expr.PackageData",
      "net.sf.saxon.expr.instruct.SlotManager",
      "net.sf.saxon.style.XSLModuleRoot",
      "net.sf.saxon.style.XSLStylesheet",
      "net.sf.saxon.value.DurationValue",
      "net.sf.saxon.value.YearMonthDurationValue",
      "net.sf.saxon.om.NamespaceBinding",
      "net.sf.saxon.tree.jiter.MonoIterator",
      "net.sf.saxon.expr.Calculator$AnyPlusAny",
      "net.sf.saxon.expr.Calculator$AnyMinusAny",
      "net.sf.saxon.expr.Calculator$AnyTimesAny",
      "net.sf.saxon.expr.Calculator$AnyDivAny",
      "net.sf.saxon.expr.Calculator$AnyModAny",
      "net.sf.saxon.expr.Calculator$AnyIdivAny",
      "net.sf.saxon.expr.Calculator$DoublePlusDouble",
      "net.sf.saxon.expr.Calculator$DoubleMinusDouble",
      "net.sf.saxon.expr.Calculator$DoubleTimesDouble",
      "net.sf.saxon.expr.Calculator$DoubleDivDouble",
      "net.sf.saxon.expr.Calculator$DoubleModDouble",
      "net.sf.saxon.expr.Calculator$DoubleIdivDouble",
      "net.sf.saxon.expr.Calculator$FloatPlusFloat",
      "net.sf.saxon.expr.Calculator$FloatMinusFloat",
      "net.sf.saxon.expr.Calculator$FloatTimesFloat",
      "net.sf.saxon.expr.Calculator$FloatDivFloat",
      "net.sf.saxon.expr.Calculator$FloatModFloat",
      "net.sf.saxon.expr.Calculator$FloatIdivFloat",
      "net.sf.saxon.expr.Calculator$DecimalPlusDecimal",
      "net.sf.saxon.expr.Calculator$DecimalMinusDecimal",
      "net.sf.saxon.expr.Calculator$DecimalTimesDecimal",
      "net.sf.saxon.expr.Calculator$DecimalDivDecimal",
      "net.sf.saxon.expr.Calculator$DecimalModDecimal",
      "net.sf.saxon.expr.Calculator$DecimalIdivDecimal",
      "net.sf.saxon.expr.Calculator$IntegerPlusInteger",
      "net.sf.saxon.expr.Calculator$IntegerTimesInteger",
      "net.sf.saxon.expr.Calculator$IntegerDivInteger",
      "net.sf.saxon.expr.Calculator$IntegerModInteger",
      "net.sf.saxon.expr.Calculator$IntegerIdivInteger",
      "net.sf.saxon.expr.Calculator$DateTimeMinusDateTime",
      "net.sf.saxon.expr.Calculator$DateTimePlusDuration",
      "net.sf.saxon.expr.Calculator$DateTimeMinusDuration",
      "net.sf.saxon.expr.Calculator$DurationPlusDateTime",
      "net.sf.saxon.expr.Calculator$DurationPlusDuration",
      "net.sf.saxon.expr.Calculator$DurationMinusDuration",
      "net.sf.saxon.expr.Calculator$DurationDivDuration",
      "net.sf.saxon.expr.Calculator$DurationTimesNumeric",
      "net.sf.saxon.expr.Calculator$DurationDivNumeric",
      "net.sf.saxon.expr.Calculator$NumericTimesDuration",
      "net.sf.saxon.expr.Calculator",
      "net.sf.saxon.expr.Calculator$IntegerMinusInteger",
      "net.sf.saxon.om.ZeroOrOne",
      "net.sf.saxon.om.One",
      "net.sf.saxon.functions.ScalarSystemFunction",
      "net.sf.saxon.functions.Abs",
      "org.apache.commons.beanutils.PropertyUtils",
      "net.sf.saxon.expr.instruct.NumberInstruction",
      "net.sf.saxon.functions.TreatFn",
      "net.sf.saxon.functions.TreatFn$ZeroOrOne",
      "net.sf.saxon.type.AnyExternalObjectType",
      "net.sf.saxon.type.ExternalObjectType",
      "net.sf.saxon.type.JavaExternalObjectType",
      "net.sf.saxon.om.DocumentURI",
      "net.sf.saxon.event.PipelineConfiguration",
      "net.sf.saxon.lib.StandardErrorListener",
      "net.sf.saxon.tree.linked.LinkedTreeBuilder",
      "net.sf.saxon.tree.linked.LinkedTreeBuilder$DefaultNodeFactory",
      "net.sf.saxon.style.StyleNodeFactory",
      "net.sf.saxon.style.UseWhenFilter",
      "net.sf.saxon.value.NestedIntegerValue",
      "net.sf.saxon.value.CalendarValue",
      "net.sf.saxon.value.DateTimeValue",
      "net.sf.saxon.event.StartTagBuffer",
      "net.sf.saxon.om.StylesheetSpaceStrippingRule",
      "net.sf.saxon.event.Stripper$StripRuleTarget",
      "net.sf.saxon.event.Stripper$1",
      "net.sf.saxon.event.Stripper$2",
      "net.sf.saxon.event.Stripper",
      "net.sf.saxon.event.CommentStripper",
      "net.sf.saxon.tree.tiny.TinyBuilder",
      "net.sf.saxon.event.CheckSumFilter",
      "net.sf.saxon.event.Valve",
      "net.sf.saxon.event.Sender",
      "net.sf.saxon.om.AllElementsSpaceStrippingRule",
      "net.sf.saxon.lib.StandardErrorHandler",
      "net.sf.saxon.event.ReceivingContentHandler",
      "net.sf.saxon.event.ReceivingContentHandler$LocalLocator",
      "net.sf.saxon.tree.tiny.CharSlice",
      "net.sf.saxon.style.XSLNamespaceAlias",
      "net.sf.saxon.functions.Current",
      "net.sf.saxon.query.QueryModule",
      "net.sf.saxon.expr.instruct.Executable",
      "net.sf.saxon.query.XQueryFunctionLibrary",
      "net.sf.saxon.query.ImportedFunctionLibrary",
      "net.sf.saxon.query.UnboundFunctionLibrary",
      "net.sf.saxon.trace.TraceCodeInjector",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Strings",
      "net.sf.saxon.s9api.streams.XdmCollectors",
      "net.sf.saxon.s9api.streams.XdmCollectors$XdmCollector",
      "net.sf.saxon.s9api.streams.XdmCollectors$2",
      "net.sf.saxon.expr.FunctionCall",
      "net.sf.saxon.expr.UserFunctionCall",
      "net.sf.saxon.functions.StaticContextAccessor",
      "net.sf.saxon.functions.StaticContextAccessor$DefaultCollation",
      "net.sf.saxon.expr.ErrorExpression",
      "net.sf.saxon.expr.BinaryExpression",
      "net.sf.saxon.expr.VennExpression",
      "net.sf.saxon.expr.SingletonIntersectExpression",
      "net.sf.saxon.expr.parser.ExpressionVisitor",
      "net.sf.saxon.expr.EarlyEvaluationContext",
      "net.sf.saxon.expr.flwor.TupleExpression",
      "net.sf.saxon.style.XSLUsePackage",
      "net.sf.saxon.expr.XPathContextMinor",
      "net.sf.saxon.expr.XPathContextMajor"
    );
  }
}