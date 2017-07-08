package com.vackosar.scalaexamples

import org.junit._
import org.junit.Assert._

@Test
class CollectionsTest {

  @Test
  def mapArray(): Unit = {
    val array = Array(1, 2, 3).map(i => i + 1)
    assertArrayEquals(Array(2, 3, 4), array)
  }

  @Test
  def prependAndAppend(): Unit = {
    val array = Array(1, 2, 3, 4)
    assertArrayEquals(Array(1, 2, 3, 4, 5), array :+ 5)
    assertArrayEquals(Array(0, 1, 2, 3, 4), 0 +: array)
    assertEquals(List(1, 2, 3, 4, 5), array.toList :+ 5)
  }

  @Test
  def valuesAreEqualsUniqueInSet(): Unit = {
    case class A(a: Int)
    val set = Set(A(1), A(2), A(3), A(4))
    assertEquals(set, set + A(1))
  }
}
