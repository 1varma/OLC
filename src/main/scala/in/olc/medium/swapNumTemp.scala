package in.olc.medium

import scala.io.StdIn.readLine

object swapNumTemp {
  def main(args: Array[String]): Unit = {
    var Array(num1, num2) = readLine("Enter two numbers: ").split(" ").take(2).map(_.toInt)

    println(s"The numbers before swap are $num1, $num2")

    val temp = num1
    num1 = num2
    num2 = temp

    println(s"The numbers after swap are $num1, $num2")
  }
}