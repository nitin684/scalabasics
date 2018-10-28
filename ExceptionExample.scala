/* Scala makes "checked vs unchecked" very simple. It doesn't have checked exceptions.
 *  All exceptions are unchecked in Scala, even SQLException and IOException. */
//You must extend Exception class while declaring custom exception class.
class InvalidAgeException(s:String) extends Exception(s){}  

class ExceptionExample{
/* handling exception with try-catch block */
    def divide(a:Int, b:Int) = {  
       try{  
            a/b  
        }catch{  
            case e: ArithmeticException => println(e)  
            case ex: Exception => println(ex)
        }finally{
          println("Finally always gets executed!")
        }
        
        try{  
            var arr = Array(1,2)  
            arr(10)  
        }catch{  
            case e: ArithmeticException => println(e)  
            case th: Throwable=>println("found an unknown exception "+th)
            case ex: Exception =>println(ex)
        }finally{
          println("Finally always gets executed!")
        }
        
        println("Rest of the code is executing...")  
    }  

/* handling exception with throw new Exception */
    def validate(age:Int)={  
        if(age<18)  
            throw new ArithmeticException("You are not eligible")  
        else println("You are eligible")  
    }  
    
/* handling exception with throws keyword on a method */    
    @throws(classOf[NumberFormatException])  
    def validate()={  
        "abc".toInt  
    }  

/* handling exception with custom Exception */
    @throws(classOf[InvalidAgeException])  
    def validateage(age:Int){  
        if(age<18){  
            throw new InvalidAgeException("Not eligible")  
        }else{  
            println("You are eligible")  
        }  
    } 
}  
object ExceptionExample{  
    def main(args:Array[String]){  
        var e = new ExceptionExample()    // handling exception with try-catch block 
        e.divide(100,0)  
        
        var th = new ExceptionExample()   // handling exception with throw new Exception
        try{  
            th.validate(10) 
        }catch{  
            case ex : Exception => println(ex)  
        } 
                
        var thr = new ExceptionExample()  // handling exception with throws keyword on a method
        try{  
            thr.validate()  
        }catch{  
            case ex : NumberFormatException => println( ex + " Exception handeled here")  
        }  
                
        var cusex = new ExceptionExample()  // handling exception with custom Exception
        try{  
            cusex.validateage(5)  
        }catch{  
            case e : Exception => println("Exception Occured : " + e)  
        }
        println("Rest of the code executing...")
    }  
}  
