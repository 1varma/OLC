package in.olc.array

import scala.io.StdIn.readLine

object binarySearch {
  private def binarySearch(arr: Array[Int], target: Int): Int = {
    var left = 0
    var right = arr.length - 1

    while (left <= right) {
      val mid = left + (right - left) / 2

      if (arr(mid) == target) {
        return mid
      } else if (arr(mid) < target) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }

    // If the target is not found, return -1
    -1
  }

  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val target = readLine("Enter a number: ").toInt

    val index = binarySearch(arr, target)

    if (index != -1) {
      println(s"The number $target is found at index $index.")
    } else {
      println(s"The number $target is not found in the array.")
    }
  }
}
