object Sheet4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

trait Friend{
	
	val name:String
	def command = println( name + "Please come here")

}


class Person (val name : String) extends Friend

	val obj = new Person("John")              //> obj  : Sheet4.Person = Sheet4$$anonfun$main$1$Person$1@37a7481f
	obj.command                               //> JohnPlease come here


def seel(Friend:Friend) = Friend.command          //> seel: (Friend: Sheet4.Friend)Unit
 
//seel(obj)



//class GeneralUser(val name: String) extends Person(name)





}