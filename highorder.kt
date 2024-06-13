fun operation(a: Int, b: Int, func: (Int, Int) -> Int): Int {
    return func(a, b)
}

fun main() {
    val add: (Int, Int) -> Int = { x, y -> x + y }
    val subtract: (Int, Int) -> Int = { x, y -> x - y }
    val multiply: (Int, Int) -> Int = { x, y -> x * y }
    val divide: (Int, Int) -> Int = { x, y -> if (y != 0) x / y else throw IllegalArgumentException("Cannot divide by zero") }

    val sum = operation(10, 5, add)
    val difference = operation(10, 5, subtract)
    val product = operation(10, 5, multiply)
    val quotient = operation(10, 5, divide)

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
}

/**NOTE: you can define a higher-order function by 
allowing a function to be passed as a parameter. **/