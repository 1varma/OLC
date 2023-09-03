package in.olc.medium

import scala.io.StdIn.readLine

object magicNum {
  private def MagicNumber(str: String):Unit={
    var sum = 0
    var n = str

    while n.length > 1 do
      sum = n.map(num => num.asDigit).sum
      n = sum.toString

    if sum == 1 then
      println("The number is a Magic Number")
    else
      println("The number is not a Magic Number")
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ")
    MagicNumber(num)
  }
}
