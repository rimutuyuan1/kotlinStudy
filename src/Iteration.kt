package hello

fun main() {
    iterate()
}

fun iterate() {
    // 遍历集合
    val items = setOf<String>("1", "2", "3")
    for (item in items) {
        println(item)
    }
    println("-----------------------------")
    // 遍历数组
    val arr = arrayOf("5", "6", "7")
    for (item in arr) {
        println(item)
    }
    println("-----------------------------")
    for (i in arr.indices) {
        println(arr[i])
    }
    println("-----------------------------")
    for ((index, value) in arr.withIndex()) {
        println("the element at $index is $value")
    }
}

