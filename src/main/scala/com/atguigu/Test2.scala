package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 10:52
 */
object Test2 {
    implicit val aa = 100
    
    def main(args: Array[String]): Unit = {
//        println(foo(10)(200))
    
//        println(foo(10))  // 使用隐式
        println(foo(10)())
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        
    }
    
    def foo(a: Int)(implicit b: Int = 300) = a + b
    
    
}
