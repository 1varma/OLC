package in.olc.array

import scala.io.StdIn.readLine

object highLow {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    println(s"Highest: ${arr.max}\nLowest: ${arr.min}")
  }
}