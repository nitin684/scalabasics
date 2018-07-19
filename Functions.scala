/* Scala is a first class function language which means it allows you to passing function, returning function, composing function, nested function etc. */

object Functions {

  /* Syntax to declare a scala Function 
 * 
  def functionName(parameters : typeofparameters) : returntypeoffunction = {  
      //statements to be executed  
	}  
 */

  def main(args: Array[String]) {

    functionExample()
    println("*****Return from function*****" + "\n" + retfunctionExample)
    functionExample(2, 4)
    println("*****Return from Recursion function*****" + "\n" + recursionfuncEx(9, 6))

    var result1 = defaultfuncEx(15, 2) // Calling with two values  
    var result2 = defaultfuncEx(15) // Calling with one value  
    var result3 = defaultfuncEx() // Calling without any value  
    println("*****Function with default parameter definition invoked*****")
    println("Result1: " + result1 + "\n" + "Result2: " + result2 + "\n" + "Result3: " + result3)

    var result4 = namedparamfuncEx(a = 15, b = 2) // Parameters names are passed during call  
    var result5 = namedparamfuncEx(b = 15, a = 2) // Parameters order have changed during call  
    var result6 = namedparamfuncEx(15, 2) // Only values are passed during call  
    println("*****Function with Named parameter definition invoked*****")
    println("Result1: " + result4 + "\n" + "Result2: " + result5 + "\n" + "Result3: " + result6)

    /* Higher Order Functions : Passing a Function(without any input parameter) as another function's input parameter */
    higherOrderfuncEx(25, multiplyBy2)

    /* Function Composition : Passing a Function(with input parameter) as another function's input parameter */
    var FuncCompresult = multiplyBy2(add2(10))
    println("*****Result of Function Composition*****" + "\n" + FuncCompresult)
    println(defaultfuncEx(20, multiplyBy2(4)))

    /* MultiLine Expression */
    var MultiLExp1 = addMultiExp1(10, 10)
    var MultiLExp2 = addMultiExp2(10, 10)
    println("*****Result of MultiLine Expression*****" + "\n" + MultiLExp1 + "\n" + MultiLExp2)

    /* Function Currying : a technique of transforming a function that takes multiple arguments into a function that takes a single argument. */
    var funcCurry1 = addFuncCurrying(10)(10)
    println("*****Result of Function Currying*****" + "\n" + "10 + 10 = " + funcCurry1)
    var var1 = 10
    var var2 = 43
    var addIt = addFuncCurrying(var1)(_) /* addIt variable has been transformed to a function with one input parameter which will be the 2nd i/p for add()() function.  */
    var funcCurry2 = addIt(var2)
    println(var1 + " + " + var2 + " = " + funcCurry2)

    /* Anonymous (lambda) Function : a function that has no name but works as a function. */
    var lambda1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)  
    var lambda2 = (_: Int) - (_: Int) // Anonymous function by using _ (underscore) wild card  
    println("*****Result of lambda Function*****")
    println(lambda1(var1, var2))
    println(lambda2(var1, var2))

    /* Nested Functions */
    var nestedres = add(10,10,10)  
    println("*****Result of Nested Functions*****"+"\n"+nestedres) 
  }

  /* Non-Parameterized Function */
  def functionExample() {
    println("This is a simple function")
  }
  /* Function with = operator */
  def retfunctionExample(): Any = {
    var a: Any = 10
    a
  }
  /* Parameterized Function */
  def functionExample(a: Int, b: Int) = {
    var c = a + b
    println("*****Parametrized function invoked*****" + "\n" + c)
  }
  /* Recursion Function */
  def recursionfuncEx(a: Int, b: Int): Int = {
    if (b == 0) // Base condition  
      0
    else
      a + recursionfuncEx(a, b - 1)
  }
  /* Parameters with default values as 0 */
  def defaultfuncEx(a: Int = 0, b: Int = 0): Int = {
    a + b
  }
  /* Function With Named Parameter */
  def namedparamfuncEx(a: Int, b: Int): Int = {
    a / b
  }
  /* Higher Order Functions : Passing a Function(without any input parameter) as another function's input parameter */
  def higherOrderfuncEx(a: Int, f: Int => AnyVal): Unit = {
    println("*****Result of Higher order function*****" + "\n" + f(a))
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }

  def add2(a: Int): Int = {
    a + 2
  }
  /* MultiLine Expression : Expressions those are written in multiple lines. */
  def addMultiExp1(a: Int, b: Int) = {
    a -
      b
    /*  a
     -b */
  }
  def addMultiExp2(a: Int, b: Int) = {
    (a
      + b)
  }
  /* Function Currying */
  def addFuncCurrying(a: Int)(b: Int) = {
    a + b
  }
  /* Nested Functions */
  def add(a: Int, b: Int, c: Int) = {
    def add2(x: Int, y: Int) = {
      x + y
    }
    add2(a, add2(b, c))
  }

}
