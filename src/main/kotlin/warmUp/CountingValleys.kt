fun countingValleys(steps: Int, path: String): Int {
    var count = 0
    var level = 0
    var previousLevel: Int


    for (item in path.split("").filter { it != "" }) {
        previousLevel = level

        if (item == "U") {
            level += 1
        } else {
            level -= 1
        }

        if (level == 0 && previousLevel < 0) count++
    }

    return count
}


fun main(args: Array<String>) {


    val steps = 100
    val path = "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"

    val result = countingValleys(steps, path)

    println(result)
}