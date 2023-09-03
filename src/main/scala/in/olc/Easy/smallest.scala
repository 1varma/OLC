package in.olc.Easy

import scala.io.StdIn.readLine

object smallest {
  def main(args: Array[String]): Unit = {
    val Array(num1, num2, num3) = readLine("Enter three numbers: ").split(" ").take(3).map(_.toInt)

    println(s"The smallest number is ${math.min(num1, num2).min(num3)}")
  }
}
