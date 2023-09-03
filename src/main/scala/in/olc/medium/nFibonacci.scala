package in.olc.medium

import scala.io.StdIn.readLine

object nFibonacci {
  private def fibo(n:Int):Unit={
    var num1 = 0
    var num2 = 1
    print(s"$num1 $num2 ")
    while num2 < n do
      val temp = num2
      num2 = num1 + num2
      num1 = temp
      if num2 < n then
        print(s"$num2 ")
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    fibo(num)
  }
}