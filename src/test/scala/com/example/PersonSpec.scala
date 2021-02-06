package com.example

import com.example.laws.EqLaws
import com.example.laws.discipline.EqTests

class PersonSpec extends MySpec {
  // TODO #15: Escriba tests utilizando checkAll para las instancias adicionales
  //           definidas en el objeto Person
  object PersonIdEqTests extends EqTests[Person] {
    override def laws: EqLaws[Person] = new EqLaws[Person] {
      override def eq: Eq[Person] = Person.Instances.eqPersonId
    }
  }

  object PersonNameEqTests extends EqTests[Person] {
    override def laws: EqLaws[Person] = new EqLaws[Person] {
      override def eq: Eq[Person] = Person.Instances.eqPersonName
    }
  }

  checkAll("Eq[Person] by name", PersonNameEqTests.eq)
  checkAll("Eq[Person] by id", PersonIdEqTests.eq)
}
