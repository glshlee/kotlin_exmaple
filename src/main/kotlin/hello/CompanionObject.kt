package hello

class CompanionObject {
    companion object
}

fun CompanionObject.Companion.sayHello() = println("Hello companion object!!")

fun main() {
    CompanionObject.sayHello()
}