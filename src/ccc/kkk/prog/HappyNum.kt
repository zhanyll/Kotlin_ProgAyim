package ccc.kkk.prog

fun main() {
    println("Введите число: ")
    val num = readLine()!!.toCharArray()

    val sum1 = num[0].toInt() + num[1].toInt()
    val sum2 = num[2].toInt() + num[3].toInt()

    if (sum1 == sum2) {
        println("Счастливое число!")
    } else {
        println("Несчастливое число(")
    }
}