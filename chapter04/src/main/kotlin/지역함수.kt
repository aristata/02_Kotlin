fun fizzbuzz(start: Int, end: Int) {
  for (i in start..end) {

    fun isFizz(): Boolean = i % 3 == 0
    fun isBuzz(): Boolean = i % 5 == 0

    when {
      isFizz() && isBuzz() -> println("Fizz Buzz")
      isFizz() -> println("Fizz")
      isBuzz() -> println("Buzz")
      else -> println(i)
    }
  }
}

fun samyukgu(start: Int, end: Int) {

  for (i in start..end) {

    fun il() = when {
      i % 10 == 3 -> true
      i % 10 == 6 -> true
      i % 10 == 9 -> true
      else -> false
    }

    fun sib() = when {
      (i / 10) % 10 == 3 -> true
      (i / 10) % 10 == 6 -> true
      (i / 10) % 10 == 9 -> true
      else -> false
    }

    fun beck() = when {
      (i / 100) % 10 == 3 -> true
      (i / 100) % 10 == 6 -> true
      (i / 100) % 10 == 9 -> true
      else -> false
    }

    fun chun() = when {
      (i / 1000) % 10 == 3 -> true
      (i / 1000) % 10 == 6 -> true
      (i / 1000) % 10 == 9 -> true
      else -> false
    }

    when {
      il() && sib() && beck() && chun() -> println("$i 짝짝짝짝")
      il() && sib() && beck() -> println("$i 짝짝짝")
      il() && sib() && chun() -> println("$i 짝짝짝")
      il() && beck() && chun() -> println("$i 짝짝짝")
      sib() && beck() && chun() -> println("$i 짝짝짝")
      beck() && chun() -> println("$i 짝짝")
      sib() && chun() -> println("$i 짝짝")
      il() && chun() -> println("$i 짝짝")
      sib() && beck() -> println("$i 짝짝")
      il() && beck() -> println("$i 짝짝")
      il() && sib() -> println("$i 짝짝")
      chun() -> println("$i 짝")
      beck() -> println("$i 짝")
      sib() -> println("$i 짝")
      il() -> println("$i 짝")
      else -> println(i)
    }
  }
}

fun main(args: Array<String>) {
  //fizzbuzz(1, 100)
  samyukgu(1,10000)
}
