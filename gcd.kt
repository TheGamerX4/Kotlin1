fun main() {
    val num1 = 36
    val num2 = 48

    var a = num1
    var b = num2

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    val gcd = a

    println("GCD of $num1 and $num2 is: $gcd")
}