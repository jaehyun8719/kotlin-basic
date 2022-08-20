package basic

fun main() {

    var numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    for (i in 1..3) {
        println(i)
    }

    // 숫자가 내려가는 for문
    for (i in 3 downTo 1) {
        println(i)
    }

    // 2씩 올리는 경우
    for (i in 1..5 step 2) {
        println(i)
    }

}
