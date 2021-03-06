
// Default Parameter Values and Named Arguments

//fun printMessage(message: String): Unit {
//    println(message)
//}
//
//fun printMessageWithPrefix(message: String, prefix: String = "Info") {
//    println("[$prefix] $message")
//}
//
//fun sum(x:Int, y: Int): Int {
//    return x + y
//}
//
//fun multiply(x: Int, y: Int) = x * y
//
//fun main() {
//    printMessage("Hello")
//    printMessageWithPrefix("Hello", "Log")
//    printMessageWithPrefix("Hello")
//    printMessageWithPrefix(prefix = "Log", message = "Hello")
//    println(sum(1,2))
//    println(multiply(2, 4))
//}

// Infix Functions

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}