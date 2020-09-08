package hello

class Person {

    var lastName : String = "wang"
    get() = field.toUpperCase()
    set

    var no : Int = 100
    get() = field
    set(value) {
        if (value > 10) {
            field = value
        } else {
            field = -1
        }
    }

    var weight : Float = 145.4F
    private set
}

fun main() {
    val person = Person()
    println("lastName : ${person.lastName}")

    person.no = 9
    println("no : ${person.no}")

    person.no = 20
    println("no : ${person.no}")

    println(person.weight)

    val people = People("ma", "Jack")

    println(people.toString())

    people.country = "beijing"
    println("country is ${people.country}")
}

class People constructor(firstName : String, lastName : String) {
    init {
        println("init name is $firstName.$lastName")
    }

    var url : String = "www.baidu.com"
    get
    set

    var country : String = "CN"
    get
    set


}