val someNumbers = List(-11,-10, -5, 0 , 5, 10)

someNumbers.foreach((x:Int) => println(x))

someNumbers.filter(
  x => x > 0
)

someNumbers.filter( _ > 0)

val f = (_: Int) + (_ : Int)
f(5, 10)

// partially applied function
someNumbers.foreach(println _)

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1,2,3)

val a = sum _
a(1,2,3)

val b = sum(1, _:Int, 3)
b(2)

someNumbers.foreach(println)

// closures
var more = 1
val addMore = (x: Int) => x + more
addMore(10)

more = 9999
addMore(10)

var sum1 = 0
someNumbers.foreach(sum1 += _)

sum1











