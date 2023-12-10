fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0

        input.forEach {
            sum += it.first(Char::isDigit).digitToInt()*10
            sum += it.last(Char::isDigit).digitToInt()
        }
        return sum
    }

    val words = arrayOf("zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine")

    fun part2(input: List<String>): Int {
input.forEach {
    val line = it.toString()
}

        return input.size
    }

    // test if implementation meets criteria from the description, lik_e:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
//    val input = readInput("Day01_test")
    part1(input).println()
//    part2(input).println()
}
