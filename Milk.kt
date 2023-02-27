open class Milk (name:String,price:Int,coll:Int,now_year:Int, last_year:Int,buy:Boolean,q:Int) : Tov(name,price,coll)
{
override fun Q(): Int {
        var q= this.price / this.coll
        return q
    }
override fun info(): String {
        val ino="Название товара-$name\n Ваш счет-$price\n,Количество-$coll\n,Год создания $last_year\n"
        return ino
    }
}