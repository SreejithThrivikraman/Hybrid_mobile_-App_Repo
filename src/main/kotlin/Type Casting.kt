// Code example to show the type checking of a variable

fun main() {
    var testVar = 54564654646
    var result = checkType(testVar)
    println("The type of the test Variable is : $result")
}

fun checkType(value: Any): String {
    return when {
        value is String -> "String"
        value is Int -> "Integer"
        value is Float -> "Float"
        value is Boolean -> "Boolean"
        value is Long -> "Long"
        value is Char -> "Character"
        else -> {
            "Invalid"
        }
    }
}


