fun calculateArea(length: Double, breadth: Double): Double {
    return length * breadth
}

fun calculateArea(radius: Double): Double {
   return Math.PI * radius * radius
}

fun main() {
    val rectangleArea = calculateArea(5.0, 3.0)
    val circleArea = calculateArea(4.0)

    println("Area of the rectangle: $rectangleArea")
    println("Area of the circle: $circleArea")
}

/**NOTE : you can achieve method overloading by defining 
multiple functions with the same name but different parameter lists. **/