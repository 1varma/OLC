package in.olc.array

import scala.io.StdIn.readLine

object leaders {
  private def findLeaders(arr: Array[Int]): List[Int] = {
    var maxSoFar = Integer.MIN_VALUE
    val leaders = scala.collection.mutable.ListBuffer.empty[Int]

    for (i <- arr.length - 1 to 0 by -1) {
      if (arr(i) > maxSoFar) {
        maxSoFar = arr(i)
        leaders.prepend(maxSoFar)
      }
    }

    leaders.toList
  }

  def main(args: Array[String]): Unit = {
    val inputArray = readLine("Enter numbers into array: ").split(" ").map(_.toInt)
    val leaders = findLeaders(inputArray)

    println("Input Array: " + inputArray.mkString(", "))
    println("Leaders: " + leaders.mkString(", "))
  }

}
