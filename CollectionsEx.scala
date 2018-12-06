import scala.collection.mutable._ 

class CollectionsEx {
    
}

object CollectionsEx {  
    def main(args:Array[String]){  
      println("+++++Scala Collections+++++")
      
/* Scala Set : It is used to store unique elements in the set. It does not maintain any order for storing elements. */
      val set1 = Set()                                        // An empty set 
      val emptyset = Set().empty                              // An empty set
      val games = Set("Cricket","Football","Hocky","Golf")    // Creating a set with elements 
      val alphabet = Set("A","B","C","D","E")
      println(set1)
      println(emptyset) 
      println(games)
/* operations on a set */
      println(games.head)     // Returns first element present in the set  
      println(games.tail)     // Returns all elements except first element.  
      println(games.isEmpty)  // Returns either true or false
      println("Golf exists in the set : "+ games.contains("Golf"))  
      println("Racing exists in the set : "+ games.contains("Racing"))
      var setIntersection = games.intersect(alphabet)  
      println("Intersection by using intersect method: "+setIntersection)  
      println("Intersection by using & operator: "+(games & alphabet))  
      var setUnion = games.union(alphabet)  
      println(setUnion)  
/* Merge 2 sets */      
      val mergeSet = games ++ alphabet            // Merging two sets  
      println("Elements in games set: "+games.size)   // Return size of collection  
      println("Elements in alphabet set: "+alphabet.size)   
      println("Elements in mergeSet: "+mergeSet.size)  
      println(mergeSet)  
/* Add/Remove elements from a set */
      println(games)  
      games += "Racing"      // Adding new element  
      println(games)  
      games += "Cricket"     // Adding new element, it does not allow duplicacy.  
      println(games)  
      games -= "Golf"        // Removing element  
      println(games)  
/* Iterate set using For loop */
      println("\nIterating through Games set: ")
      for(i <- games){  
          print(i + " ")  
      }  
      println()
      games.foreach((j:String)=> print(j + " ")) 
      println()
/* Sorted Set : SortedSet extends Set trait and provides sorted set elements. 
 * It is useful when you want sorted elements in the Set collection. */
      var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)  
      println("\nIterating through Sorted set: ")
      numbers.foreach((element:Int)=> print(element + " "))  
      println()
/* Set is not an ordered collection - we can't get element by index. */      
    }
}    
