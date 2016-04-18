package com.baofoo.scala

import scala.io.Source

object collection {
  def main(args: Array[String]): Unit = {
    /**
     * Lists:Scala的Lists对象是不可修改的
     */
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println (oneTwo + " and " + threeFour + " were not mutated.")
    println ("Thus, " + oneTwoThreeFour + " is a new list")
    
    val one = 5 :: 6 :: 7 :: Nil
    val two = Nil.::(5).::(6).::(7)
    println(one)
    println(two)
    println(one.reverse)
    
    
    /**
     * Tuples: 和List不同的Tuples可以包含不同类型的数据，而List只能包含同类型的数据。元组的索引从1开始
     */
    val pair = (99, "lucas")
    println(pair._1)
    println(pair._2)
    
    
    /**
     * Set:分两个包定义Mutable（可变）和Immutable（不可变）
     * 缺省情况Set为Immutable Set，如果你需要使用可修改的集合类（Set类型），你可以使用全路径来指明Set，比如 scala.collection.mutalbe.Set 。
     */
    var jetSet = Set ("Boeing","Airbus")
    jetSet +="Lear"
    println(jetSet)
    println(jetSet.contains("Lear"))
    
    
    /**
     * Map:	Scala也提供了Mutable和Immutable 两种Map 类型
     */
    val romanNumeral = Map ( 1 -> "I" , 2 -> "II",3 -> "III", 4 -> "IV", 5 -> "V")
    println (romanNumeral(4))
    
    
    for (line <- Source.fromFile("G:/集群搭建/scala2.10.4/scala安装.txt").getLines()) {
      println(line.length + " " + line)
    }
    
    Source.fromFile("G:/集群搭建/scala2.10.4/scala安装.txt").getLines().foreach (line => println(line.length + " " + line))
    
  }
}