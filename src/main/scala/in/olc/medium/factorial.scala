package in.olc.medium

import scala.io.StdIn.readLine

object factorial {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    var fact = 1

    for i<- 1 to num do
      fact *= i

    println(s"The factorial of $num is $fact")
  }
}