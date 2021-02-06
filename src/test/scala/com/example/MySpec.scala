package com.example

import org.scalacheck.{Arbitrary, Gen}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.prop.Configuration
import org.typelevel.discipline.scalatest.FunSuiteDiscipline

trait MySpec extends AnyFunSuite with FunSuiteDiscipline with Configuration {
  implicit val arbPerson: Arbitrary[Person] = Arbitrary {
    for {
      name <- Gen.alphaNumStr
      id <- Gen.chooseNum(1, 100)
    } yield Person(name, id)
  }
}
