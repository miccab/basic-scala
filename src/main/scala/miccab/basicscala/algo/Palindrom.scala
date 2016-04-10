package miccab.basicscala.algo

/**
  * Created by michal on 03.04.16.
  */
object Palindrom {

  def getFirstNormalizedCharacter(iter: Iterator[Char]): Option[Char] = {
    var firstChar : Option[Char] = None
    while(firstChar.isEmpty && iter.hasNext) {
      val nextChar: Char = iter.next()
      if (nextChar.isLetterOrDigit) {
        firstChar = Some(nextChar.toLower)
      }
    }
    firstChar
  }

  def isPalindrom(text : String) : Boolean = {
    val textLength = text.trim.length
    if (textLength < 2) {
      false
    } else {
      val iterFromBeginning = text.iterator
      val iterFromEnd = text.reverseIterator
      var isPalindrom = true
      val charsToCompare: Int = text.length / 2
      var charsCompared = 0
      while (isPalindrom && charsCompared < charsToCompare) {
        val leftChar = getFirstNormalizedCharacter(iterFromBeginning)
        val rightChar = getFirstNormalizedCharacter(iterFromEnd)
        isPalindrom = leftChar match {
          case Some(x) if rightChar.isDefined => x == rightChar.get
          case None if rightChar.isEmpty => true
          case _ => false
        }
        charsCompared += 1
      }
      isPalindrom
    }
  }
}
