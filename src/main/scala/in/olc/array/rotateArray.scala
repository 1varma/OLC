package in.olc.array

import scala.io.StdIn.readLine

object rotateArray {
  private def rotateArrayByN(arr: Array[Int], n: Int): Array[Int] = {
    if arr.length == 0 then
      arr
    else
      val rotatedPart = arr.take(n)
      val remainingPart = arr.drop(n)
      remainingPart ++ rotatedPart
  }

  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter numbers into the array: ").split(" ").map(_.toInt)
    val N = readLine("Enter value of n to rotate array: ").toInt
    val rotatedArray = rotateArrayByN(arr, N)
    println("Original Array: " + arr.mkString(", "))
    println("Rotated Array by " + N + " elements: " + rotatedArray.mkString(", "))
  }
}
