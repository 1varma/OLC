package in.olc.array

import scala.io.StdIn.readLine

object triplets {
  def main(args: Array[String]): Unit = {
    val arr1 = readLine("Enter only 3 numbers: ").split(" ").take(3).map(_.toInt)
    val arr2 = readLine("Enter only 3 numbers: ").split(" ").take(3).map(_.toInt)

    var a = 0
    var b = 0

    if arr1.length == 3 && arr2.length == 3 then
      for i <- 0 until 3 do
        if arr1(i) > arr2(i) then
          a += 1
        else if arr2(i) > arr1(i) then
          b += 1
        else
          a += 0
          b += 0
    else
      println("Enter correct number of inputs")

    if a > b then
      println(s"The winner is array1 with $a votes")
    else if b > a then
      println(s"The winner is array2 with $b votes")
    else
      println(s"Its a draw")
  }
}
