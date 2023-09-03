package in.olc.array

import scala.io.StdIn.readLine

object printSeq {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)

    println(s"${arr.mkString(", ")}")
  }
}