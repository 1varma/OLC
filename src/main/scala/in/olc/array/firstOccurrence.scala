package in.olc.array

import scala.io.StdIn.readLine

object firstOccurrence {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val num = readLine("Enter number to search: ").toInt
    var flag = false

    for i <- arr do
      if i == num then
        println(s"Number found at position ${arr.indexOf(i)+1}")
        flag = true
        return

    if flag == false then
      println(s"The number $num is not found in the array")
  }
}
