package re

data class Repetition(val r: RegExp) : RegExp {
    override val isFinal = r.isFinal
    override val acceptsEmpty = true
    override fun shift(prev: Boolean, character: Char) =
        Repetition(r.shift(r.isFinal || prev, character))
}