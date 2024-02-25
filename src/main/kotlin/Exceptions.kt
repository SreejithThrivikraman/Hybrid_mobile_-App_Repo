fun main() {

    var result = try {
        "The value is ${5/0}"
    } catch (error: Throwable){
        "Processing error : $error"
    }

    println(result)
}

