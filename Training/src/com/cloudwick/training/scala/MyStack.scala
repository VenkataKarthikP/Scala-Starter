package com.cloudwick.training.scala

class MyStack[T] {
  
  var elements : List[T] = Nil
  
  def push(x :T){ elements = x :: elements
  }
  
  def pop(){elements = elements.tail}
  def top() : T = elements.head
  
  
}