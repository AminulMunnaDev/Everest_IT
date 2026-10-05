fun main() {

    /*    var i = 1

        while (i <= 10) {
            println(i)
            i++
        }*/
    /*  var i = 10

      while (i >= 1) {
          println(i)
          i--
      }*/

    //Prime number
    print("Enter your choice: ")
    val n = readln().toInt()
    var i = 2
    var isPrime = true
    if (n<2){
        isPrime = false
    }
    while (i < n) {
        if (n % i == 0){
            isPrime = false
            break
        }
        i++
    }
    if(isPrime){
        println("$n is Prime ")
    }else{
        println("$n is Not Prime ")
    }

}