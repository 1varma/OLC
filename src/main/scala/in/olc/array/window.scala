package in.olc.array

import scala.io.StdIn.readLine

object window {
  private def maxSumInWindow(arr: Array[Int], windowSize: Int): Int = {
    if (windowSize <= 0 || windowSize > arr.length) {
      throw new IllegalArgumentException("Invalid window size")
    }

    var currentSum = arr.take(windowSize).sum
    var maxSum = currentSum

    for (i <- windowSize until arr.length) {
      currentSum = currentSum + arr(i) - arr(i - windowSize)
      maxSum = Math.max(maxSum, currentSum)
    }

    maxSum
  }

  def main(args: Array[String]): Unit = {
    val array = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val windowSize = readLine("Enter window size: ").toInt

    val maxSum = maxSumInWindow(array, windowSize)

    println("Array: " + array.mkString(", "))
    println("Window Size: " + windowSize)
    println("Maximum Sum in Window: " + maxSum)
  }

}
