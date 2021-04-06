package com.example

case class Person(name: String, id: Int)

object Person {
  object Instances {
    // TODO #9: Define an Eq instance for Person comparing them by name
    //          Extra points: receive an implicit instance for String and use it

    // TODO #10: Define an Eq instance for Person comparing them by id
    //           Extra points: receive an implicit instance for Int and use it
  }
}