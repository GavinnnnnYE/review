package com.atguigu

/**
 * Author atguigu
 * Date 2020/6/21 15:04
 */

case class Person(age: Int, name: String)

object GenericDemo {
    implicit val ord: Ordering[Person] = new Ordering[Person]{
        override def compare(x: Person, y: Person): Int = x.age - y.age
    }
    
    def main(args: Array[String]): Unit = {
        /*println(foo1[Int](10, 20))
        println(foo2[Int](10, 20))*/
    
        println(foo2(Person(100, "zs"), Person(20, "lisi")))
    }
    
    def foo1[K](n1: K, n2: K)(implicit ord: Ordering[K]) = {
        println("foo[K]....")
        ord.max(n1, n2)
    }
    
    
    def foo2[K: Ordering](n1: K, n2: K) = {
        println("foo[K: ordering]")
        // 从冥界召唤那个隐式值
        val ord: Ordering[K] = implicitly[Ordering[K]]
        ord.max(n1, n2)
    }
}

/*
泛型上下文:
    [K: Ordering]
     表示必须存在隐式值: Ordering[K]
     其实是对隐式隐式参数的一个简写

 */
