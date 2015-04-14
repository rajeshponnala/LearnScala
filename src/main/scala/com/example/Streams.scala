package com.example


object Streams {

  def if2[A](cond: Boolean,onTrue: => A,onFalse: => A): A =
    if(cond) onTrue else onFalse

  def maybeTwice(b: Boolean, i: => Int) = {
    lazy  val y = i
    if(b) y + y  else 0
  }


}
