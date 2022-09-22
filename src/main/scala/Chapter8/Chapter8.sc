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

///============================
// Repeated Parameters

def echo(args: String*)= for( arg <- args) println(arg)

echo()
echo("one")
echo("one", "two","three")


val seq = Seq("what's","up","doc?")

//echo(seq)

echo(seq: _*)

// Named Arguments

def speed(distance: Float, time: Float): Float = distance/time

speed(100,10)

speed(distance = 100, time = 10)

speed(time=10, distance= 100)

// default parameters values
def printTime2(out: java.io.PrintStream= Console.out, divisor: Int =1) =
  out.println("time="+ System.currentTimeMillis())


printTime2(out= Console.err)

printTime2(divisor = 1000)

// Named
def area(l: Float , w: Float): Float = l * w

area(2, 6)
area(l = 2, w = 6)
area(w= 6, l =2)


// default
def Point( x: Int = 10,  y: Int = 20) =  x + y

println(Point())

Point(x = 11)





















