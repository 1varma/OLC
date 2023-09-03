package in.olc.Easy

object ElectricityBillCalculator {
  def main(args: Array[String]): Unit = {
    val fixedMonthlyCharge = 200.0
    val unitsConsumed = scala.io.StdIn.readDouble()

    // Calculate the bill amount based on the units consumed
    val billAmount = calculateBillAmount(unitsConsumed, fixedMonthlyCharge)

    // Display the bill amount
    println(s"Bill Amount: Rs $billAmount")
  }

  private def calculateBillAmount(units: Double, fixedCharge: Double): Double = {
    val rate1 = 1.20
    val rate2 = 2.50
    val rate3 = 4.0
    val rate4 = 5.50

    var billAmount = fixedCharge

    if (units <= 100) {
      billAmount += units * rate1
    } else if (units > 100 && units < 150) {
      billAmount += units * rate2
    } else if (units >= 150 && units < 400) {
      billAmount += units * rate3
    } else {
      billAmount += units * rate4
    }

    billAmount
  }
}
