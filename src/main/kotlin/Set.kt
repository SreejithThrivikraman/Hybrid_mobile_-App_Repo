// Kotlin code to demonstrate the use of Set
// The set won't allow any duplicate values.


fun main() {

    val languages = setOf("Hindi","Tamil","Kannada","Malayalam","Hindi")

    for (lang in languages){
        println(lang)
    }

    println(languages.size)      // The set size will only give 4 as "Hindi" has a duplicate entry.
//    languages.add("Oriya")     // Compilation error ---> The set won't allow to add any values as it is immutable by default.
//    languages.remove("Hindi")  // Compilation error ---> The set won't allow to remove any values as it is immutable by default.

    val states = mutableSetOf("Haryana", "Tamil Nadu","Karnataka","Kerala","Haryana" )
    println(states.size)

    states.add("West Bengal")            // The mutable set will allow addition of elements.
    states.remove("Haryana")     // The mutable set will allow removal of elements.

    for (ST in states){
        println(ST)
    }

}