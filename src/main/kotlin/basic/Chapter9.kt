package basic

fun main() {

    val person = Person("재현", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    //argument가 있을경우
    val person2 = Person("재현", 100)
    val person3 = Person("재현")

}

