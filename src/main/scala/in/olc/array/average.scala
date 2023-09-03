package in.olc.array

import scala.io.StdIn.readLine

object average {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter 10 numbers only: ").split(" ").take(10).map(_.toDouble)

    println(s"The average of the numbers are ${arr.sum/arr.length}")
  }
}