fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pairs = 0

    val freq = ar.toList().groupingBy { it }.eachCount()
    freq.values.forEach { pairs += (it / 2) }

    return pairs
}

fun main(args: Array<String>) {
    val n = 9
    val ar: Array<Int> = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)

    val result = sockMerchant(n, ar)

    println(result)
}

