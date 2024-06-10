import spire.implicits.r
import spire.math.Rational

object RationalSample:
  def rationalSample1: Rational =
    val r1: Rational = Rational(1, 3)
    val r2: Rational = Rational(1, 2)
    r1 + r2

  def rationalSample2: Rational =
    // 以下のような書き方もできる
    r"7/9" * r"9/7"

  def serializeRationalType =
    val r = Rational(1, 2)

    // 1. String型
    // serialize
    val serialized = r.toString
    // deserialize
    val deserialized = Rational(serialized)

    // 2. 分子、分母に分ける
    // 分子
    val numerator = r.numerator
    // 分母
    val denominator = r.denominator
