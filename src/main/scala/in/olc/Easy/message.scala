package in.olc.Easy

import scala.io.StdIn.readLine

object message {
  def main(args: Array[String]): Unit = {
    val input = readLine("Enter numbers between 1 and 3: ").toInt

    if input ==1 then
      println("I can Dance")
    else if input == 2 then
      println("I can sing")
    else if input == 3 then
      println("I can swim")
    else
      println("Sorry Wrong Input")
  }
}
