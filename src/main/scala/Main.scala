import spire.implicits.r

@main def hello(): Unit =
  val r1 = RationalSample.rationalSample1
  val r2 = RationalSample.rationalSample2
  val r3 = PolynomialSample.polynomialSample1(r"2")
  val r4 = PolynomialSample.polynomialSample2(r"3", r"2", r"1")(r"2")
  println(r1)
  println(r2)
  println(r3)
  println(r4)
