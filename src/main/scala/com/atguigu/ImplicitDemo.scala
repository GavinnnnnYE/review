import java.time.LocalDate

object ImplicitDemo{
    
    def main(args: Array[String]): Unit = {
        // 1.days(ago)
        val ago = "ago"
        val later = "later"
        val r1 =  10 days ago
        val r2 =  2 days later
        
        println(r1)  // 2020-06-20
        println(r2)  // 2020-06-20
        
        val arr1 = Array[Int](30, 50, 70, 60, 10, 20)
        arr1.sortBy(x => x)(Ordering.Int.reverse)
    }
    
    implicit class RichInt(day: Int){
        def days(when: String): String ={
            when match {
                case "ago" =>
                    LocalDate.now().plusDays(-day).toString
                case "later" =>
                    LocalDate.now().plusDays(day).toString
                case _ =>
                    ""
            }
        }
    }
}