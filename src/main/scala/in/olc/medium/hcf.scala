package in.olc.medium

import scala.io.StdIn.readLine

object hcf {
  private def HCF(a:Int, b:Int):Int={
    if a == 0 then
      return b

    if b == 0 then
      return a

    if a == b then
      return a

    if a > b then
      return HCF(a-b, b)

    HCF(a, b-a)
  }

  def main(args: Array[String]): Unit = {
    val Array(num1, num2) = readLine("Enter two numbers: ").split(" ").take(2).map(_.toInt)
    println(s"The HCF of $num1, $num2 is ${HCF(num1,num2)}")
  }
}
