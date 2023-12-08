import java.io.File
import kotlin.math.pow

fun main() {

    File("src/Day04.txt").readLines()
        .map{line ->
           val(_,winnings,havings) = line.split(":","|")
           val wNumbers =  winnings.split(" ").filter{it.isNotBlank()}.map{it.toInt()}
           val hNumbers =  havings.split(" ").filter{it.isNotBlank()}.map{it.toInt()}
            wNumbers to hNumbers
        }.map {
            (wNumbers,hNumbers) ->
            val count = wNumbers.count { it in hNumbers }
            if (count == 0) 0
            else 2.0.pow(count-1).toInt()
        }
        .onEach(::println)
        .sum()
        .also(::println)

    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day04Test")
//    check(part1(testInput) == 1)
//
//    val input = readInput("Day04.txt")
//    part1(input).println()
//    part2(input).println()
}
