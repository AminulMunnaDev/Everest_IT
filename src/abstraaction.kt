fun main() {
    val paymentOne = Bkash()
    paymentOne.pay(1000.0)
    val paymentTwo = Card()
    paymentTwo.pay(2000.0)

}

abstract class Payment {
    abstract fun pay(amount: Double)
}

class Bkash : Payment() {
    override fun pay(amount: Double) {
        println("paid $amount using bkash")
    }
}

class Card : Payment() {
    override fun pay(amount: Double) {
        println("paid $amount using Card")
    }

}