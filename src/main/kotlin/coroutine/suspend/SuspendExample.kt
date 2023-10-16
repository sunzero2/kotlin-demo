package coroutine.suspend

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class SuspendExample {
    suspend fun greet() {
        delay(100)
        println("Hello, World!")
    }
}

fun main() {
    runBlocking {
        val suspendExample = SuspendExample()
        suspendExample.greet()
    }
}