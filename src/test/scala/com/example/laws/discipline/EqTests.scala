package com.example.laws.discipline

import com.example.laws.EqLaws
import org.scalacheck.Arbitrary
import org.scalacheck.Prop.forAll
import org.typelevel.discipline.Laws

trait EqTests[A] extends Laws {
  def laws: EqLaws[A]

  // TODO #14: Define a RuleSet containing the laws in EqLaws
  def eq(implicit arb: Arbitrary[A]): RuleSet = new DefaultRuleSet(
    name = "eq",
    parent = None,
    "reflexivity" -> forAll(laws.reflexivity _),
    "symmetry" -> forAll(laws.symmetry _),
    "transitivity" -> forAll(laws.transitivity _)
  )
}
