package task_4

fun <T: Comparable<T>> Array<T>.BinarySearch(element: T) : Int {
    val array = this
    var left = 0
    var right = array.size - 1
    while (left <= right) {
        val middle = (left + right) / 2
        if (array[middle] < element) {
            left = middle + 1
        } else if (array[middle] > element) {
            right = middle - 1
        } else {
            return middle
        }
    }
    println("Заданого элемента в массиве нет")
    return -1
}
