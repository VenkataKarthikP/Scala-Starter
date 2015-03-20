package com.cloudwick.training.scala

object factorial extends App {
        
    def factorial(n : Int) :Int = {
      
      if(n ==1)
          1
      else
          (n*factorial(n-1))
      
    }
  
  println(factorial(5))
}