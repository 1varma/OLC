package in.olc.medium

import scala.io.StdIn.readLine

object happyNum {
  private def isHappyNumber(num: Int): Boolean = {
    var n = num
    var visited = Set[Int]()
    while (n != 1 && !visited.contains(n)) {
      visited += n
      n = calculateSumOfSquares(n)
    }
    n == 1
  }

  private def calculateSumOfSquares(num: Int): Int = {
    num.toString.map(digit => digit.asDigit * digit.asDigit).sum
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    val isHappy = isHappyNumber(num)
    if (isHappy) {
      println(s"$num is a happy number.")
    } else {
      println(s"$num is not a happy number.")
    }
  }
}
