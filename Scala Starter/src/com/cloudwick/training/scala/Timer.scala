package com.cloudwick.training.scala

object Timer {
  def everySecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies() {
    println("time flies ...")
  }
  def main(args: Array[String]) {
    everySecond(timeFlies)
  }

  


}