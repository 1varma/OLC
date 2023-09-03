package in.olc.medium

import scala.io.StdIn.readLine

object leapYear {
  def main(args: Array[String]): Unit = {
    val year = readLine("Enter year of birth: ").toInt
    val od = readLine("Enter observation year: ").toInt
    var count = 0

    for i <- year to od do
      if i % 400 == 0 || i % 100 != 0 && i % 4 == 0 then
        count += 1

    println(s"The number of leap years are: $count")
  }
}