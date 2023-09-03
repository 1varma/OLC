package in.olc.medium

import scala.io.StdIn.readLine

object reverseNumber {
  private def reverseInteger(x: Int): Int = {
    val reversed = x.toString.reverse
    if (x < 0) -reversed.dropRight(1).toInt else reversed.toInt
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    println(s"The reverse of the number is ${reverseInteger(num)}")
  }
}