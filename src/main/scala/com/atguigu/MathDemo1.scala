package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 14:32
 */
object MathDemo1 {
    def main(args: Array[String]): Unit = {
        val a: Any = 10
        a match {
            case b: Int =>
            case c =>
            case _ =>
            
        }
        
        val arr = Array(10, 20, 30, 40, 50)
        arr match {
            case Array(a, b, c) =>
            case Array(a, rest@_*) =>
                println("array....")
                println(rest)
        }
        
        val list1 = List(30, 50, 70)
        list1 match {
            /*case List(a, rest@_*) =>
                println(rest)*/
            /*case a :: b :: rest =>
                println(rest)*/
            // 中置运算符  前置 后置  !1     |  a toString
            case a :: b :: c :: Nil =>
                println(a)
                println(b)
                println(c)
                
        }
        
        
    }
}
