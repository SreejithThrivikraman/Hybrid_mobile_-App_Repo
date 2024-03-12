import java.io.File
import kotlin.io.path.writeLines

fun main() {

    var student_name = mutableListOf("")
    val inputFile = File("test.txt")

    inputFile.forEachLine { item -> student_name.add(item)}

    val sortedLines = student_name.sorted()
    val outputFile = File("Sorted.txt").toPath()
    outputFile.writeLines(sortedLines)
}