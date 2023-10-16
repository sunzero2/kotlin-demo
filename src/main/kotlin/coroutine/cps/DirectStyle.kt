package coroutine.cps

object NormalSeparatedCalculator {
    fun calculate(initialValue: Int) {
        var result = initialize(initialValue)
        result = addOne(result)
        result = multiplyTwo(result)
        println("Result: $result")
    }

    private fun initialize(value: Int): Int {
        return value
    }

    private fun addOne(value: Int): Int {
        return value + 1
    }

    private fun multiplyTwo(value: Int): Int {
        return value * 2
    }
}

fun main() {
    NormalSeparatedCalculator.calculate(5)
}