package in.olc.Easy

object SimpleInterestCalculator {
  def main(args: Array[String]): Unit = {
    // Input principle, rate, and time
    val principle = scala.io.StdIn.readDouble()
    val rateOfInterest = scala.io.StdIn.readDouble()
    val time = scala.io.StdIn.readDouble()

    // Calculate simple interest
    val simpleInterest = calculateSimpleInterest(principle, rateOfInterest, time)

    // Display the simple interest
    println(s"Simple Interest: Rs $simpleInterest")
  }

  def calculateSimpleInterest(principle: Double, rate: Double, time: Double): Double = {
    val simpleInterest = principle * rate * time / 100
    simpleInterest
  }
}