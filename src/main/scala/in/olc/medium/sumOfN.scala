package in.olc.medium

import scala.io.StdIn.readLine

object sumOfN {
  private def sumOfNaturalNumbers(i: Int):Int={
    if i <= 1 then
      return 1
    i + sumOfNaturalNumbers(i-1)
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number: ").toInt

    print(s"The sum of $n natural numbers is ${sumOfNaturalNumbers(n)}")
  }
}