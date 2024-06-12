fun main() {
    val str = "Excellent Work"
    val frequencyArray = IntArray(26)

    for (char in str) {
        if (char.isLetter()) {
            val index = char.toLowerCase() - 'a'
            frequencyArray[index]++
        }
    }

    println("Frequency of letters in the string '$str':")
    for (i in 0 until 26) {
        val letter = (i + 'a'.toInt()).toChar()
        val frequency = frequencyArray[i]
        if (frequency > 0) {
            println("$letter: $frequency")
        }
    }
}