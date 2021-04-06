package com.example

trait Eq[A] {
  // TODO #1: Define an 'eq' method that takes two A values as parameters, and returns a Boolean
  def eq(fst: A, snd: A): Boolean
}

object Eq {
  // TODO #2: Define the method 'apply' so we can summon instances from implicit scope
  def apply[A](implicit ev: Eq[A]): Eq[A] = ev

  // TODO #3: Define the method 'instance' so we can build instances of the Eq typeclass more easily.
  //          It should take as the only parameter a function of type (A, A) => Boolean
  def instance[A](f: (A, A) => Boolean): Eq[A] = new Eq[A] {
    override def eq(fst: A, snd: A): Boolean = f(fst, snd)
  }

  // TODO #4: Define an Eq instance for String
  implicit val stringEq: Eq[String] = instance[String]((fst, snd) => fst == snd)

  // TODO #5: Define an Eq instance for Int
  implicit val intEq: Eq[Int] = instance[Int]((fst, snd) => fst == snd)

  // TODO #6: Define an Eq instance for Person. Two persons are equal if both their names and ids are equal.
  //          Extra points: receive implicit instances for String and Int and use them
  implicit val personEq: Eq[Person] = instance[Person]((fst, snd) => fst.name == snd.name && fst.id == snd.id)

  // For extra points :)
  implicit def personEq2(implicit eqInt: Eq[Int], eqString: Eq[String]): Eq[Person] =
    instance[Person]((fst, snd) => eqString.eq(fst.name, snd.name) && eqInt.eq(fst.id, snd.id))

  // TODO #7: Provide a way to automatically derive instances for Eq[Option[A]] given that we have an implicit
  //          instance for Eq[A]
  implicit def optEq[A](implicit eqA: Eq[A]): Eq[Option[A]] = instance[Option[A]]{
    case (Some(fst), Some(snd)) => eqA.eq(fst, snd)
    case (None, None) => true
    case _ => false
  }

  object Syntax {
    // TODO #8: Define a class 'EqOps' with a method 'eqTo' that enables the following syntax:
    //          "hello".eqTo("world")
    implicit class EqOps[A](a: A) {
      def eqTo(other: A)(implicit eqA: Eq[A]): Boolean = eqA.eq(a, other)
    }
  }
}