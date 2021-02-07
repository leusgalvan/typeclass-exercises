package com.example

case class Person(name: String, id: Int)

object Person {
  object Instances {
    // TODO #9: Defina una instancia de Eq para Person que las compare por el campo name
    // Puntos extra: permitir que se pueda indicar como implicit la instancia de Eq para String
    implicit val eqPersonName: Eq[Person] = Eq.instance((fst, snd) => fst.name == snd.name)
    implicit def eqPersonName2(implicit eqString: Eq[String]): Eq[Person] =
      Eq.instance((fst, snd) => eqString.eq(fst.name, snd.name))

    // TODO #10: Defina una instancia de Eq para Person que las compare por el campo id
    // Puntos extra: permitir que se pueda indicar como implicit la instancia de Eq para Int
    implicit val eqPersonId: Eq[Person] = Eq.instance((fst, snd) => fst.id == snd.id)
    implicit def eqPersonId2(implicit eqInt: Eq[Int]): Eq[Person] =
      Eq.instance((fst, snd) => eqInt.eq(fst.id, snd.id))
  }
}