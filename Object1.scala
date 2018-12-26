package scala_package_1

case class MatchData(
  id_1: Int,
  id_2: Int,
  cmp_fname_c1: Option[Double],
  cmp_fname_c2: Option[Double],
  cmp_lname_c1: Option[Double],
  cmp_lname_c2: Option[Double],
  cmp_sex: Option[Int],
  cmp_bd: Option[Int],
  cmp_bm: Option[Int],
  cmp_by: Option[Int],
  cmp_plz: Option[Int],
  is_match: Boolean
)

object Object1 {
  def main (args: Array[String]) {
    println(args(0))
    println("Hello Code!!")
    //args.foreach(println)
    
    println(class1(4).var1)
    
    val c1: Option[Int] = Some(5)
    val c2: Option[Int] = Some(6)
    val c3: Option[Int] = Some(7)
    val s1: Option[Double] = Some(4.40)
    
    val md1 = MatchData(37231,65468,Some(0.89),Some(0.56),Some(0.7812),Some(0.28),Some(1),Some(1)
        ,Some(1),Some(1),Some(0),true)
    
    println(scoreMatchData(md1)) 
    
  }
  
  case class Score(value: Double) {
    def +(oi: Option[Int]) = {
      Score(value + oi.getOrElse(0)) 
    }    
  }
  
   def scoreMatchData(md: MatchData): Double = {
    (Score(md.cmp_lname_c1.getOrElse(0.0)).+(md.cmp_plz).+
        (md.cmp_by).+(md.cmp_bd).+(md.cmp_bm)).value
  }
   
  case class class1(var1 : Int)
  
}

