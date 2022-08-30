// class A is accessible from same source file
private class A {
	private val int = 10
	fun display()
	{
		// we can access int in the same class
		println(int)
		println("Accessing int successful")
	}
}
fun main(args: Array<String>){
	var a = A()
	a.display()
	// can not access 'int': it is private in class A
	println(a.int)
}
