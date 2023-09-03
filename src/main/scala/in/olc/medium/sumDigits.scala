package in.olc.medium

import scala.io.StdIn.readLine

object sumDigits {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")
    var sum = 0

    for i <- 0 until num.length do
      sum += num(i).asDigit

    println(s"The sum of the $num is $sum")
  }
}
