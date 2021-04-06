package com.example

case class Person(name: String, id: Int)

object Person {
  object Instances {
    // TODO #9: Define an Eq instance for Person comparing them by name
    //          Extra points: receive an implicit instance for String and use it
    implicit val eqPersonName: Eq[Person] = Eq.instance((fst, snd) => fst.name == snd.name)

    // For extra points :)
    //    implicit def eqPersonName2(implicit eqString: Eq[String]): Eq[Person] =
    //      Eq.instance((fst, snd) => eqString.eq(fst.name, snd.name))

    // TODO #10: Define an Eq instance for Person comparing them by id
    //           Extra points: receive an implicit instance for Int and use it
    implicit val eqPersonId: Eq[Person] = Eq.instance((fst, snd) => fst.id == snd.id)

    // For extra points :)
    //    implicit def eqPersonId2(implicit eqInt: Eq[Int]): Eq[Person] =
    //      Eq.instance((fst, snd) => eqInt.eq(fst.id, snd.id))
  }
}