object worksheet1 {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

/* Imperative VS Functional Programming */
/* Imperative Programming */
def totalImperative (list : List[Int]) =  {
   var sum = 0
   for ( i <- list) {
   		sum += i
   }
   sum
}                                                 //> totalImperative: (list: List[Int])Int
/* Functional Programming */
def totalFunctional (list : List[Int]) =  {
   list.foldLeft(0) {
   		(carryover , e) => carryover + e
   }
}                                                 //> totalFunctional: (list: List[Int])Int
/*
1. Assignment less programming
2. Functions don't have side effect
3. Functions are first class citizens
4. Functions are higher Order
*/

println( "Sum is " + totalImperative(List(1,2,3,4,5)))
                                                  //> Sum is 15
println( "Sum is " + totalFunctional(List(1,2,3,4,5)))
                                                  //> Sum is 15

def totalSelectValues ( list : List[Int] , selector : Int => Boolean ) =  {
  var sum1 = 0
  list.foreach { e => if (selector(e)) sum1 += e }
  sum1
}                                                 //> totalSelectValues: (list: List[Int], selector: Int => Boolean)Int

println( "Total Sum is " + totalSelectValues (List(1,2,3,4,5), e => true ))
                                                  //> Total Sum is 15
println( "Even Sum is " + totalSelectValues (List(1,2,3,4,5), e => e % 2 == 0 ))
                                                  //> Even Sum is 6
println( "Odd Sum is " + totalSelectValues (List(1,2,3,4,5), e => e % 2 == 1 ))
                                                  //> Odd Sum is 9


def showStringInterpolation(){
		var pi = 3.14
		var s1 = "Scala string example"
    var version = 2.12
		var s2 = "Scala \tstring \nexample"
    var s3 = raw"Scala \tstring \nexample"
    
    println(s"value of pi = $pi")
		println(f"This is $s1%s, scala version is $version%2.2f")
		println(s2)
    println(s3)
}                                                 //> showStringInterpolation: ()Unit

showStringInterpolation()                         //> value of pi = 3.14
                                                  //| This is Scala string example, scala version is 2.12
                                                  //| Scala 	string 
                                                  //| example
                                                  //| Scala \tstring \nexample



}