package in.olc.array

import scala.io.StdIn.readLine

object maxMin {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)

    println(s"Smallest = ${arr.min}\nGreatest = ${arr.max}")
  }
}