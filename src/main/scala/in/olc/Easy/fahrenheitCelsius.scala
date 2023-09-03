package in.olc.Easy

import scala.io.StdIn.readLine

object fahrenheitCelsius {
  def main(args: Array[String]): Unit = {
    val degree = readLine("Enter the temp in fahrenheit: ").toDouble

    println(s"The temp in Celsius is ${(degree - 32.0)*(5.0/9.0)}")
  }
}
