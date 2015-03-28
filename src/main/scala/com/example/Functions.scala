package com.example

object Functions {

  def circleArea(r: Double) = math.Pi*r*r

  @annotation.tailrec
  def fives(n: Int,max: Int):Unit =
  {
    if(n<=max)
      {
        println(n)
        fives(n+5,max)
      }
  }

  def diff2DPts(x: (Int,Int),y: (Int,Int)): (Int,Int) =
    (x._1-y._1,x._2-y._2)

  def tupleWithStrRep[A,B,C](x: (A,B,C)) =
    (x._1,x._1.toString,x._2,x._2.toString,x._3,x._3.toString)


}
