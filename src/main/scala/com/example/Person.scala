package com.example

case class Person(name: String, id: Int)

object Person {
  object Instances {
    // TODO #9: Defina una instancia de Eq para Person que las compare por el campo name
    // Puntos extra: permitir que se pueda indicar como implicit la instancia de Eq para String

    // TODO #10: Defina una instancia de Eq para Person que las compare por el campo id
    // Puntos extra: permitir que se pueda indicar como implicit la instancia de Eq para Int
  }
}