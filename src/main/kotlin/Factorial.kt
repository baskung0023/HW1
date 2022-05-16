fun main(args: Array<String>) {
    print("Enter a number: ")
    val num = Integer.valueOf(readLine())
    var i = 1
    var factorial = 1
    for (i in 1..num) {
        factorial *= i

        println("Factorial $i! = $factorial")
    }
}