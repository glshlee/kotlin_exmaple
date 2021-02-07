package hello

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>): Person? {
    var maxAge = 0
    var oldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            oldest = person
        }
    }

    return oldest
}

fun main() {
    val people = listOf(Person("Name1", 20), Person("Name2", 30), Person("Name3", 10))
    println(findTheOldest(people))
    println(people.maxByOrNull { it.age })

    people.forEach {
        println(it.age)
    }
}
