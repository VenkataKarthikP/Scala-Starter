package com.cloudwick.training.scala

object FunctionCalc{
      def f(Input: Int => Int) : Int ={
        val temp = 10
        
        (Input(5) + temp )
      }
      
      def f(Input:Int) :Int ={
        Input + 4
        
      }
      def g(arg : Int) :Int= {
        arg+1
      }
    
      def h(arg:Int) : Int ={
        arg+3
    } 
      def main(args: Array[String]) {
       println( f(g(2)))
       println(f(h(4)))
       println(f(6))
      }
    }