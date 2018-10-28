
class StringExample{  
    var str = "Scala string example"  
    var version = 2.12  
    var s1 = "Scala \tstring \nexample"
    var s2 = raw"Scala \tstring \nexample"
    
    def showS(){  
        println(s"This is $str")  
    } 
    
    def showF(){  
        println(f"This is $str%s, scala version is $version%2.2f")  
    } 
    
    def showRaw(){  
        println(s1)  
        println(s2)  
    } 
}  

object StringExample{  
    def main(args:Array[String]){  
        var s = new StringExample()  
        s.showS()
        s.showF()
        s.showRaw()
    }
}  
