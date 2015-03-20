package com.cloudwick.training.scala

class Point(inputx : Int , inputy : Int) {

  var x = inputx
  var y = inputy
  
  def vectorAddition(newPoint : Point) {
   
    var p = new Point(x+newPoint.x,y+newPoint.y)
   
    p
  }
  
  
}


/**
 * @author Venkata Karthik
 */
object HasMain {
  
  def main(args: Array[String]): Unit = {
    
    var p = new Point(14,12)
    
    println(p.vectorAddition(p) )
  }
  
  
}
