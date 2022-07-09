package task_1

fun <T: Comparable<T>> Array<T>.MaxElem() : T {
    val array = this
    var max = array[0]
    for (i in array.indices){
        if (max < array[i]) {
            max = array[i]
        }
    }
    return max
}
