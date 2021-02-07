package hello

class AnonymousInnerClass {
    fun test() {
        TestPrinter().print(object : TestAdapter {
            override fun hello() {
                println("Hello!!")
            }
        })
    }
}

class TestPrinter {
    fun print(adapter: TestAdapter) {
        adapter.hello()
    }
}

interface TestAdapter {
    fun hello()
}

fun main() {
    AnonymousInnerClass().test()
}