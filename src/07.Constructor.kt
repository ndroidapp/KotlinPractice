//Primary Constructor
class Math(val firstValue: Int, var seocndValue: Int) {
    //class body
}

//Secondary Constructor
class Human(val firstName: String, var age: Int) {
    val message: String = "Hey!!!"
    constructor(name: String, age: Int, message: String) : this(name, age) {

    }
}

fun main(args: Array<String>) {
    println("__________Primary Constructor__________")
    val m = Math(10, 20)
    var res = m.firstValue + m.seocndValue
    println(res)
    println("__________Secondary Constructor__________")
    val human = Human("Jadu", 25)
    print("${human.message} ${human.firstName} Welcome to the example of secondary constructor,\nYour age is ${human.age}")
}
