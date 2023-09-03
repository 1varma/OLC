package in.olc.medium

import scala.io.StdIn.readLine

object productDigit {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")
    var prod = 1

    for i <- 0 until num.length do
      prod *= num(i).asDigit

    println(s"Then product of Digits of the number $num is $prod")
  }
}