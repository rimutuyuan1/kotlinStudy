package hello

fun main() {
    compare()
    max(4, 6)
    range(10)
    switch(5)
    hasPrefix("prefixAndPray")
    items()
}

fun compare() {
    val a = 10000
    println(a === a)

    val boxA : Int? = a
    val boxB : Int? = a

    println(boxA === boxB)
    println(boxA == boxB)
}

fun max(a : Int, b : Int) {
    val max = if (a > b) {
        println("choose A")
        a
    }else {
        println("choose B")
        b
    }
    val c = if (a > b) a else b
    println("c 的值为 $c")
}

fun range(a : Int) {
    for (a in 1..8) {
        println("$a 在区间内")
    }
}

fun switch(x : Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3,4 -> println("x == 3 and x == 4")
        in 5..10 -> println("x in 5-10 range")
        !in 11..20 -> println("x is not in 11-20 range")
        else -> {
            println("x 不是1 也不是2")
        }
    }
}

fun hasPrefix(x : Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun items() {
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("orange good!")
        "strawberry" in items -> println("apple is fine too!")
        else -> println("all right!")
    }
}

