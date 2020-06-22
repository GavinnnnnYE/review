package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 10:52
 */
object Test {
    def main(args: Array[String]): Unit = {
        foo(10)
        
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        foo(100, arr1(0), arr1(1))
        foo(100, arr1: _*)
    
        val arr: Array[Int] = map(arr1, x => x * x)
        println(arr.toList)
        
        
    }
    
    def foo(one: Int, others: Int*) = {
    
    }
    
    def map(arr: Array[Int], op: Int => Int): Array[Int] ={
        // for 推导
        for (elem <- arr) yield op(elem)
    }
}
