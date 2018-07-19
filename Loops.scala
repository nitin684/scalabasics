import scala.util.control.Breaks._

object Loops {

  def main(args: Array[String]) {
    println("*******While loop*******")
    testWhileloop
    println()
    println("*******Do-While loop*******")
    testdoWhileloop
    println()
    println("*******For loop*******")
    testForloop
    println("*******For loop With filtering*******")
    testForloopFiltering
    println("*******For loop With Yield keyword*******")
    testYieldKeyword
    println("*******For loop for Iterating Collection*******")
    testForCollectionItr
    println("*******For Each loop*******")
    testforEACHList
    println
    println("*******For loop with by keyword*******")
    testBykeyword
    println("*******Testing break For loop*******")
    testBreakForloop

  }

  def testWhileloop {
    /* While loop */
    var a = 10 // Initialization
    while (a <= 20) { // While Condition  
      println("Value of a is: " + a)
      a = a + 2 // Increment
    }
  }

  def testdoWhileloop {
    /* Do-While loop */
    var b = 10 // Initialization  
    do {
      println("Value of b is: " + b)
      b = b + 2 // Increment  
    } while (b <= 20) // Do While Condition
  }

  def testForloop {
    /* For loop */
    /* to keyword includes the end of the range, whereas until keyword doesn't include the end of the range.*/
    for (a <- 1 until 10) {
      //      for( a <- 1 to 5 ){ 
      println(a);
    }
  }

  def testForloopFiltering {
    for (a <- 1 to 14 if a % 2 == 0) {
      println(a)
    }
  }

  def testYieldKeyword {
    var result = for (a <- 1 to 10) yield a
    println(result)
    for (i <- result) {
      println(i)
    }
  }

  def testForCollectionItr {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, "Radha") // Creating a list  
    for (i <- list) { // Iterating the list  
      println(i)
    }
  }

  def testforEACHList {
    /* For Each iteration on List */
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, "Ram") // Creating a list 
    println("*******1. For Each iteration on List*******")
    list.foreach {
      println // Print each element  
    }
    println("*******2. For Each iteration on List*******")
    list.foreach(print)
    println()
    println("*******3. For Each iteration on List*******")
    list.foreach((element: Any) => print(element + " ")) // Explicitly mentioning type of elements   
  }

  def testBykeyword {
    /* by keyword gives the next iteration step which needs to be performed.*/
    for (i <- 1 to 10 by 3) {
      println(i)
    }
  }

  def testBreakForloop {
    /* Break is used to break a loop or program execution. */
    for (i <- 1 to 3) {
      breakable {
        for (j <- 1 to 3) {
          if (i == 2 & j == 2)
            break
          println(i + " " + j)
        }
      }
    }
  }
}  
