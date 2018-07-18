

object Functions {
  
  def main(args: Array[String]) {  
      functionExample()           // Calling function 
      println(retfunctionExample)
      functionExample(2,4)
      println(recursionfuncEx(9,6))
  }  
  
/* Syntax to declare a scala Function 
 * 
  def functionName(parameters : typeofparameters) : returntypeoffunction = {  
      //statements to be executed  
	}  
 */
 
  def functionExample()  {        // Defining a non parameterized function  
      println("This is a simple function")  
  }
  
  def retfunctionExample():Any = {       // Defining a function  
      var a:Any = 10  
      a  
  }  

  def functionExample(a:Int, b:Int) = {  
      var c = a+b  
      println(c)  
  }  
  
  def recursionfuncEx(a:Int, b:Int):Int = {  
      if(b == 0)          // Base condition  
       0  
      else  
       a + recursionfuncEx(a,b-1)  
  }  

}
