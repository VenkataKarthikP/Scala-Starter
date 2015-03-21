/**
 *
 */
package com.cloudwick.training.scala

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

/**
 * @author Venkata Karthik
 *
 */
class Reader1(fileName:String) {
  
  val in = new BufferedReader(new FileReader(fileName))
  
  @throws(classOf[IOException])
  def read() = in.read() 
  
  
  
}