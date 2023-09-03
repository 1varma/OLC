package in.olc.Easy

import scala.io.StdIn.readLine

object squareCube {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    println(s"The square of the number is: ${num * num}")
    println(s"Then double of the number is: ${num * num * num}")
  }
}
