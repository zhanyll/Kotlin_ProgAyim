package ccc.kkk.prog

fun main(args: Array<String>) {
    val list = bubbleSort(intArrayOf(10, 6, 8, 3, 0, 1, 7, 12))
    for (k in list) println("$k ")
}


fun bubbleSort(array:IntArray):IntArray{
    var swap = true
    var right = array.size-1
    while(swap){
        swap = false
        for(i in 0 until right){
            if(array[i] > array[i+1]){
                var inf = array[i]
                array[i] = array[i+1]
                array[i + 1] = inf

                swap = true
            }
        }
        right--
    }

    return array
}