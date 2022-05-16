fun main(args: Array<String>) {
    print("Enter a Fibonanci number:")
    val Fibonanci = Integer.valueOf(readLine())
    var t1 = 0
    var t2 = 1
    var sum = 0

    println("f0 =$t1")
    println("f1 =$t2")

    for (i in 2..Fibonanci) {

        sum += i


        sum = t1 + t2
        println("f$i =$sum")
        t1 = t2
        t2 = sum

    }
    println("Value of Fibonanci is $sum")
}