import java.util.*

class TerminalExpression(private val data: String) : Expression {
    override fun interpreter(context: String): Boolean {
        val string = StringTokenizer(context)
        while (string.hasMoreTokens()) {
            val mString = string.nextToken()
            if (mString.equals(data)) {
                return true
            }
        }
        return false
    }
}

class OrExpression(private val expr1: Expression, private val expr2: Expression) : Expression {
    override fun interpreter(context: String): Boolean {
        return expr1.interpreter(context) || expr2.interpreter(context)
    }
}

class AndExpression(private val expr1: Expression, private val expr2: Expression) : Expression {
    override fun interpreter(context: String): Boolean {
        return expr1.interpreter(context) && expr2.interpreter(context)
    }
}