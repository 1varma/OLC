package in.olc.medium

import scala.io.StdIn.readLine

object primeNumber {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    var count = 0

    for i <- 2 to math.sqrt(num).toInt do
      if num % i == 0 then
        count += 1

    count match
      case 0 => println("Prime Number")
      case _ => println("Not a Prime Number")
  }
}