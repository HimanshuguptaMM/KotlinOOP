// base class
open class A {
	// protected variable
	protected val int = 10
}

// derived class
class B: A() {
	fun getvalue(): Int {
		// accessed from the subclass
		return int
	}
}

fun main(args: Array<String>) {
	var a = B()
	println("The value of integer is: "+a.getvalue())
}
