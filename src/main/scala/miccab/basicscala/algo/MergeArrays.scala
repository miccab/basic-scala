package miccab.basicscala.algo

/**
  * Created by michal on 02.04.16.
  */
object MergeArrays {

  def merge(left : Array[Int], right : Array[Int]) : Array[Int] = {
    if (left.isEmpty && right.isEmpty) {
      Array.emptyIntArray
    } else {
      val result = new Array[Int](left.length + right.length)
      var leftIndex, rightIndex, resultIndex = 0
      while (leftIndex < left.length && rightIndex < right.length) {
        if (left(leftIndex) < right(rightIndex)) {
          result(resultIndex) = left(leftIndex)
          leftIndex += 1
        } else {
          result(resultIndex) = right(rightIndex)
          rightIndex += 1
        }
        resultIndex += 1
      }
      copyRest(left, result, leftIndex, resultIndex)
      copyRest(right, result, rightIndex, resultIndex)
      result
    }
  }

  def copyRest(source: Array[Int], target: Array[Int], sourceIndex: Int, targetIndex: Int): Unit = {
    for (i <- sourceIndex until source.length) {
      target(targetIndex) = source(i)
    }
  }
}
