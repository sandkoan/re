package re

data class Symbol(val sym: Char, override val isFinal: Boolean = false) : RegExp {
    override val acceptsEmpty = false
    override fun shift(prev: Boolean, character: Char) =
        if (prev && sym == character) Symbol(sym, isFinal = true)
        else Symbol(sym, false)
}