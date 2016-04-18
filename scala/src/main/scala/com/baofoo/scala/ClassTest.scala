package com.baofoo.scala

class ClassTest (n:Int, d:Int) {
  require(d != 0)
  override def toString = n + "/" +d
}