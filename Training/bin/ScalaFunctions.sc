object ScalaFunctions {
  println("Welcome to the Scala worksheet")
  
  
 	//Strict Function - Takes a particular input and returns a particular output
 	
 	def square( x: Double) : Double = x*x;
 	
 	//Non Strict
 	def ns[A](cond : Boolean, onTrue : => A , onFalse : => A):A =
 		if(cond) onTrue else onFalse
 	



ns(true,println("fail"),3)
ns(false,sys.error("fail"),println("adfs"))


def pair(i : => Int) = (i,i)

pair{println("hello");1+42}
def pair2(i : => Int) ={lazy val j = i;(j,j)}

pair2{println("hello");1+42}
//Trait

trait Friend{
	
	val name:String
	def command = println( name + "Please come here")

}

class Person (val name : String) extends Friend

	val obj = new Person("John")
	obj.command



class User(val name : String)

class Admin(@Override val name : String) extends User(name) with Friend


val obj1 = new Admin("John")
obj1.command

}