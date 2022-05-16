fun main(args: Array<String>) {
    print("Input value A: ")
    val a = Integer.valueOf(readLine())

    print("Input value B: ")
    val b = Integer.valueOf(readLine())

    print("Input value C: ")
    val c = Integer.valueOf(readLine())

    if (a > b) {
        if (a > c) {
            println("Max value is A")
        }

    }
    if (b > a) {
        if (b > c) {
            println("Max value is B")

        }

    }
    if (c > a) {
        if (c > b) {
            println("Max value is C")
        }

    }
    if (a == b && a == c) {
        println("A & B & C")

    } else if (a == b) {
        println("A & B")
    } else if (a == c) {
        println("A & C")
    } else if (b == c) {
        println("B & C")


    }
}

