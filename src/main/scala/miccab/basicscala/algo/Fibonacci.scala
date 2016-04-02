package miccab.basicscala.algo

import scala.annotation.tailrec

/**
  * Created by michal on 02.04.16.
  */
object Fibonacci extends App {

  println(fibImperative(14))
  println(fibRecursive(14))
  println(fibTailRecursive(14))

  def fibRecursive(n : Int) : Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibRecursive(n-1) + fibRecursive(n-2)
    }
  }

  def fibImperative(n : Int) : Int = {
    if (n < 1) {
      0
    } else if (n < 3) {
      1
    } else {
      var prev  = 1
      var prev2 = 1
      for (iter <- 3 to n) {
        val current = prev + prev2
        prev2 = prev
        prev = current
      }
      prev
    }
  }

  def fibTailRecursive(n : Int) : Int = {
    @tailrec
    def internalFib(n : Int, prev2 : Int, prev : Int): Int = n match {
      case 0 => prev
      case _ => internalFib(n-1, prev, prev + prev2)
    }
    internalFib(n-1, 0, 1)
  }
}
