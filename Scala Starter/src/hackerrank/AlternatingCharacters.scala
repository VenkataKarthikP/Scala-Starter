package hackerrank
import scala.io.StdIn

/*Problem Statement

Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.*/



object AlternatingCharacters {

  
  def verifyAlernating(s:String) : Int = {
            (s.size - s.replaceAll("A+", "A").replaceAll("B+", "B").size);
  }
  
  def main(args: Array[String]): Unit = {
    
    for(i <- 0 until StdIn.readInt())
    println(verifyAlernating(StdIn.readLine()))

  }
  
}