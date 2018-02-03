package com.vackosar.scalaexamples

import com.google.gson.Gson
import org.junit.{Assert, Test}

@Test
class GsonTest {

  case class TestObject(value: Int)

  @Test
  def test(): Unit = {
    Assert.assertEquals("{\"value\":1}", new Gson().toJson(TestObject(1)))
  }

}
