fun main() {
    val duck = Duck()
    duck.fly()
}

interface Flyable{
    fun fly(){
        println("Flying")
    }
    fun eat(){
        println("Eat")
    }
}
interface Swimming{
    fun swimming(){
        println("Swimming")
    }
}
class Duck: Flyable,Swimming

class Crow():Flyable{

}