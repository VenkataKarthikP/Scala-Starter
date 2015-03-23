package hackerrank

/*
Reverse a list without using reverse function. 
The input and output portions will be handled automatically. 
You need to write a function with the recommended method signature.

Input and Output Format 
Each element of the list is displayed on a new line. 
The output list is the reverse of the input list.
*/

object ReverseList {

def f(arr:List[Int]):List[Int] = arr match {
    
    case first :: remaining => f(remaining) ::: List(first)
    case first  => first

}

println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}
