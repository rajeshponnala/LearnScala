package com.example

object Hello {
  def main(args: Array[String]): Unit = {

    println(Functions.circleArea(20))
    println(Functions.fives(5,50))
    println(Functions.diff2DPts((3,5),(1,7)))
    println(Functions.tupleWithStrRep(true,22.5,"yes"))
  }
}
