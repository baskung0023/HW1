fun main(args: Array<String>) {
    var aa = 10
    var sum = 0
    var sum1 = 0
    for (i in aa downTo 1) {
        sum += i

        print("$i ")
    }

    println("\nSum = $sum")

    for (j in 1..20 step 2) {
        sum1 += j
        print("$j ")
    }

    println("\nSum = $sum1")

    var result = 0
    for (k in 1..20 step 4) {
        //print("$k ")
        result += k
    }
    //println("\nSum $ksum ")
    var dsum =-3
    for (g in 1..5 ){
        //print("$dsum ")
        result += dsum
        dsum += -4


    }
    println("1 -3 5 -7 9 -11 13 -15 17 -19")
    println("Sum =$result ")


    var a1 = 10
    var a2 = 0
    while (a1 >= 1) {
        //a1 = a1-1
        print("$a1 ")
        a2 += a1
        a1--



    }
    println("\nSum = $a2")

    var b1 = 1
    var b2 = 0
    while (b1 <= 20) {

        print("$b1 ")
        b2 += b1
        b1 = b1+2








    }

    println("\nSum = $b2")








}
