/*
 * A trait is like an interface with a partial implementation.
 * In scala, trait is a collection of abstract and non-abstract methods.
 */
trait TraitExample {
  def print()
}
abstract class PrintA4 {
  def printA4()
}
class A4 extends TraitExample {
  def print() {
    println("Hello")
  }
}
/*
 * If a class extends a trait but does not implement the members declared in that trait,
 * it must be declared abstract.
 */
abstract class A2 extends TraitExample { // Must declared as abstract class
  def printA2() {
    println("Hello, this is A2 Sheet")
  }

  def printA12() {
    println("Hello, this is A2 Sheet")
  }
}
class A6 extends A2 {
  def print() { // Implementing the Trait print method via extending abstract class A2
    println("Implemented print sheet")
  }
  override def printA2() { //overriding Method printA2 of Abstract class A2
    println("Print A6 Sheet")
  }
  def printA61() {
    println("Hello, this is A6 Sheet")
  }
}
/*
 * The right mixins order of trait is that any class or abstract class which you want
 * to extend, first extend this. All the traits will be extended after this class or
 * abstract class.
 */
class TraitMixins extends PrintA4 with TraitExample { // First abstract class then trait
  def print() { // Trait print
    println("print sheet")
  }
  def printA4() { // Abstract class printA4
    println("Print TraitMixins Sheet")
  }
}

object TraitEx {
  def main(args: Array[String]) {
    var a = new A4()
    a.print()

    var b = new A6()
    b.print()
    b.printA2()
    b.printA12()
    b.printA61()

    var c = new TraitMixins()
    c.print()
    c.printA4()
  }
}