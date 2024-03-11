// Code sample to show how the MAPs are used on Kotlin.


fun main() {
    val marks = mapOf("English" to 90, "French" to 78, "Maths" to 89 )

    marks.keys.forEach { println(it) }
    marks.values.forEach{ println(it) }

    for (items in marks) {
        println("Mark for ${items.key} is ${items.value}")
    }

    println(marks.containsKey("Malayalam"))        // To check if any key is present in the Map.
    println(marks.containsValue(89))               // To check if any value is present in the Map.

    // To add or remove any values from the Map, we need to use MutableMaps.

    val student = mutableMapOf("Sreejith" to 200,"Abhijith" to 100,"Ammu" to 50)
    student["Subha"] = 230                         // add a value to the Map

    for (items in student) {
        println("Mark for ${items.key} is ${items.value}")
    }

    student.put("Vikram", 300)                    // add a value to the Map - second method
    for (items in student) {
        println("Mark for ${items.key} is ${items.value}")
    }

    println("_______________________________________________")

    student.remove("Sreejith")
    for (items in student) {
        println("Mark for ${items.key} is ${items.value}")
    }

}