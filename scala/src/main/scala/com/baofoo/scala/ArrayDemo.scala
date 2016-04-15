package com.baofoo.scala

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    /**
     * Scala不支持　＋＋i,i++ 运算符，因此需要使用i＋＝1 来加一
     * Scala访问数组的语法是使用()而非[]
     */
   /* var i = 0
    while (i < 10) {
      println(i)
      i += 1
    }*/
    
    /**
     * foreach实现迭代
     */
    var arr1 = new Array[String](3)  //声明一个数组
    arr1(0) = "a";arr1(1) = "b";arr1(2) = "c"
    
    arr1.foreach(ar => println(ar)) 
   /* 如果一个函数只有一个参数并且只包含一个表达式，
          那么你无需明确指明参数。因此上面的代码可以写成：*/
    arr1.foreach(println)
    
    var arr2 = Array("d", "e", "f")
    for (arg <- arr2) 
      println(arg)
    
      
    /*其中的for表达式中使用到 0 to 2 ,这个表达式演示了Scala的一个基本规则，
          如果一个方法只有一个参数，你可以不用括号和. 来调用这个方法。因此这里的 0 to 2, 
          其实为（0）.to(2) 调用的为整数类型的 to方法，to方法使用一个参数。
          
    Scala中所有的基本数据类型也是对象（和Java不同），因此0 可以有方法（实际上调用的是RichInt的方法），
          这种只有一个参数的方法可以使用操作符的写法（不用.和括号），实际上Scala中表达式 1+2 ,最终解释为(1).+(2) 
    +也是Int的一个方法，和Java不同的是，Scala对方法的名称没有太多的限制，你可以使用符合作为方法的名称。*/
    for (i <- 0 to 2)
      println(arr2(i))
      
    for (i <- (0) .to (2))
      println(arr2(i))
  }
}