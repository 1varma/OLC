package in.olc.array

import scala.io.StdIn.readLine

object nameAge {
  def main(args: Array[String]): Unit = {
    val names = readLine("Enter the names: ").split(" ")
    val age = readLine("Enter the age of those people: ").split(" ").map(_.toInt)

    val dict = names.zip(age).toMap

    val dict1 = dict.filter{case(name, age) => age >= 18}

    for i <- dict1 do
      println(s"${i._1} ${i._2}")
  }
}

//reema rahul suraj neha sumit priya ruhi suhani sunita aayushman
//14 45 29 18 29 23 10 19 21 9