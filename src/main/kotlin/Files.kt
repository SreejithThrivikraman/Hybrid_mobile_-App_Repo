import java.io.File

fun main(){
    val name :String
    println("Please enter your name:")
    name = readLine() ?: ""

    val checkIfFile = File(name).isFile

    println(checkIfFile)
}