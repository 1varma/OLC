package in.olc.array

import scala.io.StdIn.readLine

object SpiralMatrix {
  private def generateSpiralMatrix(n: Int): Array[Array[Int]] = {
    val matrix = Array.ofDim[Int](n, n)
    var left = 0
    var right = n - 1
    var top = 0
    var bottom = n - 1
    var num = 1

    while (num <= n * n) {
      for (i <- left to right) {
        matrix(top)(i) = num
        num += 1
      }
      top += 1

      for (i <- top to bottom) {
        matrix(i)(right) = num
        num += 1
      }
      right -= 1

      for (i <- right to left by -1) {
        matrix(bottom)(i) = num
        num += 1
      }
      bottom -= 1

      for (i <- bottom to top by -1) {
        matrix(i)(left) = num
        num += 1
      }
      left += 1
    }

    matrix
  }

  def main(args: Array[String]): Unit = {
    val n = readLine("Enter a number: ").toInt
    val matrix = generateSpiralMatrix(n)

    println("Spiral Matrix:")
    matrix.foreach(row => println(row.mkString("[", ", ", "]")))
  }
}
