package in.olc.Easy

import scala.io.StdIn.readLine

object circle {
  def main(args: Array[String]): Unit = {
    val radius = readLine("Enter radius of the circle: ").toInt

    println(s"The area of the circle is: ${3.14 * radius * radius}")
    println(s"The circumference of the circle is: ${2 * 3.14 * radius}")
  }
}
