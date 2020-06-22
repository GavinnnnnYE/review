package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 15:32
 */
object Return1 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 5, 70, 60, 10, 20)
        
        arr1.foreach(x => {
            try {
                if (x < 30) return
                println(x)
            }catch {
                case _ =>
            }
        })
    }
}
