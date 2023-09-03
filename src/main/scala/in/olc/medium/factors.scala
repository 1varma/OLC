package in.olc.medium

import scala.io.StdIn.readLine

object factors {
  private def printDivisors(n: Int):Unit={
    for i <- 1 to math.sqrt(n).toInt do
      if n % i == 0 then
        if n/i == i then
          print(s"$i")
        else
          print(s"$i ${n/i} ")
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number: ").toInt
    printDivisors(math.abs(n))
  }
}