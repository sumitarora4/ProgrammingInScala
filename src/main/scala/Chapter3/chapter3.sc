val s = 'S'
print(s)


// ---- map function

val list = List(1,2,3)

def map[A](f: Int => A, list: List[Int]): List[A] = {
  for{
    x<- list
  }yield f(x)
}

def multiplyBy2(i: Int): Int = i * 2

map(multiplyBy2, list)

//= ---- filter function ---

def filter[A](f: A => Boolean, list: List[A]): List[A] = {
  for{
    x <- list
    if(f(x))
  } yield x
}

def isDivisibleBy2(i: Int): Boolean = i % 2 == 0

list.filter(isDivisibleBy2)







