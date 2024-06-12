fun main() {
    val num = "1024"
    var isDuck = false
    
    for ((index,char) in num.withIndex()) {
        if (index != 0 && char == '0') {
            isDuck = true
            break
        }
    }
    
    if(isDuck) {
        println("$num is a Duck number.")
    }
    else {
        println("$num is not a Duck number.")
    }
}
