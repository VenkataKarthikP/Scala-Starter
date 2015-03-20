package com.cloudwick.training.scala

object MyStackTest  extends App {
  
    var stackObj = new MyStack[Int]
    stackObj.push(23)
    stackObj.push('r')
    println(stackObj.top())
    println(stackObj.elements)
 
}