import java.io.File
import kotlin.io.path.writeLines

fun main() {

    var student_name = mutableListOf<String>()
    val inputFile = File("test.txt")

    inputFile.forEachLine { item -> student_name.add(item)}

    val sortedLines = student_name.sorted().take(2)
    val outputFile = File("Sorted.txt").toPath()
    outputFile.writeLines(sortedLines)

}