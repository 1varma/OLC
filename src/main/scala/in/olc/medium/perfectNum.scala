package in.olc.medium

import scala.io.StdIn.readLine

object perfectNum {
  private def isPerfectNumber(number: Int): Boolean = {
    if number <= 0 then
      false
    else
      val divisorsSum = (1 until number).filter(number % _ == 0).sum
      number == divisorsSum
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    if (isPerfectNumber(num)) then
      println(s"$num is a perfect number.")
    else
      println(s"$num is not a perfect number.")
  }
}
