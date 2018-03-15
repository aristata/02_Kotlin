
interface IPrintable {
    fun print() {

    }
}

enum class Word : IPrintable {
    HELLO {
        override fun print() {
            println("Word is HELLO")
        }
    },
    BYE {
        override fun print() {
            println("Word is BYE")
        }
    }
}

fun main(args: Array<String>) {
    val w = Word.HELLO
    w.print()
}