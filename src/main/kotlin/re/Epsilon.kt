package re

object Epsilon : RegExp {
    override val isFinal = false
    override val acceptsEmpty = true
    override fun shift(prev: Boolean, character: Char): RegExp = this
}