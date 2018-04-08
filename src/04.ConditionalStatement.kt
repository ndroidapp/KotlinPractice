fun main(args: Array<String>) {
    var x=55
    var y=45
    var z=30

    //var greatestNumber:Int
    println("___________if else_____________")
    if (x>y && y>z){
        println("Greatest Number: $x")
    }else if (y>z){
        println("Greatest Number: $y")
    }else{
        println("Greatest Number: $z")
    }

    println("\n___________when_____________")
    var id:Int = 104
    when(id){
        101 -> println("101")
        102 -> println("102")
        104,103 -> println("104")
        else ->{
            println("No Match")
        }
    }

}