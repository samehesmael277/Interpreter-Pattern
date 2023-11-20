class Interpreter {
    companion object

    fun buildInterpreterTree(): Expression {
        val terminal1 = TerminalExpression("sameh")
        val terminal2 = TerminalExpression("ahmed")
        val terminal3 = TerminalExpression("mohamed")

        // ahmed and mohamed
        val alternation1 = AndExpression(terminal2, terminal3)

        // sameh or (ahmed and mohamed)
        val alternation2 = OrExpression(terminal1, alternation1)

        // mohamed and (sameh or (ahmed and mohamed))
        return AndExpression(terminal3, alternation2)
    }
}