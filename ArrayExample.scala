
class ArrayExample(arr:Array[Int]){  
    
    def show1D(){  
        for(a<-arr)                       // Traversing array elements  
            println(a)  
        println("Third Element  = "+ arr(2))        // Accessing elements by using index  
    } 
    arr.foreach( (element:Int) => print(element) )
    println()
}  

class Array2DExample(arr:Array[Array[Int]]){  
    var rows = arr.length
    var cols = arr(0).length
    
    def show2D(){  
        for {
           i <- 0 until rows
           j <- 0 until cols
        }
    println(s"arr($i)($j) = ${arr(i)(j)}")
    }    
} 
  
object MainObject4{  
    def main(args:Array[String]){ 
      var arr1D  = Array(1,2,3,4,5)      // Creating 1D array  
      var arr2D = Array(Array(1,2,3,4,5), Array(6,7,8,9,10)) // Creating 2D array  
      
      var a1D = new ArrayExample(arr1D)  
      var a2D = new Array2DExample(arr2D)
        
      a1D.show1D()         
      a2D.show2D()  
        
    }  
}  
