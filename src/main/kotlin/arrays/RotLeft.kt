fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    return (a.slice(IntRange(d, a.size - 1)) + a.slice(IntRange(0, d - 1))).toTypedArray()
}

fun main(args: Array<String>) {

    val d = 4

    val a = arrayOf(1, 2, 3, 4, 5)

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}