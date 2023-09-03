package in.olc.array

import scala.io.StdIn.readLine

object addOne {
  private def addOneToArray(arr: Array[Int]): Array[Int] = {
    var carry = 1 // Start with a carry of 1
    val result = arr.reverse.map { digit =>
      val sum = digit + carry
      carry = sum / 10 // Update carry for the next iteration
      sum % 10 // Update the digit for the result array
    }
    if (carry > 0) {
      carry +: result.reverse // If there's a carry left, prepend it to the result array
    } else {
      result.reverse
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)

    val result = addOneToArray(arr)

    println(s"Input: ${arr.mkString(", ")}")
    println(s"Output: ${result.mkString(", ")}")
  }
}