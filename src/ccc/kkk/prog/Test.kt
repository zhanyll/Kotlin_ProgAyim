package ccc.kkk.prog

fun main() {
    val i1 = 5
    val i2: Int = 5
    val f1: Float = 10.0f
    val l1: Long = 10L
    val b1: Boolean = false
    val n1: Nothing? = null

    val ss1 = "xxx"
    val ss2 = "xxx"

    println("ss1 == ss2 -> " + (ss1 == ss2))

    val s1: String? = null
    val res = s1?.length ?: "variable is null"
    println("s1.length = $res")
}