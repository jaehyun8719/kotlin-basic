package basic

fun main() {

    val str = "ABC"
    println(str.lastChar()) // "C"

    // infix 함수
    3.add(4)

    3.add2(4)
    3 add2 4

    // inline 함수
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}