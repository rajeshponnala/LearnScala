package com.example

sealed trait Stream[+A]
case object Empty extends Stream[Nothing]
case class Cons[+A](h: ()=> A,t: () => Stream[A]) extends Stream[A]

object Stream {

  def cons[A](hd: => A,t1: => Stream[A]) = {

    lazy val head = hd
    lazy val tail = t1
    Cons(() => head,() => tail)
  }

  def empty[A]: Stream[A] = Empty

  def apply[A](as: A*): Stream[A] =
    if(as.isEmpty) empty else cons(as.head,apply(as.tail: _*))

  def toList[A]: List[A] =  {
     def loop(s: Stream[A],acc: List[A]): List[A] = s match {
      case Cons(h,t) =>  loop(t(),h() :: acc)
      case _ => acc
     }
    loop(this,List()).reverse
  }
}
