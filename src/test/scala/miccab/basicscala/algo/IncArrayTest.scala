package miccab.basicscala.algo

import org.scalatest.FunSuite

/**
  * Created by michal on 02.04.16.
  */
class IncArrayTest extends FunSuite {

  test("Empty array should end with empty array") {
    val actual = IncArray.incByOne(Array.emptyIntArray)
    assertResult(Array.emptyIntArray)(actual)
  }

  test("Overflow should be supported and end with bigger array") {
    val actual = IncArray.incByOne(Array(9,9))
    assertResult(Array(1,0,0))(actual)
  }

  test("Overflow in one digit only should be supported and end with same array size") {
    val actual = IncArray.incByOne(Array(1,9))
    assertResult(Array(2,0))(actual)
  }


  test("less significant numbers are last") {
    val actual = IncArray.incByOne(Array(2,0))
    assertResult(Array(2,1))(actual)
  }

}
