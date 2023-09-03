package in.olc.Easy

import scala.io.StdIn.readLine

object studentMarks {
  def main(args: Array[String]): Unit = {
    val numStudents = 7
    val maxMarks = 1000

    println("Prepare to witness the marvel of mark calculation!")

    // Let's gather the marks of each student!
    val marksList = (1 to numStudents).map { studentNumber =>
      readLine(s"Enter the marks for Student $studentNumber (out of $maxMarks): ").toInt
    }

    // Calculate the total sum of marks
    val totalMarks = marksList.sum

    // Now, witness the grandeur of the average!
    val averageMarks = totalMarks.toDouble / numStudents

    // And here it is, the judgment day for students!
    if (averageMarks > 500) {
      println(s"Congratulations! Your average marks of $averageMarks are exceptional! Keep up the good work!")
    } else {
      println(s"Oh, seems like there's room for improvement. Your average marks of $averageMarks are a signal to work harder!")
    }
  }
}