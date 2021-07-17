package re

object Operators {
    infix fun RegExp.`~`(other: RegExp) = Sequence(this, other)
    infix fun RegExp.`|`(other: RegExp) = Alternation(this, other)
    fun `*`(regex: RegExp) = Repetition(regex)
    fun s(character: Char) = Symbol(character)
}