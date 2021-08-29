package hashTables

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    var match = true
    val magMap = magazine.groupingBy { it }.eachCount()
    val noteMap = note.groupingBy { it }.eachCount()

    noteMap.forEach { (k, v) ->
        if (magMap[k] == null || magMap[k]!! < v) {
            match = false
        }
    }

    if (match) print("Yes")
    else print("No")
}

fun main(args: Array<String>) {

    val magazine = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg".split(" ").toTypedArray()
    val note = "elo lxkvg bg mwz clm w".split(" ").toTypedArray()
    checkMagazine(magazine, note)
}