fun main(args: Array<String>) {
    val calculator = Calculator()
    calculator.add(2.0,3.0)

    val dog = Dog()
    dog.sound()
    val cat = Cat()
    cat.sound()
    val animal = Animal()
    animal.sound()
}

open class Animal {
    open fun sound(){
        println("Animal makes Sound")
    }
}
class Dog :Animal(){
    override fun sound(){
        println("Dog says Woof")
    }
}
class Cat :Animal(){
    override fun sound(){
        println("Cat says Meow")
    }
}


class Calculator{
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun add(a:Int ,b :Int ,c:Int): Int{
        return a + b + c
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }
}