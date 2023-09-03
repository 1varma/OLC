package in.olc.array

import scala.io.StdIn.readLine

object bubbleSort {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val n = arr.length

    for (i <- 0 until n-1; j <- 0 until n-1-i) do
      if arr(j) > arr(j+1) then
        val temp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = temp

    println(s"${arr.mkString(", ")}")
  }
}