fun main() {
    val testScores = mapOf(
        "Sharath" to 88.1,
        "Sunny" to 88.9,
        "Manu" to 82.1,
        "Das" to 72.1,
        "Rahul" to 66.1,
        "Sreejith" to 89.1,
        "Balu" to 62.1,
        "Ashwin" to 85.7,
        "Sharadha" to 94.3,
        "Ruchika" to 83.8
    )

    val poorStudent = testScores.toList()
                                .sortedBy { it -> it.second }
                                .map { pair -> pair.first }
                                .take(1)

       println("The student with lowest score is : ${poorStudent}")
}


