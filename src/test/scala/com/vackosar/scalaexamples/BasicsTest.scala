package com.vackosar.scalaexamples

import org.junit._
import org.junit.Assert._

@Test
class BasicsTest {

  @Test
  def caseClassesAreComparedStructurally(): Unit = {
    case class A(text: String)
    assertEquals(A("a"), A("a"))

  }

  @Test
  def caseObjectsAreSerializable(): Unit = {
    case object B { val text: String = "text"}
    assertTrue(B.isInstanceOf[Serializable])
    assertEquals("B", B.toString)
  }

  @Test
  def companionClassAccessedPrivateFieldsOfObject(): Unit = {
    object A { private val V = "text"}
    class A(val a: String = A.V)
    assertEquals("text", new A().a)
  }



}


