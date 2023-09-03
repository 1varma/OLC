package in.olc.array

import scala.io.StdIn.readLine
import scala.collection.mutable

object FrequencyOfNumber {
  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into arr: ").split(" ").take(10).map(_.toInt)

    val frequencyMap = mutable.Map[Int, Int]().withDefaultValue(0)

    for number <- arr do
      frequencyMap(number) += 1

    println("Output:")
    frequencyMap.foreach{case (number, frequency) => println(s"$number $frequency")}
  }
}