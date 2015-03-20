package com.cloudwick.training.scala

object FactorialNew extends App{

  
  def fact(n:Int) :Int = {
    
    
    def data(n:Int, acc:Int):Int ={
      
      if(n<=0) 
        acc
      else
        data(n-1,n*acc)
      
      
    }
    
    data(n,1)
  }
  
  println(fact(5))
}