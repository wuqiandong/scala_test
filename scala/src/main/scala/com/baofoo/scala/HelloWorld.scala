package com.baofoo.scala

object HelloWorld {
  def main(args: Array[String]): Unit = {
    /*变量声明*/
    var x = 5  //声明变量
    var z:Double = 7  //类型可省略， Scala可以推断出数据类型
    val y = 6  //声明常量
    
//    println(x * y)
//    println(max(10, 9))
    
  }
  
  /**
   * 定义一个函数
   */
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
}