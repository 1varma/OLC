package in.olc.medium

import scala.io.StdIn.readLine

object armstrong {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")
    var temp = 0

    for i <- 0 until num.length do
      temp += math.pow(num(i).asDigit, num.length).toInt

    if temp == num.toInt then
      println("The number is a Armstrong Number")
    else
      println("The number is not a Armstrong Number")
  }
}