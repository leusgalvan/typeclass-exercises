package com.example.laws.discipline

import com.example.laws.EqLaws
import org.typelevel.discipline.Laws

trait EqTests[A] extends Laws {
  def laws: EqLaws[A]

  // TODO #14: Declare un RuleSet que contenga las 3 leyes provistas en los ejercicios #11 - #13 en forma
  //           de propiedades de scalacheck
}
