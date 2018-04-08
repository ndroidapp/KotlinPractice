class Sample{
    var name:String = "Noor"
    fun sample(){
        println("In sample function")
        println("From Sample: X=$x")
    }
}
var x=10

fun main(args: Array<String>) {
    var obj=Sample()
    obj.sample()
    println(obj.name)
    println("From main: X=$x")
}