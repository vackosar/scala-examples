package com.vackosar.scalaexamples

import org.junit.{Assert, Test}
//import scala.reflect.api.TypeTags._
//import scala.reflect.api.TypeTags.
import scala.reflect.runtime.universe._

@Test
class TypeTagTest {


  def implicitTypeTagResolution[T](list: List[T])(implicit t: TypeTag[T]): String = {
    if (t.tpe =:= typeOf[String]) {
      "String"
    } else {
      "Other"
    }
  }

  @Test
  def extractViaImplicitParam(): Unit = {
    Assert.assertEquals("String", explicitTypeTagResolution(List("a", "b", "c")))
    Assert.assertEquals("Other", explicitTypeTagResolution(List(1, 2, 3)))
  }

  def explicitTypeTagResolution[T: TypeTag](list: List[T]): String = {
    if (typeOf[T] =:= typeOf[String]) {
      "String"
    } else {
      "Other"
    }
  }

  @Test
  def extractViaExplicit(): Unit = {
    Assert.assertEquals("String", explicitTypeTagResolution(List("a", "b", "c")))
    Assert.assertEquals("Other", explicitTypeTagResolution(List(1, 2, 3)))
  }


}
