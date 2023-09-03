package in.olc.Easy

import scala.io.StdIn.readLine

object dayName {
  private def printDayName(dayNumber: Int): Unit = {
    val dayName = dayNumber match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Unknown day. Go back to the cave where days don't matter!"
    }

    println(s"Day number $dayNumber corresponds to the mind-blowing day of the week known as $dayName. Such excitement!")
  }

  def main(args: Array[String]): Unit = {

    val dayNumber = readLine("Enter number to get the day: ").toInt
    printDayName(dayNumber)
  }
}
