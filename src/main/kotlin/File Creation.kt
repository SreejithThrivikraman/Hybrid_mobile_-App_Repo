import java.io.File
import kotlin.io.path.writeLines

fun main() {

    var student_name = mutableListOf<String>()
    val inputFile = File("test.txt")

    inputFile.forEachLine { item -> student_name.add(item)}

    val sortedLines = student_name.sorted()
    val parsedScores = sortedLines.map{
        it -> val element = it.split(":")
        element[0] to element[1]
    }

    val listOfStudentName = parsedScores.sortedByDescending{ it -> it.second}.take(2)
    val outputFile = File("Sorted.txt").toPath()

    outputFile.writeLines(listOfStudentName.map { "${it.first} -> ${it.second}" })
}