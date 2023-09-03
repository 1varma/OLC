package in.olc.medium

import scala.io.StdIn.readLine

object swapNum {
  def main(args: Array[String]): Unit = {
    var Array(num1, num2) = readLine("Enter two numbers: ").split(" ").take(2).map(_.toInt)
    val sum = num1+num2

    println(s"The numbers before swap $num1, $num2")

    num1 = sum - num1
    num2 = sum - num2

    println(s"The numbers after swap $num1, $num2")
  }
}