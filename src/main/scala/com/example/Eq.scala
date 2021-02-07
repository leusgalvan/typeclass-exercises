package com.example

/**
 * Typeclass implementada por tipos que tengan una nocion de igualdad.
 *
 * eq(a, b) quiere decir que a es igual a b bajo esta definicion de igualdad.
 */
trait Eq[A] {
  // TODO #1: Defina un metodo 'eq' que tome como argumentos dos valores a comparar y devuelva un Boolean
}

object Eq {
  // TODO #2: defina un metodo 'apply' que permita traer instancias presentes del scope implicito ('summoner').

  // TODO #3: Defina un metodo 'instance' para facilitar la creacion de instancias; debe tomar como unico
  //          argumento una funcion.

  // TODO #4: Defina una instancia de Eq para String

  // TODO #5: Defina una instancia de Eq para Int

  // TODO #6: Defina una instancia de Eq para Person que las compare por ambos campos
  // Puntos extra: permitir que se pueda indicar como implicits las instancias de Eq para Int y String

  // TODO #7: Provea una forma de obtener instancias de Eq[Option[A]] donde A tiene una instancia de Eq.

  object Syntax {
    // TODO #8: Provea una clase EqOps y dentro un metodo 'eqTo' que permita utilizar expresiones como
    //          "hola".eqTo("chau")
  }
}