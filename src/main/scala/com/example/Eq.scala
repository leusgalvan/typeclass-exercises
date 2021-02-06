package com.example

trait Eq[A] {
  // TODO #1: Defina un metodo 'eq' que tome como argumentos dos valores a comparar y devuelva un Boolean
  def eq(fst: A, snd: A): Boolean
}

object Eq {
  // TODO #2: defina un metodo 'apply' que permita traer instancias presentes del scope implicito ('summoner').
  def apply[A](implicit ev: Eq[A]): Eq[A] = ev

  // TODO #3: Defina un metodo 'instance' que tome como unico argumento una funcion que
  //          tome dos argumentos y devuelva un true si y solo si ambos valores son iguales.
  def instance[A](f: (A, A) => Boolean): Eq[A] = new Eq[A] {
    override def eq(fst: A, snd: A): Boolean = f(fst, snd)
  }

  // TODO #4: Defina una instancia de Eq para String
  implicit val intEq: Eq[Int] = instance[Int]((fst, snd) => fst == snd)

  // TODO #5: Defina una instancia de Eq para Int
  implicit val stringEq: Eq[String] = instance[String]((fst, snd) => fst == snd)

  // TODO #6: Defina una instancia de Eq para Person que las compare por ambos campos
  // Puntos extra: permitir que se pueda indicar como implicits las instancias de Eq para Int y String
  implicit val personEq: Eq[Person] = instance[Person]((fst, snd) => fst.name == snd.name && fst.id == snd.id)
//  implicit def personEq2(implicit eqInt: Eq[Int], eqString: Eq[String]): Eq[Person] =
//    instance[Person]((fst, snd) => fst.name == snd.name && fst.id == snd.id)

  // TODO #7: Provea una forma de obtener instancias de Eq[Option[A]] donde A tiene una instancia de Ord.
  implicit def optEq[A](implicit eqA: Eq[A]): Eq[Option[A]] = instance[Option[A]]{
    case (Some(fst), Some(snd)) => eqA.eq(fst, snd)
    case (None, None) => true
    case _ => false
  }

  object Syntax {
    // TODO #8: Provea una clase EqOps y dentro un metodo 'eq'
    implicit class EqOps[A](a: A) {
      def eqTo(other: A)(implicit eqA: Eq[A]): Boolean = eqA.eq(a, other)
    }
  }
}