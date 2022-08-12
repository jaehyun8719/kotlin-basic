package basic

fun main() {

    val person1 = Person(10)
    val person2 = person1
    val person3 = Person(10)

    println(person1 == person3)

    // Lazy 연산
    if (fun1() || fun2()) {
        println("본문")
    }

    // 연산자 오버로딩
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
