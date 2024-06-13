tailrec fun factorial(n: Int, accumulator: Long = 1): Long {
    return if (n <= 1) {
        accumulator
    } else {
        factorial(n - 1, accumulator * n)
    }
}

fun main() {
    // Examples of usage:
    val num = 20
    println("Factorial of $num is ${factorial(num)}")
}


/**NOTE: Tail recursion allows the Kotlin compiler to optimize the 
recursive calls and convert them into a loop to prevent stack overflow. **/