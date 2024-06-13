class User(val name: String, val age: Int) {
    companion object {
        fun userWithDefaultAge(name: String): User {
            return User(name, 20)
        }

        fun createUser(name: String, age: Int = 20): User {
            return User(name, age)
        }
    }

    override fun toString(): String {
        return "name='$name', age=$age"
    }
}

fun main() {
    val user1 = User.userWithDefaultAge("Ram")
    println("User with default age:")
    println(user1)

    val user2 = User.createUser("Jyoti", 25)
    println("\nUser with specified age:")
    println(user2)

    val user3 = User.createUser("Bibhu")
    println("\nUser with default age:")
    println(user3)
}



/**NOTE: companion objects are used to define static methods and 
properties that belong to a class rather than to instances of the class. **/