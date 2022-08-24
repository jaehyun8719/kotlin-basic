package basic

fun main() {

    val numbers = mutableListOf(100, 200)
    numbers.add(300)
    val emptyList = emptyList<Int>()

    // 값 출력
    println(numbers[0])

    // For Each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }

    // Map
    val map = mutableMapOf<Int, String>()
    map[1] = "MONDAY"
    map[2] = "SUNDAY"

    mapOf(1 to "MONDAY", 2 to "SUNDAY")

    // for
    for (key in map.keys) {
        println(key)
        println(map[key])
    }

    for ((key, value) in map.entries) {
        println(key)
        println(value)
    }

}
