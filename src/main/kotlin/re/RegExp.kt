package re

sealed interface RegExp {
    val isFinal: Boolean
    val acceptsEmpty: Boolean
    fun shift(prev: Boolean, character: Char): RegExp
    fun matches(str: String) =
        if (str.isEmpty()) this.acceptsEmpty
        else str.fold(
            this.shift(true, str[0])
        ) { acc, c -> acc.shift(false, c) }.isFinal
}
