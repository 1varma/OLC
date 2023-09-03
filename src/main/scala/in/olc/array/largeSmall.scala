package in.olc.array

import scala.io.StdIn.readLine

object largeSmall {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)

    println(s"Largest: ${arr.max}\nSmallest: ${arr.min}")
  }
}