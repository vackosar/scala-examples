package com.vackosar.scalaexamples

import org.junit._
import org.junit.Assert._

@Test
class BasicsTest {



  @Test
  def caseClassAreComparedStructurally(): Unit = {
    case class A(text: String)
    assertEquals(A("a"), A("a"))
  }

  @Test
  def companionClassAcessedPrivateFieldsOfObject(): Unit = {
    object A { private val V = "text"}
    class A(val a: String = A.V)
    assertEquals("text", new A().a)
  }


}


