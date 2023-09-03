package in.olc.medium

import scala.io.StdIn.readLine

object nPrimeNum {
  private def isPrime(num: Int): Boolean = {
    if (num <= 1)
      return false
    for (i <- 2 until math.sqrt(num).toInt) {
      if (num % i == 0)
        return false
    }
    true
  }

  private def printPrimeNumbers(n: Int): Unit = {
    var number = 2
    while (number < n) {
      if (isPrime(number)) {
        print(s"$number ")
      }
      number += 1
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number: ").toInt
    printPrimeNumbers(n)
  }
}
