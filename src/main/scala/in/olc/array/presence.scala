package in.olc.array

import scala.io.StdIn.readLine

object presence {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val num = readLine("Enter a number: ").toInt

    val index = arr.indexOf(num)

    if index != -1 then
      println(s"The index of the number in array is ${arr.indexOf(num)}")
    else
      println("It is not available")
  }
}