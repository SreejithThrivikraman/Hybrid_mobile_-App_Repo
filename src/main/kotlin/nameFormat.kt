
// Example code for showing the use of function as arguments
fun main() {
    printFormattedName("Sreejith", "Thrivikraman") { FirstName, SecondName ->
        SecondName + "," + FirstName
    }

    printFormattedName("Sreejith", "Thrivikraman") { FirstName, SecondName ->
        FirstName.uppercase() + "," + SecondName.uppercase()
    }

    printFormattedName("Sreejith", "Thrivikraman") { FirstName, SecondName ->
        FirstName.lowercase() + "," + SecondName.lowercase()
    }
}


fun printFormattedName(FirstName: String, SecondName: String, formatName: (String, String) -> String) {
    println("The formatted Name is : ${formatName(FirstName,SecondName)}")
}