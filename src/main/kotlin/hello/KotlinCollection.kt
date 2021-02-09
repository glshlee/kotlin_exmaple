package hello

class KotlinCollection {
    fun filter() {
        val list = listOf(1, 2, 3, 4)
        println(list.filter { it % 2 == 0 })
    }

    fun map() {
        val list = listOf(1, 2, 3, 4)
        println(list.map { it -> it *2 })
    }

    fun flatMap() {
        val strings = listOf("abc", "def")
        println(strings.flatMap { it.toList() })
    }
}

fun main() {
    KotlinCollection().filter()
    KotlinCollection().map()
    KotlinCollection().flatMap()
}