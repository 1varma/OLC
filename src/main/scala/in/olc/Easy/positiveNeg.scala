package in.olc.Easy

import scala.io.StdIn.readLine

object positiveNeg {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    if num > 0 then
      println(s"The number $num is positive.")
    else if num < 0 then
      println(s"The number $num is negative.")
    else
      println(s"The number $num is zero.")
  }
}