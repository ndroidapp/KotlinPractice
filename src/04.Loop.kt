fun main(args: Array<String>) {

    println("___________For_____________")
    var myArray:IntArray= intArrayOf(1,2,3,4,5,6,7,8,9)
    for (i in myArray) {
        println(i)
    }

    println("___________While_____________")
    var x:Int =0
    while (x<5){
        println(x++)
    }
}