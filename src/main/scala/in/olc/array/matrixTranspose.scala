package in.olc.array

import scala.io.StdIn.readInt

object matrixTranspose {
  private def readMatrix(m: Int, n: Int): Array[Array[Int]] = {
    val matrix = Array.ofDim[Int](m, n)

    for (i <- 0 until m) {
      for (j <- 0 until n) {
        print(s"Enter value for row $i, column $j: ")
        matrix(i)(j) = readInt()
      }
    }

    matrix
  }

  private def transposeMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val rows = matrix.length
    val columns = matrix(0).length

    // Initialize a new matrix with dimensions interchanged
    val transposeMatrix = Array.ofDim[Int](columns, rows)

    for (i <- 0 until rows) {
      for (j <- 0 until columns) {
        transposeMatrix(j)(i) = matrix(i)(j)
      }
    }

    transposeMatrix
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of rows (m) for the matrix:")
    val m = readInt()

    println("Enter the number of columns (n) for the matrix:")
    val n = readInt()

    println("Enter values for the matrix:")
    val matrix = readMatrix(m, n)

    val transpose = transposeMatrix(matrix)

    // Displaying the original and transpose matrices
    println("Original Matrix:")
    for (row <- matrix) {
      println(row.mkString(", "))
    }

    println("Transpose Matrix:")
    for (row <- transpose) {
      println(row.mkString(", "))
    }
  }

}
