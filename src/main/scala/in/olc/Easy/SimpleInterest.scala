package in.olc.Easy

import scala.io.StdIn.readLine

object SimpleInterest {
  def main(args: Array[String]): Unit = {
    val principal = readLine("Enter the principal amount: ").toDouble
    val rateOfInterest = readLine("Enter the rate of interest (in percentage): ").toDouble
    val timePeriod = readLine("Enter the time period (in years): ").toDouble

    val simpleInterest = (principal * rateOfInterest * timePeriod) / 100

    val totalAmount = principal + simpleInterest

    println(s"Buckle up! The Simple Interest is: $simpleInterest")
    println(s"And the Total Amount after interest is: $totalAmount.")
  }
}
