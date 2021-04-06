package com.example.laws.discipline

import com.example.laws.EqLaws
import org.typelevel.discipline.Laws

trait EqTests[A] extends Laws {
  def laws: EqLaws[A]

  // TODO #14: Define a RuleSet containing the laws in EqLaws
}
