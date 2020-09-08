package hello

fun testString() {
    val str1 = "abc"
    val str2 = """line1\n
        line2
        line3
        """
    val js = """
        function myFunction()
        {
            document.getElementById("demo").innerHTML="My First JavaScript Function";
        }
        """.trimIndent()
    println(str1)
    println(str2)
    println(js)
    println("First content is \$strings")
    println("First content is ${'$'}strings")
}

fun main() {
    testString()
}