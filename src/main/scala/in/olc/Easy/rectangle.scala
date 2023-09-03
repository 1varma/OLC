package in.olc.Easy

import scala.io.StdIn.readLine

object rectangle {
  def main(args: Array[String]): Unit = {
    val Array(length, width) = readLine("Enter the Length and Width: ").split(" ").take(2).map(_.toInt)

    println(s"The area of the rectangle ${length * width}")
    println(s"The perimeter of the rectangle ${2*(length + width)}")
  }
}
