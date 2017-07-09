package com.vackosar.scalaexamples

import org.junit.Test
import org.junit.Assert._

import scala.util.{Failure, Success, Try}

@Test
class FailuresTest {

  @Test
  def tryCatchFinally(): Unit = {
    var a = 0
    val result = try {
      "s".toInt
    } catch {
      case e: NumberFormatException => 0
    } finally {
      a = 2
    }
    assertEquals(0, result)
    assertEquals(2, a)
  }

  @Test
  def SuccessAndFailure(): Unit = {
    val toInt = (s: String) => Try(s.toInt)
    assertEquals(Success(100), toInt("100"))
    assertTrue(toInt("100x").isInstanceOf[Failure[NumberFormatException]])

  }

  @Test
  def failuresAreNotPropagatedInHOF(): Unit = {
    Failure(new NumberFormatException).foreach(_ => fail())
  }

}
