package Chapter3

object UseLists {

  def main(args: Array[String]):Unit = {

    val oneTwoThree = List(1,2,3)
    val threeFour = List(3,4)

    val newList = oneTwoThree ::: threeFour
    print(newList)

    val twoThree = List(2,3)
    val onneTwoThree = 1 :: twoThree

    print(onneTwoThree)


  }

}
