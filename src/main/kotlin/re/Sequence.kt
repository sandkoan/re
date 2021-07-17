package re

data class Sequence(val r1: RegExp, val r2: RegExp) : RegExp {
    override val isFinal = r2.isFinal || (r2.acceptsEmpty && r1.isFinal)
    override val acceptsEmpty = r1.acceptsEmpty && r2.acceptsEmpty
    override fun shift(prev: Boolean, character: Char) =
        Sequence(r1.shift(prev, character), r2.shift((prev && r1.acceptsEmpty) || r1.isFinal, character))
}