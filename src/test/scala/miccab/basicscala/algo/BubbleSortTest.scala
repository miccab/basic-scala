package miccab.basicscala.algo

import org.scalatest.FlatSpec

/**
  * Created by michal on 03.05.16.
  */
class BubbleSortTest extends FlatSpec {
  "bubble sort" should "sort empty array" in {
    val toBeSorted = Array.emptyIntArray
    BubbleSort.sort(toBeSorted)

    assert(toBeSorted.isEmpty)
  }

  it should "sort single size array" in {
    val toBeSorted = Array(1)
    BubbleSort.sort(toBeSorted)

    assertResult(1)(toBeSorted(0))
  }

  it should "sort multi size array" in {
    val toBeSorted = Array(4,10,1)
    BubbleSort.sort(toBeSorted)

    assertResult(1)(toBeSorted(0))
    assertResult(4)(toBeSorted(1))
    assertResult(10)(toBeSorted(2))
  }
}
