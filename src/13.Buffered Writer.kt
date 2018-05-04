import java.io.File

fun main(args: Array<String>) {
    val outString:String = "Kotlination\nBe Kotlineer - Be Simple - Be Connective."
    File("Kotlination2.txt").bufferedWriter().use { out -> out.write(outString) }

}
