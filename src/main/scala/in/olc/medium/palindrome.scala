package in.olc.medium

import scala.io.StdIn.readLine

object palindrome {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")

    if num == num.reverse then
      println(s"The number $num is a palindrome")
    else
      println(s"The number $num is not a palindrome")
  }
}