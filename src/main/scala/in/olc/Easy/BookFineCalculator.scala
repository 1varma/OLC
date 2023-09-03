package in.olc.Easy

object BookFineCalculator {
  def main(args: Array[String]): Unit = {
    val daysLate = scala.io.StdIn.readInt()

    // Calculate the fine amount based on the number of days late
    val fineAmount = calculateFine(daysLate)

    // Display the fine amount
    println(s"Fine Amount: Rs $fineAmount")
  }

  private def calculateFine(daysLate: Int): Double = {
    val fineRate1 = 0.0 // No fine for the first 7 days
    val fineRate2 = 1.2 // Rs 1.2 per day for the next 5 days
    val fineRate3 = 1.75 // Rs 1.75 per day for the subsequent days after 12 days

    var fineAmount = 0.0

    if (daysLate > 0) {
      if (daysLate <= 7) {
        // No fine for the first 7 days
        fineAmount = fineRate1
      } else if (daysLate <= 12) {
        // Rs 1.2/day for the next 5 days (total 12 days)
        fineAmount = (daysLate - 7) * fineRate2
      } else {
        // Rs 1.75/day for the subsequent days after 12 days
        fineAmount = 5 * fineRate2 + (daysLate - 12) * fineRate3
      }
    }

    fineAmount
  }
}