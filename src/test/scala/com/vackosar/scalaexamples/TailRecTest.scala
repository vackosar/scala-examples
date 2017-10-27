package com.vackosar.scalaexamples

import org.junit.{Assert, Test}

import scala.annotation.tailrec

@Test
class TailRecTest {

    @tailrec
    private def factorial(next: Int, previous: Int = 1): Int = {
        if (next > 1) {
            factorial(next - 1, previous * next)
        } else {
            previous
        }
    }

    @Test
    def test(): Unit = {
        Assert.assertEquals(6, factorial(3))
    }
}
