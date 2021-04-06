package com.example

trait Eq[A] {
  // TODO #1: Define an 'eq' method that takes two A values as parameters, and returns a Boolean
}

object Eq {
  // TODO #2: Define the method 'apply' so we can summon instances from implicit scope

  // TODO #3: Define the method 'instance' so we can build instances of the Eq typeclass more easily.
  //          It should take as the only parameter a function of type (A, A) => Boolean

  // TODO #4: Define an Eq instance for String

  // TODO #5: Define an Eq instance for Int

  // TODO #6: Define an Eq instance for Person. Two persons are equal if both their names and ids are equal.
  //          Extra points: receive implicit instances for String and Int and use them

  // TODO #7: Provide a way to automatically derive instances for Eq[Option[A]] given that we have an implicit
  //          instance for Eq[A]

  object Syntax {
    // TODO #8: Define a class 'EqOps' with a method 'eqTo' that enables the following syntax:
    //          "hello".eqTo("world")
  }
}