package com.example.laws

import com.example.Eq

trait EqLaws[A] {
  def eq: Eq[A]

  // TODO #11: Definir la propiedad 'reflexivity' que chequea que un valor es igual a si mismo
  def reflexivity(a: A): Boolean = eq.eq(a, a)

  // TODO #12: Definir la propiedad 'symmetry' que chequea que la igualdad entre 'x' e 'y' es equivalente a la
  //           igualdad entre 'y' y 'x'.
  def symmetry(x: A, y: A): Boolean = eq.eq(x, y) == eq.eq(y, x)

  // TODO #13: Definir la propiedad 'transitivity' que chequea que si 'x' es igual a 'y', e 'y' es igual a 'z',
  //           entonces 'x' es igual a 'z'.
  //           PISTA: La proposicion 'Si p entonces q' puede expresarse como !p || q
  def transitivity(x: A, y: A, z: A): Boolean = !(eq.eq(x, y) && eq.eq(y, z)) || eq.eq(x, z)
}
