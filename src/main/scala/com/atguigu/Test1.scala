package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 10:52
 */
object Test1 {
    def main(args: Array[String]): Unit = {
       
        val list1 = List(30, 50, 70, 60, 10, 20)
        list1.map(x => x * 10)
        
        list1.map(_ * 10)
        
//        list1.foreach(x => println(x + 10))
        
        list1.foreach(println)
        list1.foreach(println(_))
        list1.foreach(println(_))
        
        
        // 部分应用函数
    
        /*val f: Double => Double = math.pow(_, 2)
        println(f(10))
        println(f(20))
        */
        val f: Any => Unit = println(_)
        f(10)
    }
    
    
}
