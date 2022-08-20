package basic

class Person(
    val name: String = "재현",
    var age: Int = 1,
) {

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
