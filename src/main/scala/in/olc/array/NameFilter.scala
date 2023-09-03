package in.olc.array

object NameFilter {
  private def isFirstLetterUppercaseVowel(name: String): Boolean = {
    val uppercaseVowels = Set('A', 'E', 'I', 'O', 'U')
    val firstChar = name.head
    val lastChar = name.last

    uppercaseVowels.contains(firstChar) && lastChar.isUpper && !uppercaseVowels.contains(lastChar)
  }

  def main(args: Array[String]): Unit = {
    val names = new Array[String](20)

    // Accept input names into the array
    println("Enter 20 names in capital letters:")
    for (i <- 0 until 20) {
      names(i) = scala.io.StdIn.readLine().toUpperCase()
    }

    // Filter names based on the condition
    val filteredNames = names.filter(isFirstLetterUppercaseVowel)

    // Print the filtered names
    println("Names with first letter as uppercase vowel and last letter as uppercase consonant:")
    filteredNames.foreach(println)
  }
}