fun main(args: Array<String>) {


    print("enter your number  : ")
    val number: Double = readln().toDouble()

    /*if (number in 90.0..100.0){
        println("Your Grade is A+")
    }else if(number in 80.0..89.0){
        println("Your Grade is A")
    }else if(number in 70.0..79.0){
        println("Your Grade is B")
    }
    else if(number in 60.0..69.0){
        println("Your Grade is C")
    }
    else if(number>=50 && number<=59){
        println("Your Grade is D")
    }
    else if(number>=40 && number<=49){
        println("Your Grade is E")
    }
    else if(number>=0 && number<=39){
        println("Your Grade is F")
    }
    else{
        println("Invalid Number")
    }*/
    //solving with when

    when{
        number< 0 || number >100 -> { println("Invalid Number") }
        number >=90 && number <=100 -> { println("A+") }
        number >=80 && number <=90 -> { println("A") }
        else -> { println("F") }
    }


}
