package ccc.kkk.prog

fun main(args: Array<String>) {
    val list = bubbleSort(intArrayOf(10, 6, 8, 3, 0, 1, 7, 12))
    for (k in list) println("$k ")
}


fun bubbleSort(array:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until array.size-1){
            if(array[i] > array[i+1]){
                val inf = array[i]
                array[i] = array[i+1]
                array[i + 1] = inf

                swap = true
            }
        }
    }

    return array
}