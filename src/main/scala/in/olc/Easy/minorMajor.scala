package in.olc.Easy

import scala.io.StdIn.readLine

object minorMajor {
  def main(args: Array[String]): Unit = {
    val age = readLine("Enter the age of the person: ").toInt

    if age > 18 then
      println("The person is a major.")
    else
      println("The person is a minor.")
  }
}