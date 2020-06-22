package com.atguigu

object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        val arr2: Array[Int] = arr1 :+ 100 // arr1.:+(100)
        println(arr2.mkString(", "))
        val arr3: Array[Int] = 200 +: arr2 // arr2.+:(200)
        
        println(arr3.mkString(", "))
        
        // :: :::
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(200 :: 100 :: (list1 :+ 10000))
        println(10::20::300::Nil)
        
    }
}

/*
运算符的结合性:
    左结合
        3 + 4
    右结合
        赋值运算都是右结合
        以冒号结尾的运算符都是右结合

 */
