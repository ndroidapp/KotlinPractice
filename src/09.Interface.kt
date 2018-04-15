interface ExampleInterface {
    var myVar: Int//abstract property
    fun absMethod(): String//abstract method
    fun hello() {
        println("Hello there I am from ExampleInterface")
    }
}

class InterfaceImplementation : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod(): String = "Hello "
}

fun main(args: Array<String>) {
    val obj = InterfaceImplementation()
    println("myVar = ${obj.myVar}")
    println("Calling hello(): ")
    obj.hello()
    print("Message from ")
    println(obj.absMethod())
}