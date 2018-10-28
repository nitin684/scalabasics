object StringsWS {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  "Hello, World!".getClass.getName                //> res0: String = java.lang.String
  val c = "Hello World"                           //> c  : String = Hello World
  for(e <- c) println(e)                          //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
                                                  //|  
                                                  //| W
                                                  //| o
                                                  //| r
                                                  //| l
                                                  //| d
  /* Alternate way:
  c.foreach(println) */
  c.getBytes.foreach(println)                     //> 72
                                                  //| 101
                                                  //| 108
                                                  //| 108
                                                  //| 111
                                                  //| 32
                                                  //| 87
                                                  //| 111
                                                  //| 114
                                                  //| 108
                                                  //| 100
  c.filter(_ != 'l')                              //> res1: String = Heo Word
  println(c)                                      //> Hello World
  val s = "Hello Scala"                           //> s  : String = Hello Scala
  s.drop(2)                                       //> res2: String = llo Scala
  s.take(2)                                       //> res3: String = He
  s.drop(2).take(2)                               //> res4: String = ll
  s.drop(2).take(2).capitalize                    //> res5: String = Ll
  s.head                                          //> res6: Char = H
  s.tail                                          //> res7: String = ello Scala
  val s1 = "Hello"                                //> s1  : String = Hello
  val s2 = "H" + "ello"                           //> s2  : String = Hello
  val s3 = "HELLO"                                //> s3  : String = HELLO
  s1 == s2                                        //> res8: Boolean = true
  s2 == s3                                        //> res9: Boolean = false
  s1 == s3                                        //> res10: Boolean = false
  s1.toUpperCase == s3                            //> res11: Boolean = true
  s1.equalsIgnoreCase(s3)                         //> res12: Boolean = true
  s3.toLowerCase == s1.toLowerCase                //> res13: Boolean = true
  val m = """MultiLine
  String
  Example"""                                      //> m  : String = MultiLine
                                                  //|   String
                                                  //|   Example
  """MultiLine
  |String
  |Example""".stripMargin                         //> res14: String = MultiLine
                                                  //| String
                                                  //| Example
  """MultiLine
  $String""".stripMargin('$')                     //> res15: String = MultiLine
                                                  //| String
  """MultiLine
  |String
  |Example""".stripMargin.replaceAll("\n"," ")    //> res16: String = MultiLine String Example
  "hello world".split(" ").foreach(println)       //> hello
                                                  //| world
  val sp = "eggs, milk, butter, Coco Puffs"       //> sp  : String = eggs, milk, butter, Coco Puffs
  sp.split(",")                                   //> res17: Array[String] = Array(eggs, " milk", " butter", " Coco Puffs")
  sp.split(",").map(_.trim)                       //> res18: Array[String] = Array(eggs, milk, butter, Coco Puffs)
  sp.split("\\s+") /* Splitting with space */     //> res19: Array[String] = Array(eggs,, milk,, butter,, Coco, Puffs)
  /* Substituting Variables in string using string interpolator s,f & raw*/
  val name = "Nitin"                              //> name  : String = Nitin
  val age = 25                                    //> age  : Int = 25
  val weight = 74                                 //> weight  : Int = 74
  println(s"Name: $name Age: $age Weight: $weight ")
                                                  //> Name: Nitin Age: 25 Weight: 74 
  println(s"Name: $name \t Age is 25: ${age == 25} \n Weight: $weight ")
                                                  //> Name: Nitin 	 Age is 25: true 
                                                  //|  Weight: 74 
  println(f"$name is $age years old, and weighs $weight%.2f kgs.")
                                                  //> Nitin is 25 years old, and weighs 74.00 kgs.
  println(raw"Name: $name \t Age: $age \n Weight: $weight ")
                                                  //> Name: Nitin \t Age: 25 \n Weight: 74 
  
  
}