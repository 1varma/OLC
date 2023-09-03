package in.olc.Easy

import scala.io.StdIn.readLine

object compare {
  def main(args: Array[String]): Unit = {
    val Array(num1, num2) = readLine("Enter two numbers: ").split(" ").take(2).map(_.toInt)

    if num1 > num2 then
      println(s"The number $num1 is largest and number $num2 is smallest.")
    else if num1 < num2 then
      println(s"The number $num2 is largest and number $num1 is smallest.")
    else
      println(s"Both the numbers are equal.")
  }
}
