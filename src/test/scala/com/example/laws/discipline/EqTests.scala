package com.example.laws.discipline

import com.example.laws.EqLaws
import org.scalacheck.Arbitrary
import org.scalacheck.Prop.forAll
import org.typelevel.discipline.Laws

trait EqTests[A] extends Laws {
  def laws: EqLaws[A]

  // TODO #13: Declare un RuleSet que contenga las 3 leyes provistas en los ejercicios #10 - #12 en forma
  //           de propiedades de scalacheck
  def eq(implicit arb: Arbitrary[A]): RuleSet = new DefaultRuleSet(
    name = "eq",
    parent = None,
    "reflexivity" -> forAll(laws.reflexivity _),
    "symmetry" -> forAll(laws.symmetry _),
    "transitivity" -> forAll(laws.transitivity _)
  )
}
