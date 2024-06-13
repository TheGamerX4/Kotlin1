fun String.isPalindrome(): Boolean {
    val cleaned = this.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    return cleaned == cleaned.reversed()
}

fun main() {
    // Examples of usage:
    val str1 = "12321"
    val str2 = "Hello, World"
    val str3 = "racecar"

    println("\"$str1\" is a palindrome: ${str1.isPalindrome()}")
    println("\"$str2\" is a palindrome: ${str2.isPalindrome()}")
    println("\"$str3\" is a palindrome: ${str3.isPalindrome()}")
}

/**NOTE: you can create extension functions to add 
new functionality to existing classes. **/ 