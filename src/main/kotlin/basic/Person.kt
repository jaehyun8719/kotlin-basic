package basic

class Person(
    val name: String = "재현",
    var age: Int = 1,
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 입니다.")
        }
    }

   val getUpperCaseName: String
       get() = this.name.uppercase()

    init {
        if (this.age <= 0) {
            throw IllegalArgumentException("나이는 ${this.age}일 수 없습니다.")
        }
    }

    fun idAdult(): Boolean {
        return this.age > 20
    }

    // 함수 대신 프로처피 처럼 생성
    val isAdult: Boolean
        get() = this.age > 20

}
