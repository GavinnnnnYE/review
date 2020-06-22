package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 14:55
 */
object PartitionDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List((10, (20, 30)), (100, (200, 300)))
        
        
        /*val list2: List[Int] = list1.map(x => x._2._2)
        println(list2)*/
        list1.map {
            case (a, (b, c)) =>
                println(c)
        }
    }
}
