package hackerrank

/*Fibonocci*/

object Fibonocci {
    
     def fib(x:Int):Int  = x match {
   case 1 | 2 => x-1
   case _ => fib( x-1 ) + fib( x-2 )
}
      

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fib(readInt()))

    }
}
