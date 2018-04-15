open class ABC {
    fun think() {
        print("Hey!! I am thinking")
    }
}

class BCD : ABC() {
    //Inheritance happened using default constructor
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()
}