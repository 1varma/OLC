package in.olc.Easy

object RectangleDiagonalCalculator {
  def main(args: Array[String]): Unit = {
    // Input height and width
    val height = scala.io.StdIn.readDouble()
    val width = scala.io.StdIn.readDouble()

    // Calculate the diagonal of the rectangle
    val diagonal = calculateDiagonal(height, width)

    // Display the diagonal
    println(s"Diagonal: $diagonal")
  }

  def calculateDiagonal(height: Double, width: Double): Double = {
    val diagonal = math.sqrt(height * height + width * width)
    diagonal
  }
}
