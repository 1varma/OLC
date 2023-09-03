package in.olc.medium

import scala.io.StdIn.readLine

object specialNum {
  private def factorial(n:Int):Int={
    var fact = 1

    for i <- 2 to n do
      fact *= i

    fact
  }

  private def isSpecial(n: Int):Boolean={
    val num = n.toString

    num.map(number => factorial(number.asDigit)).sum == n
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    if isSpecial(num) then
      println(s"The number $num is a Special Number")
    else
      println(s"The number $num is not a Special Number")
  }
}
