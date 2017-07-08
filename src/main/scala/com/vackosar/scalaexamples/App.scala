package com.vackosar.scalaexamples

object App {

  def main(args: Array[String]): Unit = {
    println("Text")
    val a = A("Alpha")
    val b = A("Alpha")
    println(a == b)
    printHello()
  }

  def printHello(): Unit = {
    println("Hello")
  }

  case class A(a: String)

}
