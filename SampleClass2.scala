trait SuperTrait
/* Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
It uses equal method to compare instance structurally. It does not use new keyword to instantiate object.
All the parameters listed in the case class are public and immutable by default. 
A case class which has no arguments is declared as case object instead of case class. case object is serializeable by default. */
case class CaseClass1(a: Int, b: Int) extends SuperTrait
case class CaseClass2(a: Int) extends SuperTrait // Case class  
case object CaseObject extends SuperTrait // Case object  

/* Primary Constructor */
class Student1(id: Int, name: String) {
  def showDetails() {
    println(id + " " + name);
  }
}

/* Secondary (auxiliary) Constructor: call primary constructor from inside the auxiliary constructor using this keyword. */
class Student2(id: Int, name: String) {
  var age: Int = 0
  def showDetails() {
    println(id + " " + name + " " + age)
  }
  def this(id: Int, name: String, age: Int) {
    this(id, name) // Calling primary constructor, and it is first line  
    this.age = age
  }
}
/* Constructor Overloading */
class Student3(id: Int, name: String) {
  def this(id: Int, name: String, age: Int) {
    this(id, name) // Calling primary constructor, and it is first line  
    println(id + " " + name + " " + age)
  }
  println(id + " " + name)
}

object MainObject2 {
  def main(args: Array[String]) {
    println("*****Testing Case Class*****")
    callCase(CaseClass1(10, 10))
    callCase(CaseClass2(10))
    callCase(CaseObject)

    println("*****Testing Primary Constructor*****")
    var s1 = new Student1(101, "Rama");
    s1.showDetails()

    println("*****Testing auxiliary Constructor*****")
    var s2 = new Student2(100, "Rama", 20);
    var s21 = new Student2(100, "Rama");
    s2.showDetails()
    s21.showDetails()
    
    println("*****Testing Constructor OverLoading*****")
    var s3 = new Student3(102, "Laxman");
    var s4 = new Student3(103, "Bharat",24);

  }

  def callCase(f: SuperTrait) = f match {
    case CaseClass1(f, g) => println("a = " + f + " b =" + g)
    case CaseClass2(f) => println("a = " + f)
    case CaseObject => println("No Argument")
  }
} 
