package in.olc.Easy

import scala.io.StdIn.readLine

object sphere {
  def main(args: Array[String]): Unit = {
    val radius = readLine("Enter the radius of the sphere: ").toDouble

    println(s"The volume of the sphere is ${4/3 * (3.14 * math.pow(radius, 3))}")
  }
}