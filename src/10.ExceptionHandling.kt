class Test{
    var x=10
    var y=0
    fun devide():Int{
        var z=0
        try {
            z = x/y;
        } catch (e: Exception) {
            println("Division by zero is not possible")
            println(e.message)
        }
        return z
    }
}

fun main(args: Array<String>) {
    val obj=Test()
    obj.devide()
}