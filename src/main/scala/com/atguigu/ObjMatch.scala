package com.atguigu

object ObjMatch {
    def main(args: Array[String]): Unit = {
        /*// 对象匹配
        val d = -9.0
        d match {
            case Sqrt(r) =>
                println(r)
        }*/
    
        val user = new User("zs", 10)
        user match {
            case User(n, a) =>
                println(n)
                println(a)
        }
        
        
    }
}
/*object User{
    def unapply(user: User) = if(user == null) None else Some((user.name, user.age))
}*/

case class User(val name: String, val age: Int)



object Sqrt {
    def unapply(n: Double): Option[Double] = if (n >= 0) Some(math.sqrt(n)) else None
}