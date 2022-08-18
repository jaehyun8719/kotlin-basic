package basic

fun main() {
    repeat("Hello World")
    repeat("Hello World", 2)
    repeat("Hello World", 6, false)

    // named argument
    repeat("Hello World", useNewLine = false)

    // 가변인자
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int  {
    return if (a > b) {
        return a
    } else {
        return b
    }
}

fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) = if (a > b) a else  b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
