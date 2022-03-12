
fun main(args: Array<String>) {
    val expression = Expression()
    //supported operators (+-Plus,-Minus,*-Multiply,/-Divide)
    //How it works
    //class Token splits an input into tokens of numbers or operators
    //then it converts prefix expression to PostFix via PostFix Object
    //after its simply calculating expression via Expression.Calculate function
    val p1: String = expression.calculate("50+(6/2-5)")
    val p2 = expression.calculate("5+5*5-(2+1)")
    println("50+(6/2-5) = $p1")
    println("5+5*5-(2+1) = $p2")
}

