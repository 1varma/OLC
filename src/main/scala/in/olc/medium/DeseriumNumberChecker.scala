package in.olc.medium

import scala.io.StdIn.readLine

object DeseriumNumberChecker {
  def isDeseriumNumber(number: Int): Boolean = {
    val digits = number.toString.map(_.asDigit)
    val powerSum = digits.zipWithIndex.map { case (digit, index) => math.pow(digit, index + 1) }.sum.toInt
    number == powerSum
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    if (isDeseriumNumber(num)) {
      println(s"$num is a Deserium number.")
    } else {
      println(s"$num is not a Deserium number.")
    }
  }
}
