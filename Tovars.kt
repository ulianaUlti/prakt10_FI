abstract class Tovars(val name: String){
    abstract var price: Int
    abstract fun hello()
}
class Tovar(name: String, override var price : Int): Milk(name){
    override fun hello(){
        var value: Any = println(& quot;My tovar is $name&price;)
    }
}
