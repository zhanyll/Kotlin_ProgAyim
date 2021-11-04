package ccc.kkk.prog

fun main() {
    println("Введите первое число: ")
    val num1 = readLine().parseToInt()

    println("Введите знак операции: ")
    val sign = readLine()

    println("Введите второе число: ")
    val num2 = readLine().parseToInt()

    when(sign) {
        "+" -> println("Результат: ${num1 + num2}")
        "-" -> println("Результат: ${num1 - num2}")
        "*" -> println("Результат: ${num1 * num2}")
        "/" -> println(div(num1, num2))
        else -> {
            println("Неопознанный знак!")
        }
    }
}

private fun div(num1: Int, num2: Int): String {
    return try {
        "Результат: ${num1 / num2}"
    } catch (a: ArithmeticException) {
        "На 0 делить нельзя!!"
    }
}

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception = $e")
        0
    }
}