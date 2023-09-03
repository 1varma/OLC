package in.olc.medium

import scala.io.StdIn.readLine

object factorialRec {
  private def factorial(i: Int):Int={
    if i <= 1 then
      1
    else
      i*factorial(i-1)
  }
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    println(factorial(num))
  }
}