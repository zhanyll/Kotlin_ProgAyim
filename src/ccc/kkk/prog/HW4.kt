package ccc.kkk.prog

/** Найти количество цифр в заданном числе
 * > 400
 * < число 400 содержит 3 цифр
 */

fun main() {
    println("Введите число: ")
    val num = readLine()!!.toInt()
    println("Число $num содержит ${digits(num)} цифр")
}

fun digits(n: Int): Int =
    when (n) {
        in 0..9 -> 1
        else -> 1 + digits(n / 10)
    }


