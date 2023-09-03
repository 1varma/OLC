package in.olc.medium

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object fibonacciRec {
  private def fibonacci(n: Int):Unit={
    @tailrec
    def fiboHelper(n1:Int, n2:Int):Unit={
      if n2 > n then
        return
      else
        print(s"${n1 + n2} ")
        fiboHelper(n2, n1 + n2)
    }
    fiboHelper(0, 1)
  }

  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt
    print("0 1 ")
    fibonacci(num)
  }
}
