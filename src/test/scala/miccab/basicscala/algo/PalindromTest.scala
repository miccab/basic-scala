package miccab.basicscala.algo

import org.scalatest.FlatSpec
import miccab.basicscala.algo.Palindrom.isPalindrom
/**
  * Created by michal on 03.04.16.
  */
class PalindromTest extends FlatSpec {

  "Not palindrom" should "be detected when empty String is passed" in {
    assert(!isPalindrom(""))
  }

  it should "be detected when blank String is passed" in {
    assert(!isPalindrom("  "))
  }

  it should "be detected when not palindrom passed" in {
    assert(!isPalindrom("kuku"))
  }

  it should "be detected if it has one char" in {
    assert(!isPalindrom("a"))
  }

  "Palindrom" should "be detected if it has odd num of chars" in {
    assert(isPalindrom("ala"))
  }

  it should "be detected if it has even num of chars" in {
    assert(isPalindrom("alla"))
  }

  it should "be detected if it has whitespaces and does not have same case" in {
    assert(isPalindrom("Devil lived"))
  }

  it should "be detected if it has comma" in {
    assert(isPalindrom("Race fast, safe car"))
  }
}
