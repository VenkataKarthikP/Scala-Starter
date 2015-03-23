package hackerrank

/*
Problem Statement

Return sum of odd elements from an list. The input and output portions will be handled automatically. 
You need to write a function with the recommended method signature.

Constraints 
The list will have 1-100 elements. Each element will be an integer X such that -100<=X<=100.

Sample Input
*/

object SumOddElementsList {

def f(arr:List[Int]):Int = arr match{
    case first :: remaining  => if(first%2 !=0) first + f(remaining) else f(remaining)
    //case first ::Nil => if(first%2 !=0) first else 0
    case _ => 0
} 
println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)))
}
