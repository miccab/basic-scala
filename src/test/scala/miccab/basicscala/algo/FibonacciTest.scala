package miccab.basicscala.algo

import org.scalatest.FunSuite

/**
  * Created by michal on 02.04.16.
  */
class FibonacciTest extends FunSuite {

  test("Negative number should be treated like zero") {
    assert(Fibonacci.fibRecursive(-1) == 0)
    assert(Fibonacci.fibImperative(-1) == 0)
    assert(Fibonacci.fibTailRecursive(-1) == 0)
  }

  test("Zero number should end with zero") {
    assert(Fibonacci.fibRecursive(0) == 0)
    assert(Fibonacci.fibImperative(0) == 0)
    assert(Fibonacci.fibTailRecursive(0) == 0)
  }

  test("1 number should end with 1") {
    assert(Fibonacci.fibRecursive(1) == 1)
    assert(Fibonacci.fibImperative(1) == 1)
    assert(Fibonacci.fibTailRecursive(1) == 1)
  }

  test("Other number should be computed all the same") {
    val input = 6
    val expectedOutput = 8
    assertResult(expectedOutput)(Fibonacci.fibRecursive(input))
    assertResult(expectedOutput)(Fibonacci.fibImperative(input))
    assertResult(expectedOutput)(Fibonacci.fibTailRecursive(input))
  }

}
