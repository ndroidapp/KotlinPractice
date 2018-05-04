import java.io.File

fun main(args: Array<String>)
{

    val outString: String = "Kotlination\nBe Kotlineer - Be Simple - Be Connective."
    File("jadu.txt").printWriter().use { out -> out.println(outString) }
}

