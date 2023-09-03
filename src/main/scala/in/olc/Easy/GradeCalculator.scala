package in.olc.Easy

object GradeCalculator {
  def main(args: Array[String]): Unit = {
    val numberOfSubjects = 5
    var sum = 0
    var subjectMarks = 0

    // Input marks for each subject
    for (i <- 1 to numberOfSubjects) {
      print(s"Enter the marks for subject $i: ")
      subjectMarks = scala.io.StdIn.readInt()
      sum += subjectMarks
    }

    // Calculate average
    val average = sum.toDouble / numberOfSubjects

    // Determine grade based on the average
    val grade =
      if (average >= 90) "A"
      else if (average >= 70) "B"
      else if (average >= 40) "C"
      else "E"

    // Display average and grade
    println(s"Average: $average")
    println(s"Grade: $grade")
  }
}
