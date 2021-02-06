package com.example

object Main {
  def main(args: Array[String]): Unit = {
    import Eq.Syntax._
    println(1.eqTo(1))
  }
}
