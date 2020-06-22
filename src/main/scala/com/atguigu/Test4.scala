/*
package com.atguigu

object Test4 {
    def main(args: Array[String]): Unit = {
        //        User(10)  // User.apply(10)
       // val user = new User
       // user(10)  // == user.apply(10)
        
        /*foo(10)  //=== foo.apply(10)
        (foo _).apply(10)  // 方法和函数
        
        val f = foo _*/
    }
    
    def foo(a:Int) = {
        println(a)
    }
}

object User {
    def apply(a: Int) = println(a)
}

class User {
    def apply(a:Int): Unit ={
        println(a)
    }
}
*/
