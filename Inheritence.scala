/*
 * REPL - READ, Evaluate, Print, Loop
 * Inheritence
 * 
 * */

class ThisExample{  
    var id:Int = 0  
    var name: String = ""  
    def this(id:Int, name:String){  
        this()  
        this.id = id  
        this.name = name  
    }  
    def show(){  
        println(id+" "+name)  
    }  
}  

class Stud(name:String){  
    def this(name:String, age:Int){  
        this(name)  
        println(name+" "+age)  
    }      
} 

abstract class Bike{  
    def run()  
}  
  
class Hero extends Bike{  
    def run(){  
        println("running fine...")  
    }  
} 
  
object MainObject3 {  
    def main(args:Array[String]){  
        var t = new ThisExample(101,"Martin")  
        t.show()
        
        var s = new Stud("Rama",100)  
        
        var h = new Hero()  
        h.run() 
    }  
} 
