fun main(){
    val n = 5
    
    for (i in 1..n) {
        val star = i * 2 - 1
        val space = n - i
        
        for (j in 1..space) {
            print(" ")
        }
        for (j in 1..star) {
            print("*")
        }
        println()
    }
    
    for (i in n downTo 1) {
        val star = i * 2 - 1
        val space = n - i
        
        for (j in 1..space) {
            print(" ")
        }
        for (j in 1..star) {
            print("*")
        }
        println()
    }
    
}