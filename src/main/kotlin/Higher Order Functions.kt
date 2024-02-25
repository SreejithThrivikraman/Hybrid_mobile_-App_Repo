// Example to show the use of the higher-order functions.
fun main() {
    printCalculaue(6,4){ value1, value2 ->
        value1 + value2
    }


    printCalculaue(6,4){ value1, value2 ->
        value1 - value2
    }

    printCalculaue(6,4){ value1, value2 ->
        value1 * value2
    }

    printCalculaue(6,4){ value1, value2 ->
        value1 / value2
    }
}

fun printCalculaue(value1: Int, value2: Int, calculator : (Int,Int) -> Int){
    println("The result is : ${calculator(value1,value2)}")
}