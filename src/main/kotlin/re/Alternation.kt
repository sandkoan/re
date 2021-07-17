package re

data class Alternation(val r1: RegExp, val r2: RegExp) : RegExp {
    override val isFinal = r1.isFinal || r2.isFinal
    override val acceptsEmpty = r1.acceptsEmpty || r2.acceptsEmpty
    override fun shift(prev: Boolean, character: Char) =
        Alternation(r1.shift(prev, character), r2.shift(prev, character))
}