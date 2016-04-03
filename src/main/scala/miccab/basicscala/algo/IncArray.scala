package miccab.basicscala.algo

/**
  * Created by michal on 02.04.16.
  */
object IncArray {

  def incByOne(num : Array[Int]) : Array[Int] = {
    if (num.isEmpty) {
      Array.emptyIntArray
    } else {
      doIncByOne(num)
    }
  }

  def doIncByOne(num: Array[Int]): Array[Int] = {
    var result : List[Int] = Nil
    var carryover = 1
    for (digit <- num.reverseIterator) {
      val incDigit = digit + carryover
      if (incDigit < 10) {
        result ::= incDigit
        carryover = 0
      } else {
        result ::= 0
        carryover = 1
      }
    }
    if (carryover > 0) {
      result ::= carryover
    }
    result.toArray
  }

}
