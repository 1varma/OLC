package in.olc.Easy

import scala.io.StdIn.readLine

object compareThree {
  def main(args: Array[String]): Unit = {
    val Array(num1, num2, num3) = readLine("Enter three numbers, and let the thrill begin: ").split(" ").map(_.toInt)

    val largest = num1.max(num2).max(num3)
    val smallest = num1.min(num2).min(num3)

    if (num1 == num2 && num2 == num3) {
      println(s"Wow, all the numbers are equal. This is truly a historic moment!")
    } else {
      println(s"Drumroll, please! The largest number is $largest, and the smallest number is $smallest. Mind-blowing, right? 🎉")
    }
  }
}