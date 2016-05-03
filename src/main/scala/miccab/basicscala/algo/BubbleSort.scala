package miccab.basicscala.algo

import scala.math.Ordering

/**
  * Created by michal on 03.05.16.
  */
object BubbleSort {
  def sort[T, B >: T](toBeSorted : Array[T])(implicit ord: Ordering[B]): Unit = {
    if (toBeSorted.length > 1) {
      for (toBeSortedIndex <- 1 until toBeSorted.length) {
        val toBeSortedValue = toBeSorted(toBeSortedIndex)
        for (toBeComparedIndex <- 0 until toBeSortedIndex reverse;
             if ord.lt(toBeSortedValue, toBeSorted(toBeComparedIndex))) {
          toBeSorted(toBeComparedIndex+1) = toBeSorted(toBeComparedIndex)
          toBeSorted(toBeComparedIndex) = toBeSortedValue
        }
      }
    }
  }
}
