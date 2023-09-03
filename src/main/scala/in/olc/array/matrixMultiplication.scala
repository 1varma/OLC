package in.olc.array

import scala.io.StdIn.readInt

object matrixMultiplication {
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

  private def matrixMultiplication(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = {
    val rowsA = matrix1.length
    val colsA = matrix1(0).length
    val colsB = matrix2(0).length

    // Initialize a new matrix with the appropriate dimensions for the result
    val resultMatrix = Array.ofDim[Int](rowsA, colsB)

    for (i <- 0 until rowsA) {
      for (j <- 0 until colsB) {
        var sum = 0
        for (k <- 0 until colsA) {
          sum += matrix1(i)(k) * matrix2(k)(j)
        }
        resultMatrix(i)(j) = sum
      }
    }

    resultMatrix
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of rows (m) for Matrix A:")
    val m = readInt()

    println("Enter the number of columns (n) for Matrix A:")
    val n = readInt()

    println("Enter the number of columns (p) for Matrix B:")
    val p = scala.io.StdIn.readInt()

    if (n <= 0 || p <= 0) {
      throw new IllegalArgumentException("Number of columns in Matrix A and rows in Matrix B should be greater than 0.")
    }

    println("Enter values for Matrix A:")
    val matrixA = readMatrix(m, n)

    println("Enter values for Matrix B:")
    val matrixB = readMatrix(n, p)

    val resultMatrix = matrixMultiplication(matrixA, matrixB)

    // Displaying the result matrix
    println("Matrix A:")
    for (row <- matrixA) {
      println(row.mkString(", "))
    }

    println("Matrix B:")
    for (row <- matrixB) {
      println(row.mkString(", "))
    }

    println("Result Matrix (Matrix A * Matrix B):")
    for (row <- resultMatrix) {
      println(row.mkString(", "))
    }
  }
}
