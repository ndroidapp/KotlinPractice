import java.io.File

fun main(args: Array<String>) {
    val outString:String = "Kotlination\nBe Kotlineer - Be Simple - Be Connective."
    val file = File("Kotlin3.txt")
    file.writeText(outString)
    file.appendText("\nMaster Kotlin.")
    file.appendText("\nDo Great Work..")
}