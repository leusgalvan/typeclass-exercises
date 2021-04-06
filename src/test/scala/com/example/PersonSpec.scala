package com.example

import com.example.laws.EqLaws
import com.example.laws.discipline.EqTests

class PersonSpec extends MySpec {
  // TODO #16: Write tests for additional Eq instances defined in Person using
  //           Discipline and the 'checkAll' method
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
