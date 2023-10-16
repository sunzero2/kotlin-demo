package coroutine.fsm

object FsmCalculator {
    data class Shard(
        var result: Int = 0,
        var label: Int = 0
    )

    fun calculator(initialValue: Int, shard: Shard? = null) {
        var current = shard ?: Shard()

        when (current.label) {
            0 -> {
                current.result = initialValue
                current.label = 1
            }
            1 -> {
                current.result += 1
                current.label = 2
            }
            2 -> {
                current.result *= 2
                current.label = 3
            }
            3 -> {
                println("Result: ${current.result}")
                return
            }
        }

        this.calculator(initialValue, current)
    }
}

fun main() {
    FsmCalculator.calculator(5)
}