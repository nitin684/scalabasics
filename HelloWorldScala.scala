
object HelloWorldScala {
  /* Scala Variables */
	var str        = "Hello World"      /* Mutable   variable declared using **var** */
  val str1       = "Hello World"      /* Immutable variable declared using **val** */
  val x          = 10.2
  val y          = 20.3
 /* Scala supports type inference. It identifies the datatype on its own.*/  
  var age        = 20            
  var num:Int    = 21
  var number     = 65
  
  def main(args: Array[String]) {
    
    println("Hello Scala !!")
    str = "New String"
    println("Value of Mutable variable is   : " + str)
    println("Value of Immutable variable is : " + str1)
    println()
 /* Lazy val variables are calculated once, the first time the variable is accessed. */    
    lazy val z = x*y          
    println("Value of Lazy variable Z is    : " + z)
    println()
    if(age > 18){  
        println ("Age is greate than 18.")  
    }
    println()    
    if(num%2==0){  
        println("Even number")  
    }else{  
        println("Odd number")  
    }
    println()
/* If-else nesting */
    println("IF-else Nesting")
    if(number>=0 && number<50){  
        println ("fail")  
    }  
    else if(number>=50 && number<60){  
        println("D Grade")  
    }  
    else if(number>=60 && number<70){  
        println("C Grade")  
    }  
    else if(number>=70 && number<80){  
        println("B Grade")  
    }  
    else if(number>=80 && number<90){  
        println("A Grade")  
    }  
    else if(number>=90 && number<=100){  
        println("A+ Grade")  
    }  
    else println ("Invalid")
    println()
/* Functional approach */    
    scalaExample          
    
/* Any is a class in Scala which is a super class of all data types and deals with all type of data. */    
    var result:Any = checkIt(0)   
    println (result)
    
/* Scala Pattern Matching Example */    
    var a = 2  
    a match{  
      case 1 => println("One")  
      case 2 => println("Two")  
      case _ => println("No")  
    }
    
    result = search ("Hello")  
    
    println("Done for the day")
  }
  
/* Passing if expression value to function as return, Example of If as a ternary operator */
  def checkIt (a:Int)  =  if (a >= 0) 1 else -1  

/* Functional approach */  
  def scalaExample{  
      println("Hello Scala")  
  }  

  def search (a:Any):Any = a match{  
    case 1  => println("One")  
    case "Two" => println("Two")  
    case "Hello" => println("Hello")  
    case _ => println("No")
  }
}

