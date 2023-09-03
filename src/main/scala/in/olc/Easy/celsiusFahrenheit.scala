package in.olc.Easy

import scala.io.StdIn.readLine

object celsiusFahrenheit {
  def main(args: Array[String]): Unit = {
    val degree = readLine("Enter the temp in celsius: ").toDouble

    println(s"The temp in Fahrenheit is ${degree * 1.8 + 32.0}")
  }
}