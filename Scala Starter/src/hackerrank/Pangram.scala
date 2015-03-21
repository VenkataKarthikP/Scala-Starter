/**
 *
 */
package hackerrank

import scala.io.StdIn

/**
 * @author Venkata Karthik
 *
 */
object Pangram {
  
  
  /*Problem Statement

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly because it is a pangram. ( pangrams are sentences constructed by using every letter of the alphabet at least once. )

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format

Input consists of a line containing s.

Constraints 
Length of s can be atmost 103 (1≤|s|≤103) and it may contain spaces, lowercase and uppercase letters. Lowercase and uppercase instances of a letter are considered same.

Output Format

Output a line containing pangram if s is a pangram, otherwise output not pangram.*/
  
def main(args: Array[String]){
  
  
  
if(isPangram(StdIn.readLine()))
  println("pangram")
else
  println("not pangram")
}


def isPangram(sentence:String) : Boolean = {

return sentence.toLowerCase.filter(c => c >= 'a' && c <='z').toSet.size == 26

}

}
