package in.olc.medium

import scala.io.StdIn.readLine

object automorphic {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    val sqrdNum = math.pow(num,2).toInt.toString
    //println(sqrdNum)

    if num.toString == sqrdNum.takeRight(1) then
      println(s"The number $num is a Automorphic Number")
    else
      println(s"The number $num is not a Automorphic Number")
  }
}
