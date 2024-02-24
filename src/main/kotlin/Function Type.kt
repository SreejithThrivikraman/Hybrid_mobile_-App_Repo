

// Sample code to show how a function can be used as a type for a variable.
var testMessage : (String) -> String = {
    "Hello $it"
}

fun main() {
    println(testMessage("Sreejith"))
    testMessage = { "Hello $it how are you"}   // code to modify the function
    println(testMessage("Rohan"))
    println(testMessage.invoke("Mike"))        // Another method for function invocation. Changes
}