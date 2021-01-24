package hello.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

data class UserInfo(val name: String, val lastName: String, val id: Int)

lateinit var user: UserInfo

fun main(args: Array<String>) = runBlocking {
    asyncGetUserInfo(1)
    // Do some other operations
    delay(1000)

    print("User ${user.id} is ${user.name}")
}

fun asyncGetUserInfo(id: Int) = GlobalScope.async {
    delay(1100)
    user = UserInfo(id = id, name = "Susan", lastName = "Calvin")
}