/**
 *
 */
package hackerrank
import scala.io.StdIn
/**
 * @author Venkata Karthik
 *
 */

/*Problem Statement

Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that S is a child of both a and b. 

A string x is said to be a child of a string y, if x can be formed by deleting 0 or more characters from y. 

For example, ‘‘abcd" and ‘‘abdc" has two child with maximum length 3, ‘‘abc" and ‘‘abd". Note that we will not consider ‘‘abcd" as a common child because ′c′ doesn't occur before ′d′ in second string.

Input format

Two strings a and b with a newline separating them

Constraints

All characters are upper-cased and lie between ASCII values 65-90. The maximum length of the strings a and b is 5000.

Output format

Length of the string S
*/


object LongestCommonSubseq {

  
  def lcs(a:String, b:String) : Int ={
    if(a.size ==0 || b.size ==0) return 0;
    else if(a == b) return a.size;
    else
    {
      //Dynamic Programming
      var lengths = Array.ofDim[Int](a.size+1,b.size+1)
      
      for (i <- 0 until a.size)
          for (j <- 0 until b.size)
            if (a(i) == b(j))
              lengths(i+1)(j+1) = lengths(i)(j) + 1
            else
              lengths(i+1)(j+1) = scala.math.max(lengths(i+1)(j),lengths(i)(j+1))
            
      return lengths(a.size)(b.size)
      
    }
  }
  
  
  def main(args: Array[String]): Unit = {
    
    println(lcs(StdIn.readLine(),StdIn.readLine()))
    
    
  }
}