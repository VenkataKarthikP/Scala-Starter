package hackerrank

/*Problem Statement

You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.*/


object TwoStrings {

  def main(args: Array[String]): Unit = {
    
    
    val  a = "Hello"
    val b = "world"
    
    val lettersof_a = a.toSet
    val lettersof_b = b.toSet
    
    val c = lettersof_a -- lettersof_b
    val d = lettersof_a & lettersof_b
    
   if (d.size==0)  println("NO") else println("YES") 
    
  }
  
  
}