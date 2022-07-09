package task_6

fun String.isPalindrome() : Boolean {
    if (this.length == 1) return true
    return this == this.reversed()
}
