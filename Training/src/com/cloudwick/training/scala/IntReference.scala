package com.cloudwick.training.scala

object IntReference extends App{

  val obj = new Reference[Int]
  
  obj.set(3)
  print(obj.get)
  
  }