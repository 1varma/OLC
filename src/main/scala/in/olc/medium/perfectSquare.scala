package in.olc.medium

import scala.io.StdIn.readLine

object perfectSquare {
  private def isPerfectSquare(n:Int):Boolean={
    if n >= 0 then
      val sr = math.sqrt(n).toInt
      sr * sr == n

    else
      false
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number: ").toInt

    if isPerfectSquare(n) then
      println(s"Yes the number $n is a perfect square")
    else
      println(s"No the number $n is not a perfect square")
  }
}