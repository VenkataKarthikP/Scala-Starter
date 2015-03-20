object FunctionalProgramming {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	class User(var age:Int,var city:String){
	
	def cal(myAge:Int) : Int= {
	
	age = age + myAge
	age
	
	}
	
	def this(age : Int)={
	
	this(age,"Temp")
	
	
	}
	
	}
	
	var obj = new User(24,"karthik")          //> obj  : FunctionalProgramming.User = FunctionalProgramming$$anonfun$main$1$Us
                                                  //| er$1@7b41ce14
	
	var obj2 = new User(25)                   //> obj2  : FunctionalProgramming.User = FunctionalProgramming$$anonfun$main$1$U
                                                  //| ser$1@1d40c244
  println(obj2.cal(3))                            //> 28
  
  obj2.city = "hyderabad"
	
 	println(obj.cal(24))                      //> 48
	
	
	class User2{
	
	def turn(direction : String) = {
	
	println("Turning : "+ direction)
	
	}
	
	
	}
	
	object User2{
		
		def apply() = new User2
	
	
	}
	
	
	
	var obj4 = User2                          //> obj4  : FunctionalProgramming.User2.type = FunctionalProgramming$$anonfun$ma
                                                  //| in$1$User2$3$@5eab5809
	
	
	var obj3 = new User2                      //> obj3  : FunctionalProgramming.User2 = FunctionalProgramming$$anonfun$main$1$
                                                  //| User2$2@40568a8
								
	obj3.turn("right")                        //> Turning : right
	
	obj3 turn "left"                          //> Turning : left


def data(age : Int){

println(age)

}                                                 //> data: (age: Int)Unit


data(77)                                          //> 77




	//Find greatest common divisor
	
	
	var x= 36                                 //> x  : Int = 36
	var y= 99                                 //> y  : Int = 99
	
	while(x != 0)
	{
		var temp = x
		x = y % x
		y = temp
		
	}

println("GCD is " + y)                            //> GCD is 9


// For loop

for( i <- 1 to 4 ) println("Hello")               //> Hello
                                                  //| Hello
                                                  //| Hello
                                                  //| Hello

//Max numbers

def max(x:Int, y:Int)={

		if(x>y)
			println("max is "+x)
		else
			println("max is "+y)
		
}                                                 //> max: (x: Int, y: Int)Unit


max(34,587532)                                    //> max is 587532


// GCD with recursion


def GCD(x : Int , y : Int): Int = {
	if(x == 0)
		  y
 	else
 		  GCD(y%x,x)


}                                                 //> GCD: (x: Int, y: Int)Int



println(GCD(96,45))                               //> 3


class Point(inputx : Int , inputy : Int) {

  var x = inputx
  var y = inputy
  
  def vectorAddition(newPoint : Point) : Point =  {
   
    var p = new Point(x+newPoint.x,y+newPoint.y)
   
    p
  }
  
  
}

var p = new Point(14,12)                          //> p  : FunctionalProgramming.Point = FunctionalProgramming$$anonfun$main$1$Po
                                                  //| int$1@55d48209


var q:Point = p.vectorAddition(p)                 //> q  : FunctionalProgramming.Point = FunctionalProgramming$$anonfun$main$1$Po
                                                  //| int$1@72a548e4

println(q.x)                                      //> 28




}
   