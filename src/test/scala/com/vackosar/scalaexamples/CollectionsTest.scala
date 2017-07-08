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

  @Test
  def options(): Unit = {
    assertEquals("something", Option(null).getOrElse("something"))
    assertEquals(None, Option(null))
    assertEquals("a", Some("a").get)
  }

  @Test
  def tuple(): Unit = {
    val tuple = (1, 2, 3)
    assertEquals(1, tuple._1)
    val (first, second, third) = tuple
    assertEquals(2, second)
  }

  @Test
  def map(): Unit = {
    val map = Map(1 -> 2, 2 -> 3)
    assertEquals(2, map(1))
    assertEquals(Some(3), map.get(2))
    assertEquals(None, map.get(4))
  }
}