fun main(args: Array<String>) {
    val interpreter = Interpreter().buildInterpreterTree()

    val context1 = "sameh ahmed"
    val context2 = "ahmed mohamed"
    val context3 = "sameh mohamed"

    println("$context1 is ${interpreter.interpreter(context1)}")
    println("$context2 is ${interpreter.interpreter(context2)}")
    println("$context3 is ${interpreter.interpreter(context3)}")
}