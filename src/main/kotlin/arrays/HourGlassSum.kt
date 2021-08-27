fun hourglassSum(arr: Array<Array<Int>>): Int {

    val sumList = mutableListOf<Int>()

    for (i in 1..4) {
        for (j in 1..4) {
            sumList.add(
                listOf(
                    arr[i - 1][j],
                    arr[i - 1][j - 1],
                    arr[i - 1][j + 1],
                    arr[i + 1][j],
                    arr[i + 1][j - 1],
                    arr[i + 1][j + 1],
                    arr[i][j]
                ).sum()
            )
        }
    }

    return sumList.maxOrNull() ?: 0
}

fun main(args: Array<String>) {

    val arr: Array<Array<Int>> = arrayOf(
        arrayOf(-9, -9, -9, 1, 1, 1),
        arrayOf(0, -9, 0, 4, 3, 2),
        arrayOf(-9, -9, -9, 1, 2, 3),
        arrayOf(0, 0, 8, 6, 6, 0),
        arrayOf(0, 0, 0, -2, 0, 0),
        arrayOf(0, 0, 1, 2, 4, 0)
    )

    val result = hourglassSum(arr)

    println(result)
}