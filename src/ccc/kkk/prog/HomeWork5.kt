package ccc.kkk.prog

/**
 * --- HW-5 ---
 * Зная имена и номера телефонов, составьте телефонную книгу,
 * в которой имена друзей сопоставлены с их соответствующими
 * телефонными номерами. Затем вам будет предоставлено неизвестное
 * количество имен для запроса в телефонной книге.
 *
 * Телефонная книга должна быть структурой данных HashMap.
 *
 * Формат ввода
 * - Первая строка содержит целое число, обозначающее
 * количество записей в телефонной книге.
 * - Каждая из последующих строк описывает запись в виде значений,
 * разделенных пробелами, в одной строке.
 * Первое значение - это имя друга, а второе - номер телефона,
 * состоящий из цифр.
 * - После строк записей телефонной книги идет неизвестное
 * количество строк с запросами. Каждая строка (запрос)
 * содержит поиск, и вы должны продолжать читать строки,
 * пока не введете специальную команду для выхода "exit".
 *
 * В новой строке для каждого запроса выведите "Not found",
 * если имя не имеет соответствующей записи в телефонной книге;
 * иначе выведите полное имя в формате name = phoneNumber.
 *
 * - Класс Scanner вам в помощь.
 *
 * Пример ввода
 * > 3
 * > oleg 702300300
 * > sasha 500700700
 * > masha 702398907
 * > oleg
 * > anton
 * > masha
 * > exit
 *
 * Пример вывода
 * < oleg = 702300300
 * < Not found
 * < masha = 702398907
 */

import java.util.Scanner

fun main(args: Array<String>) {

    var hashMap: HashMap<String, Int> = HashMap<String, Int>()

    println("Enter a number of names you would like to add: ")
    val num = readLine()!!.toInt()
    for (i in 1..num) {
        val input = Scanner(System.`in`) // Scanner нужно обязательно закрывать
        val (name, number) = input.nextLine().split(' ')

        hashMap.put(name, number.toInt())
    }

    println("Enter name/names numbers of you want to know: ")

    while (true) {
        val input = Scanner(System.`in`) // Scanner нужно обязательно закрывать
        val name = input.nextLine()

        if (name in hashMap.keys) {
            println("$name = ${hashMap[name]}")
        } else if (name == "exit") {
            break
        } else {
            println("Not found")
        }

    }
}
