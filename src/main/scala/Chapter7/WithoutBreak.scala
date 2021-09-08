package Chapter7

import java.util.Scanner

object WithoutBreak {
  def main(args: Array[String]) = {

    val s = new Scanner(System.in)
    val str = s.next()

    var i = 0
    var foundIt = false

    while(i < str.length && !foundIt){
      if(!str.startsWith("-")){
        if(str.endsWith(".scala"))
          foundIt = true
      }
      i = i+  1
    }
    println("foundIt="+foundIt +","+i)

    def searchForm( i : Int) : Int = {

      if(i <= str.length) -1
      -1
    }


  }


}
