package basic

import java.lang.IllegalArgumentException

fun main() {

    // safe call
    var str: String? = "ABC"
    println(str?.length)

    // elvis 연산자
    var str2: String? = null
    println(str2?.length ?: 0)

}

fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null 이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    return str.startsWith("A")
}

// 코틀린 스럽게 변경
fun startWithA1OfKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어왔습니다.")
}

fun startWithA2OfKotlin(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3OfKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}