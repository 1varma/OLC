package in.olc.medium

object FibonacciSeries {
  private def fibonacci(n: Int): Int = {
    if n <= 1 then
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    println("First 10 Fibonacci numbers:")
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
  }
}