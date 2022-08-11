package basic

fun main() {

    val number1 = 4
    val number2: Long = number1.toLong() // Type mismatch

    // null 이 올수 있는 type
    val number3: Int? = 4
    val number4: Long = number1?.toLong() ?: 0L

    // String interpolation
    val age = 77
    val log = "사람의 나이는 ${age} 입니다."

    println(log)

    // String indexing
    val str = """
        ABC
        EFG
        ${age}
    """.trimIndent()

    println(age)

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

// 타입 캐스팅 as 생략가능
fun printAgeIfPerson2(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {

    }
}

fun printAgeIfAsPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}