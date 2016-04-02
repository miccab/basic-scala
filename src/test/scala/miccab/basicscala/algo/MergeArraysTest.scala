package miccab.basicscala.algo

import org.scalatest.FunSuite

/**
  * Created by michal on 02.04.16.
  */
class MergeArraysTest extends FunSuite {

  test("Empty arrays should result in empty array") {
    val actualResult = MergeArrays.merge(Array.emptyIntArray, Array.emptyIntArray)
    assertResult(Array.emptyIntArray)(actualResult)
  }

  test("Duplicated values should be handled correctly") {
    val actualResult = MergeArrays.merge(Array(3,4,4,15), Array(2,4,4,22))
    assertResult(Array(2,3,4,4,4,4,15,22))(actualResult)
  }

  test("Negative values should be handled correctly") {
    val actualResult = MergeArrays.merge(Array(-4,-2,1), Array(-22,0,4))
    assertResult(Array(-22,-4,-2,0,1,4))(actualResult)
  }
}
