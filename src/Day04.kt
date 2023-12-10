import java.io.File
import kotlin.math.pow

fun main() {
fun part1() {
    File("src/Day04.txt").readLines()
        .map { line ->
            val (_, winnings, havings) = line.split(":", "|")
            val wNumbers = winnings.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
            val hNumbers = havings.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
            wNumbers to hNumbers
        }.map { (wNumbers, hNumbers) ->
            val count = wNumbers.count { it in hNumbers }
            if (count == 0) 0
            else 2.0.pow(count - 1).toInt()
        }
        .onEach(::println)
        .sum()
        .also(::println)
}

    fun part2() {
        data class Card(val winnings:List<Int>, val havings:List<Int>)

    File("src/Day04.txt").readLines()
        .map { line ->
            val (_, winnings, havings) = line.split(":", "|")
            val wNumbers = winnings.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
            val hNumbers = havings.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
            val count = wNumbers.count { it in hNumbers }
            Card(wNumbers,hNumbers) to count
        }.let { pairs ->
            val countCard = MutableList(pairs.size){1}
            pairs.mapIndexed {index, (_,count) ->
                (1..count).forEach {
                    countCard[index + it]+= countCard[index]
                }

            }
            countCard
        }
        .sum()
        .also(::println)
}

    //part1()
    part2()
}
