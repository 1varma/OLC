package in.olc.Easy

import scala.io.StdIn.readLine

object TimeConversion {
  def main(args: Array[String]): Unit = {
    val days = readLine("Enter the number of days you wish to convert: ").toInt

    val years = days / 365
    val remainingDays = days % 365
    val weeks = remainingDays / 7
    val remainingDaysAfterWeeks = remainingDays % 7

    println(s"$days days is equal to:")
    println(s"Years: $years")
    println(s"Weeks: $weeks")
    println(s"Remaining Days: $remainingDaysAfterWeeks.")
  }
}
