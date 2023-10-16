package coroutine.fsm

class FsmExample {
    fun execute(label: Int = 0) {
        var nextLabel: Int? = null

        when (label) {
            0 -> {
                println("Initial")
                nextLabel = 1
            }

            1 -> {
                println("State1")
                nextLabel = 2
            }

            2 -> {
                println("State2")
                nextLabel = 3
            }

            3 -> {
                println("End")
            }
        }

        if (nextLabel != null) {
            this.execute(nextLabel)
        }
    }
}

fun main() {
    val fsmExample = FsmExample()
    fsmExample.execute()
}