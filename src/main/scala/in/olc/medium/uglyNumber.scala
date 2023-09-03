package in.olc.medium

import scala.io.StdIn.readLine

object uglyNumber {
  def main(args: Array[String]): Unit = {
    var uglyNumberCount = 0
    val n = readLine("Enter a number: ").toInt

    for i <- 2 until Integer.MAX_VALUE do
      var num = i

      while num % 2 == 0 do
        num /= 2

      while num % 3 == 0 do
        num /= 3

      while num % 5 == 0 do
        num /= 5

      if num == 1 then
        uglyNumberCount += 1

      if uglyNumberCount == n then
        println(s"Ugly Number: ${i}")
        return
  }
}
