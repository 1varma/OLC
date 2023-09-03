package in.olc.medium

import scala.io.StdIn.readLine

object specialTwoDigit {
  private def specialNumber(str: String):Unit={
    var n = 0
    var m = 0

    if str.length == 2 then
      n = str.map(n => n.asDigit).sum
      m = str.map(n => n.asDigit).product

    else
      println("The entered number is not a 2 digit number")

    if str.toInt == (n+m) then
      println(s"Then number $str is a Special Number")
    else
      println(s"The number $str is not a Special Number")
  }
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")
    specialNumber(num)
  }
}
