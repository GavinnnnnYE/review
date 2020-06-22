package com.atguigu

object Test3 {
    
    
    def main(args: Array[String]): Unit = {
        def f: Int = {
            println("aa.....")
            7
        }
        
        //        foo(3 + 4)  // 值调用:  把3+4先计算出来, 再传递.
        //        foo(f)
        
        //        foo1(3 + 4)
        /*foo1(f)
        
        foo1 {
            println("aaaa")
            10
        }
        
        foo1 {
            100
            println("aaa")
        }*/
        
        /*var x = 0
        myWhile(x < 100) {
            println(x)
            x += 1
        }*/
        
        runInThread{
            println(Thread.currentThread().getName)
        }
        runInThread{
    
            println(Thread.currentThread().getName)
        }
        
    }
    // 执行一段代码在一个子线程中
    def runInThread(op: => Unit): Unit ={
        new Thread(){
            override def run(): Unit = {
                op
            }
        }.start()
    }
    
    
    
    def myWhile(condition: => Boolean)(op: => Unit): Unit = {
        if (condition) {
            op
            myWhile(condition)(op)
        }
    }
    
    // 名调用  传递的是代码
    def foo1(a: => Unit) = {
        a // 计算 3+4
        a // 计算3+4
        a
        a
        a
    }
    
    def foo(a: Int) = {
        a
        a
        a
    }
}
