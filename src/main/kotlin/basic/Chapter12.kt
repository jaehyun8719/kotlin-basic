package basic

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 익명 클래스
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })

}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
