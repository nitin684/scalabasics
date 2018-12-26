object SW_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val list1 = List(1,3,4,6,8,2)                   //> list1  : List[Int] = List(1, 3, 4, 6, 8, 2)
  
  //list1.foreach(element => println(element))
  list1.foreach(println)                          //> 1
                                                  //| 3
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 2
  
  val List1: Any = List("Ram", 3, 4.00)           //> List1  : Any = List(Ram, 3, 4.0)
  println(List1)                                  //> List(Ram, 3, 4.0)
  
  val Seq1 = Seq(2,5,7)                           //> Seq1  : Seq[Int] = List(2, 5, 7)
  println(Seq1)                                   //> List(2, 5, 7)
  Seq1.foreach(println)                           //> 2
                                                  //| 5
                                                  //| 7
  
  Seq1.exists( x => x%2 == 0 )                    //> res0: Boolean = true
  //Seq1.exists( _%2 == 0 )
  
  val str1 = "Scala string example"               //> str1  : String = Scala string example
    
   (str1.split(" "))                              //> res1: Array[String] = Array(Scala, string, example)
  ("\tScala\tstring example").split("\t")         //> res2: Array[String] = Array("", Scala, string example)
  ("Scala string example").split("")              //> res3: Array[String] = Array(S, c, a, l, a, " ", s, t, r, i, n, g, " ", e, x,
                                                  //|  a, m, p, l, e)
  ("\tScala\tstring\texample").split("\t")        //> res4: Array[String] = Array("", Scala, string, example)
  ("Scala\tstring\texample").split("\t")          //> res5: Array[String] = Array(Scala, string, example)
  ("\tScala\tstring example").span( _ == "\t")    //> res6: (String, String) = ("","	Scala	string example")
  ("Scala\tstring\texample").span( _ == "\t")     //> res7: (String, String) = ("",Scala	string	example)
  ("Scala\tstring\texample").span( _ != "\t")     //> res8: (String, String) = (Scala	string	example,"")
  ("Scala string example").span( _ != "\t")       //> res9: (String, String) = (Scala string example,"")
  ("Scala string").span( _ != "\t")               //> res10: (String, String) = (Scala string,"")
  
}
