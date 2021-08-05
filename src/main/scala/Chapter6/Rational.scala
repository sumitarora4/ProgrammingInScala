package Chapter6

class Rational(n: Int, d: Int) {

//   for rational number denominator should not be zero
//  other wise this will give result infinite
  require(d != 0)

  private  val g = gcd(n.abs, d.abs)
  val number: Int = n/g
  val denom: Int = d/g

//    println("Created"+ n +"/"+ d)
  override def toString = s"$number/$denom"

//   adding two rational numbers
  def add(that: Rational): Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom)

  }

//  tests whether the given Rational is smaller than a parameter
  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

// find greater of the given rational number and an argument
  def max(that: Rational) =
    if(this.lessThan(that)) that else this

//  auxiliary constructors uses: If denominator is 1 then rational
//  number is a normal number
  def this(n : Int) = this(n,1)

//  for normalize rational number
  private def gcd(a: Int, b: Int): Int =
    if(b ==0) a else gcd(b, a % b)

// define operator add operator
//  add operator for adding two rational number
  def + (that: Rational) : Rational =
    new Rational(number * that.denom + that.number * denom, denom * that.denom)

//  Method Overloading is uses: If rational number is multiply by any integer or
//  added by any integer or number
  def + (i : Int ): Rational =
    new Rational(number + i * denom , denom)

//  define operator subtract operator
//  subtract operator for adding two rational number
  def - (that: Rational) : Rational =
    new Rational(number * that.denom - that.number * denom, denom * that.denom)

//  Method Overloading is uses: If rational number is subtract by any integer
  def - (i : Int ): Rational =
    new Rational(number - i * denom , denom)

//  multiply operator for multiply two rational number
  def * (that: Rational): Rational =
    new Rational(number * that.number, denom * that.denom)

  //  Method Overloading is uses: If rational number is multiply by any integer
  def * (i : Int ): Rational =
    new Rational(number * i  , denom)

  //  divide operator for division of two rational number
  def / (that: Rational): Rational =
    new Rational(number * that.denom, denom * that.number)

  //  Method Overloading is uses: If rational number is divide by any integer
  def / (i : Int ): Rational =
    new Rational(number  , denom * i)

  implicit def intToRational(x : Int) = new Rational(x)

}




//object Rational {
//
//  def main(args: Array[String]): Unit = {
//
//  }
//}


