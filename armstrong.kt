fun main() {
    val num = 153
    var temp = num
    val digitc = num.toString().length
    var sum = 0
    
    while (temp != 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(),digitc.toDouble()).toInt()
        temp /= 10
    }
    
    if (sum == num) {
        println("$num is an Armstrong number.")
    } else {
        println("$num is not an Armstrong number.")
    }
        
}