/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 12 23:19:13 GMT 2024
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1, nodeFilter_FilterResult0, (NodeFilter.FilterResult) null, (NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      formElement0.addElement(document0);
      Elements elements0 = formElement0.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      formElement0.addElement(document0);
      Elements elements0 = formElement0.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("ik/cl}3", "#kI@1");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.SKIP_ENTIRELY;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, (Node) document0);
      assertEquals(NodeFilter.FilterResult.SKIP_ENTIRELY, nodeFilter_FilterResult1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("$a;Bw_.efvC::MhKf~", "$a;Bw_.efvC::MhKf~");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeTraversor.filter(nodeFilter0, (Node) document0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult1, nodeFilter_FilterResult1).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      formElement0.addElement(document0);
      Elements elements0 = formElement0.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult2).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      FormElement formElement1 = formElement0.addElement(document0);
      Elements elements0 = formElement1.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, (NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      FormElement formElement1 = formElement0.addElement(document0);
      Elements elements0 = formElement1.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      FormElement formElement1 = formElement0.addElement(document0);
      Elements elements0 = formElement1.elements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter((NodeFilter) null, (Node) null);
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      Tag tag0 = Tag.valueOf("yCu");
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.select.Evaluator$AttributeStarting", (Attributes) null);
      formElement0.addElement(document0);
      Elements elements0 = formElement0.elements();
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor.traverse(nodeVisitor0, elements0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeTraversor nodeTraversor0 = new NodeTraversor();
  }
}
