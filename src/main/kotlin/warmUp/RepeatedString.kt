fun String.splitFilterCount(): Long {
    return this.split("").filter { it != "" && it == "a" }.size.toLong()
}

fun repeatedString(s: String, n: Long): Long {

    val modN = n % s.length.toLong()
    val divided = n / s.length.toLong()

    return s.splitFilterCount() * divided + s.substring(0, modN.toInt()).splitFilterCount()
}

fun main(args: Array<String>) {
//    val s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm"
//    val s = "aba"
    val s = "gfcaaaecbg"

//    val n = 736778906400
//    val n = 882787.toLong()
    val n = 547602.toLong()

    val result = repeatedString(s, n)

    println(result)
    // 588525
    // 164280
}