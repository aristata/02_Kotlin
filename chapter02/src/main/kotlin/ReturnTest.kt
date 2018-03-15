fun main(args: Array<String>) {
    //addTwoNumbers(1, 2)
    //largestNumber(1, 2, 3)
    printLessThanTwo()
    //printUntilStop1()
    //printUntilStop2()
}


fun addTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

fun largestNumber(a: Int, b: Int, c: Int): Int {
    fun largest(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }
    return largest(largest(a, b), largest(b, c))
}

fun printLessThanTwo() {
    val list = listOf(1, 2, 3, 4)
    list.forEach(fun(x) {
        if (x < 2) println("$x - O")
        else println("$x - X")
    })
    println("This line will still execute")
}

fun printUntilStop1() {
    val list = listOf("a", "b", "stop", "c")
    list.forEach stop@ {
        if (it == "stop") return@stop
        else println(it)
    }
}

fun printUntilStop2() {
    val list = listOf("a", "b", "stop", "c")
    list.forEach {
        if (it == "stop") return@forEach
        else println(it)
    }
}