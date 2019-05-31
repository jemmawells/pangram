
object Pangram{


fun isPangram (str: String): Boolean {

    val letters = 'a'..'z'

    for (i in letters)
        if (!str.contains(i, ignoreCase = true)) return false
    return true

}

}