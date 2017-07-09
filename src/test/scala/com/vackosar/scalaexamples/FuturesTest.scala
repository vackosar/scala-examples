package com.vackosar.scalaexamples

import java.util.concurrent.ForkJoinPool

import org.junit.Test
import org.junit.Assert._

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

@Test
class FuturesTest {

  @Test
  def future(): Unit = {
    implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(new ForkJoinPool())
    implicit val timeout = FiniteDuration(1, SECONDS)
    Future[Int]({1 + 2 + 3}).onComplete({
      case Success(sum) => assertEquals(6, sum)
      case Failure(_) => fail()
    })
    Future[Int]({1 + 2 + 3}).foreach({assertEquals(6, _)})
  }
}
