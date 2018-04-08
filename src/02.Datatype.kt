fun main(args: Array<String>) {
    var i:Int = 101
    var d:Double = 101.1
    var f:Float = 101.2f
    var l:Long = 11000L
    var s:Short = 20
    var b:Byte = 1

    println("___________Number_____________")
    println("Integer: "+i)
    println("Double: "+d)
    println("Float: "+f)
    println("Long: "+l)
    println("Short: "+s)
    println("Byte: "+b)

    println("\n\n___________Character_____________")
    var c:Char='N'
    println("Char: $c")

    println("\n\n___________Boolean_____________")
    var boolean:Boolean=true
    println("Boolean: $boolean")

    println("\n\n___________String_____________")
    var string:String="Noor"
    println("String: $string")

    println("\n\n___________Array_____________")
    var myArray:IntArray= intArrayOf(1,2,3,4,5,6,7,8,9)
    println("Array Element:  "+myArray[3])

    println("\n\n___________Collection_____________")
    var numberM:MutableList<Int> =  mutableListOf(101,102,103)
    //immutable list
    var numberIm:List<Int> = numberM
    println("List : "+ numberM)
    println("List : "+ numberIm)
    println("List : "+ numberIm[0])





}