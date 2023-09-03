package in.olc.Easy

import scala.io.StdIn.readLine

object square {
  def main(args: Array[String]): Unit = {
    val length = readLine("Enter the length of the side of Square: ").toInt

    println(s"The area of the square is: ${length * length}")
    println(s"Then perimeter of the square is: ${4 * length}")
  }
}