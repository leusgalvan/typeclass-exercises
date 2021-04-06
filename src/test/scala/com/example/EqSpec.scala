package com.example

import com.example.laws.EqLaws
import com.example.laws.discipline.EqTests

class EqSpec extends MySpec {
  // TODO #15: Write tests for every Eq instance (Int, String and Person)
  //           using Discipline and the 'checkAll' method
  object IntEqTests extends EqTests[Int] {
    override def laws: EqLaws[Int] = new EqLaws[Int] {
      override def eq: Eq[Int] = Eq.intEq
    }
  }

  object StringEqTests extends EqTests[String] {
    override def laws: EqLaws[String] = new EqLaws[String] {
      override def eq: Eq[String] = Eq.stringEq
    }
  }

  object PersonEqTests extends EqTests[Person] {
    override def laws: EqLaws[Person] = new EqLaws[Person] {
      override def eq: Eq[Person] = Eq.personEq
    }
  }

  checkAll("Eq[Int]", IntEqTests.eq)
  checkAll("Eq[String]", StringEqTests.eq)
  checkAll("Eq[Person]", PersonEqTests.eq)
}