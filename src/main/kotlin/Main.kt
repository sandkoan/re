import re.Operators.`*`
import re.Operators.`|`
import re.Operators.`~`
import re.Operators.s

fun main() {
    val regex =
        (`*`((`*`(s('a') `|` s('b'))) `~` (s('c') `~` (`*`(s('a') `|` s('b')))) `~` s('c'))) `~` (`*`(s('a') `|` s('b')))

    println(regex.matches("abc"))
}
