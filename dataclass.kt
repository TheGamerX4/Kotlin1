data class Person(val name: String, var age: Int, var address: String)

fun main() {
    val person1 = Person("Ram", 30, "Hyderabad")

    println("Original:")
    println(person1)

    val person2 = person1.copy(age = 35, address = "Delhi")

    println("\nCopied:")
    println(person2)
}

/**NOTE: a data class is a concise way to declare and 
manage classes whose main purpose is to hold data. **/