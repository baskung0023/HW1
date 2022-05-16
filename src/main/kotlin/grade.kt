fun main(args: Array<String>) {
    print("Input your score: ")
    val grade = Integer.valueOf(readLine())

    when(grade){
        in 0..49 -> println("Your grade is F")
        in 50..54 -> println("Your grade is D")
        in 55..59 -> println("Your grade is D+")
        in 60..64 -> println("Your grade is C")
        in 65..69 -> println("Your grade is C+")
        in 70..74 -> println("Your grade is B")
        in 75..79 -> println("Your grade is B+")
        in 80..100 -> println("Your grade is A")
        else -> println("Your grade is ไม่มีเกรด")

    }
}