package hello

fun main(args: Array<String>) {
    //Greeter("world").greet()
    //println("what's your name?")
    //val name = readLine()
    //println("Hello $name")
    val a = 1
    val b = 2
    println(sum(a, b))
    println(sums(a, b + 1))
    vars(1,2,3,4,5)
    lambda()
    template()
}

class Greeter(private val name: String) {
    fun greet() {
        println("hello $name")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

public fun sums(a : Int, b : Int) : Int = a + b

fun vars(vararg value : Int) {
    for (vt in value) {
        println(vt)
    }
}

fun lambda() {
    val sumLambda : (Int , Int) -> Int = {
        x,y -> x + y
    }
    println(sumLambda(1, 2))
}

/* 这是一个多行的
   块注释。 */
fun const() {
    val a = 1
    val b : Int = 1;
    val c : String = "mark"
}

fun template() {
    val a = 1
    val s1 = "a is $a"

    val b = 2
    val s2 = "${s1.replace("is", "was")}, but now is $b"
    println(s1)
    println(s2)
}

fun npe() {
    //?表示可为空
    var age:String? = null
    //!!表示如果为空抛出NPE
    var ages = age!!.toInt()
    //不作处理返回null
    var ageA = age?.toInt()
    //age为空返回-1
    var ageB = age?.toInt() ?: -1
}














