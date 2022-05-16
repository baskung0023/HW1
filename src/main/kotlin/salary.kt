fun main(args: Array<String>) {
    print("Input your salary: ")
    var salary = Integer.valueOf(readLine())
    var a = 0
    if (salary<15000) {
          a = salary /100*5
        println("Your Welfare is $a Bath")
    } else {
        println("Your Welfare is 750 Bath")
    }

}