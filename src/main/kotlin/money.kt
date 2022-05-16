fun main(args: Array<String>) {
    print("Enter amount of money: ")
    var money = Integer.valueOf(readLine())
    println("$money Baht can be separated into")

    if (money%100==0){
        if (money>=1000){

           var a= money / 1000
            println("1000-Baht $a bills")
            money = money-a*1000

        }
        if (money>=500){

            var a= money / 500
            println("500-Baht $a bills")
            money = money- a*500
        }
        if (money>=100){

            var a= money / 100
            println("100-Baht $a bills")
            money = money- a*100
        }

    }else{
        print("ห้าม")
    }
}