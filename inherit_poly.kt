abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(private val length: Double, private val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }

    fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Rectangle(5.0, 3.0),
        Circle(4.0)
    )

    for (shape in shapes) {
        /*when (shape) {
            is Rectangle -> println("Rectangle Area: ${shape.area()}")
            is Circle -> println("Circle Area: ${shape.area()}")
        }*/
        println("Area: ${shape.area()}")
        
        when (shape) {
            is Rectangle -> println("Rectangle Perimeter: ${shape.perimeter()}")
            is Circle -> println("Circle Perimeter: ${shape.perimeter()}")
        }
    }
}