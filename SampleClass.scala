/*
Scala is a pure object oriented programming language.
Object is a real world entity. It contains state and behavior. Object in scala is an instance of class. It is also known as runtime entity.
Class is a template or a blueprint. It is also known as collection of objects of similar type.
There must be an object in which main method is defined.
Must initialize all instance variables in the class.
*/

class SampleClass {
  var id: Int = 0; // All fields must be initialized  
  var name: String = null;

  def show() {
    println("*****Assigned value of variables*****" + "\n" +"ID = " + id + " "+ "Name = " + name)
  }

  def add(a: Int, b: Int) {
    var add = a + b;
    println("*****Anonymous Object*****"+"\n"+"sum = " + add);
  } 
  
}

/* Primary constructor : Constructor is created in class definition. */
class Student(id: Int, name: String) {
  def show() {
    println("*****Assigned value of variables*****" + "\n" +"ID = " + id + " "+ "Name = " + name)
  }
}

object MainObject {
  def main(args: Array[String]) {
    var s = new SampleClass() // Creating an object  
    println("*****Initialized value of variables*****" + "\n" +"ID = " + s.id + " "+ "Name = " + s.name)

    var stu = new Student(100, "Martin") // Passing values to constructor  
    stu.show() // Calling a function by using an object 

    var stu1 = new SampleClass()
    stu1.id = 567
    stu1.name = "Major"
    stu1.show()
    
    new SampleClass().id = 567
    new SampleClass().name = "Major"
    new SampleClass().show()

    /* Anonymous object : An object which has no reference name is called anonymous object.  */
    new SampleClass().add(10,10);
  }
}







