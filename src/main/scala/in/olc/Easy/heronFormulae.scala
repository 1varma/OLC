package in.olc.Easy

import scala.io.StdIn.readLine

object heronFormulae {
  def main(args: Array[String]): Unit = {
    val Array(a, b, c) = readLine("Enter the sides of triangle: ").split(" ").take(3).map(_.toInt)

    if (a > 0 & b > 0 & c > 0) then
      println(s"The area of the triangle is ${(a + b + c) / 2}")
    else
      println("Please enter correct lengths of the triangle")
  }
}