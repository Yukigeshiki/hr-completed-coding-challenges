fun jumpingOnClouds(c: Array<Int>): Int {
    var index = 0
    var count = 0
    val size = c.size

    while (index < size - 1) {
        if (index < size - 2) {
            index += if (c[index + 2] == 0) {
                2
            } else {
                1
            }
        } else if (index >= size - 2) {
            index += if (c[index + 1] == 1) {
                2
            } else {
                1
            }
        }
        count++
    }
    return count
}

fun main(args: Array<String>) {
//    val n = 7
//    val n = 6

//    val c: Array<Int> = arrayOf(0, 0, 1, 0, 0, 1, 0)
//    val c: Array<Int> = arrayOf(0, 0, 0, 1, 0, 0)
    val cString =
        "0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 0 0"
    val c: Array<Int> = cString.split(" ").map { it.toInt() }.toTypedArray()


    val result = jumpingOnClouds(c)

    println(result)
}