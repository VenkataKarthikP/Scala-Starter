/**
 *
 */
package hackerrank

/**
 * @author Venkata Karthik
 *
 * Problem Statement

  For a given list with N integers, return a new list removing the elements at odd positions. 
* The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

  Input Format 
  N integers contained in the list, each on a new line.

Output Format 
*List of integers, with integers at odd positions removed (so the first element, the third element and so on will be removed). 
* The relative positions of the remaining (even-position) elements should be the same as they were in the original array. Each integer will be on a new line.
Please note, that by "odd positions" we mean the first, third, fifth position of the array need to be filtered out. 
* As per programming language conventions, these might (and they often do) correspond to indices 0, 2, 4 and so on.
*/

object FilterOddPositioninList extends App {
 
def f(arr:List[Int]):List[Int] = { 

   arr match{
       
       case first::second::remaining => second :: f(remaining)
       case first :: second => second
       case _ => List()
   }
}
println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}