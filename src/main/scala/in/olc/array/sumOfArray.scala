package in.olc.array

import scala.io.StdIn.readLine

object sumOfArray {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    println(s"The sum of all the elements in an Array: ${arr.sum}")
  }
}