package in.olc.Easy

import scala.io.StdIn.readLine

object evenOrOdd {
  def main(args: Array[String]): Unit = {
    val numArr = readLine("Enter numbers into array: ").split(" ").map(_.toInt).toList

    val evenResult = numArr.filter(_ % 2 == 0)
    val oddResult = numArr.filter(_ % 2 != 0)

    println(s"The even numbers are ${evenResult.mkString(", ")}")
    println(s"The odd numbers are ${oddResult.mkString(", ")}")
  }
}