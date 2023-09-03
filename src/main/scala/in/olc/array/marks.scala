package in.olc.array

import scala.io.StdIn.readLine

object marks {
  def main(args: Array[String]): Unit = {
    val marks = readLine("Enter marks of people: ").split(" ").map(_.toDouble)

    val n = marks.length

    println(s"The total marks is ${marks.sum}")
    println(s"The average marks is ${marks.sum/n}")
  }
}