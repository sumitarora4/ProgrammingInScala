package Chapter3

object ParameterizedArray {
  def main(args: Array[String]): Unit = {

    // 1) Normal way to create and initialize arrays
    val greetString = new Array[String](4)
    //    val greetStringNew : Array[String] = new Array[String](4)

    greetString(0) = "Sumit\n"
    greetString(1) = "kumar\n"
    greetString(2) = "Arora\n"
    greetString.update(3, "going forward")

    for(i <- 0 to 3){
      print(greetString(i))
//      print(greetString.apply(i))
    }

//    2) Concise way to create and initialize arrays
    val numArrays = Array(1 ,2, 3)
//    val numArrays = Array.apply(1 ,2, 3)

    for(i <- 0 to 2){
      print(numArrays(i)+ "\n")
    }

  }
}
