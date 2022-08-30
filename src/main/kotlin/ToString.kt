data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("John", 29)
    println(u1.toString())
}