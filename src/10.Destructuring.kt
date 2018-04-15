data class Student(val  a:String, val b:String){
    var name:String=a
    var subject:String=b
}
fun main(args: Array<String>) {

    val s=Student("John","Kotlin")
    val(name,subject)=s
    println("Name: $name\nSubject: $subject")
}