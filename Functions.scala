

object Functions {
  
/* Syntax to declare a scala Function 
 * 
  def functionName(parameters : typeofparameters) : returntypeoffunction = {  
      //statements to be executed  
	}  
 */
  
  def main(args: Array[String]) { 
    
      functionExample()            
      println("*****Return from function*****" +"\n"+ retfunctionExample)
      functionExample(2,4)
      println("*****Return from Recursion function*****" +"\n"+ recursionfuncEx(9,6))
      
      var result1 = defaultfuncEx(15,2) // Calling with two values  
      var result2 = defaultfuncEx(15)   // Calling with one value  
      var result3 = defaultfuncEx()     // Calling without any value  
      println("*****Function with default parameter definition invoked*****")
      println("Result1: " + result1 +"\n"+ "Result2: " + result2 +"\n"+ "Result3: " + result3)  
      
      var result4 = namedparamfuncEx(a = 15, b = 2)    // Parameters names are passed during call  
      var result5 = namedparamfuncEx(b = 15, a = 2)    // Parameters order have changed during call  
      var result6 = namedparamfuncEx(15,2)             // Only values are passed during call  
      println("*****Function with Named parameter definition invoked*****")
      println("Result1: " + result4 +"\n"+ "Result2: " + result5 +"\n"+ "Result3: " + result6)
      
      higherOrderfuncEx(25, multiplyBy2)        // Passing a function as parameter  
      
      /* Function Composition */
      var result = multiplyBy2(add2(10)) 
      println("*****Result of Function Composition*****" +"\n"+ result)
      
      println(defaultfuncEx(20,multiplyBy2(3)))
  }  
  
  /* Non-Parameterized Function */
  def functionExample()  {          
	    println("This is a simple function")  
  }
  /* Function with = operator */
  def retfunctionExample():Any = {       
		  var a:Any = 10  
				  a  
  }  
  /* Parameterized Function */
  def functionExample(a:Int, b:Int) = {  
		  var c = a+b  
		  println("*****Parametrized function invoked*****" +"\n"+ c)  
  }  
  /* Recursion Function */
  def recursionfuncEx(a:Int, b:Int):Int = {  
		  if(b == 0)  // Base condition  
			  0  
		  else  
			  a + recursionfuncEx(a,b-1)  
  }  
  /* Parameters with default values as 0 */
  def defaultfuncEx(a:Int = 0, b:Int = 0):Int = {     
		  a+b  
  }
  /* Function With Named Parameter */
  def namedparamfuncEx(a:Int, b:Int):Int = {  
      a/b 
  } 
  /* Higher Order Functions */
  def higherOrderfuncEx(a:Int, f:Int=>AnyVal):Unit = {  
      println("*****Result of Higher order function*****" +"\n"+ f(a))   
  }
  
  def multiplyBy2(a:Int):Int = {  
      a*2  
  }
  
  def add2(a:Int):Int = {  
      a+2  
  }  
  
  
  
}
