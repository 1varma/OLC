package in.olc.array

import scala.io.StdIn.readInt

object matrixAddition {
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

  private def matrixAddition(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = {
    val rows = matrix1.length
    val columns = matrix1(0).length

    // Initialize a new matrix with the same dimensions as the input matrices
    val resultMatrix = Array.ofDim[Int](rows, columns)

    for (i <- 0 until rows) {
      for (j <- 0 until columns) {
        resultMatrix(i)(j) = matrix1(i)(j) + matrix2(i)(j)
      }
    }

    resultMatrix
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of rows (m) for the matrices:")
    val m = readInt()

    println("Enter the number of columns (n) for the matrices:")
    val n = readInt()

    println("Enter values for matrix1:")
    val matrix1 = readMatrix(m, n)

    println("Enter values for matrix2:")
    val matrix2 = readMatrix(m, n)

    val resultMatrix = matrixAddition(matrix1, matrix2)

    // Displaying the result matrix
    println("Matrix1:")
    for (row <- matrix1) {
      println(row.mkString(", "))
    }

    println("Matrix2:")
    for (row <- matrix2) {
      println(row.mkString(", "))
    }

    println("Result Matrix (Matrix1 + Matrix2):")
    for (row <- resultMatrix) {
      println(row.mkString(", "))
    }
  }

}
