package in.olc.array

import scala.io.StdIn.readLine

object multiplesOfFive {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter only 10 numbers: ").split(" ").take(10).map(_.toInt)

    println(s"The multiples of 5 are ${arr.filter(_%5==0).mkString(", ")}")
  }
}