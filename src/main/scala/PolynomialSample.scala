import spire.implicits.poly
import spire.math.poly.PolySparse
import spire.math.{Polynomial, Rational}

object PolynomialSample:
  val polynomialSample1: Polynomial[Rational] =
    poly"3x^2 - 5x + 1"

  def polynomialSample2(
    a: Rational,
    b: Rational,
    c: Rational
  ): Polynomial[Rational] =
    Polynomial(
      Map(
        2 -> a, // x^2 の係数
        1 -> b, // x の係数
        0 -> c // 定数
      )
    )
