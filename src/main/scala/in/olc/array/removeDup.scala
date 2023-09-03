package in.olc.array

import scala.io.StdIn.readLine

object removeDup {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)

    val unique = arr.distinct

    println(s"The updated duplicate free array: ${unique.mkString(", ")}")
  }
}