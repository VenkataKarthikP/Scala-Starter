import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach
import sun.org.mozilla.javascript.internal.ast.Yield


object ScalaString {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //String Equality
  
  val s1 = "Fremont"                              //> s1  : String = Fremont
  val s2 = "fremont"                              //> s2  : String = fremont
  
  s1.toUpperCase() == s2.toUpperCase()            //> res0: Boolean = true
  
  
  val s4 = """ I liev
  				in buffalo"""     //> s4  : String = " I liev
                                                  //|   				in buffalo"
  
  //Splitting String
  
  "I live in Buffalo".split(" ").foreach(println) //> I
                                                  //| live
                                                  //| in
                                                  //| Buffalo

	"I, live, in, Buffalo".split(",").map(_.trim()).foreach(println)
                                                  //> I
                                                  //| live
                                                  //| in
                                                  //| Buffalo

	
	//Substituting variables and strings
	
	//s will be treated as a string substitution.
	
	println(s"I live in $s1")                 //> I live in Fremont
	
	val age = 24;                             //> age  : Int = 24
	
	println(s"age+4 is ${age +4}")            //> age+4 is 28

	val data = "fremont , newark".map( _.toUpper)
                                                  //> data  : String = FREMONT , NEWARK

	val data2 = "fremont , newark".filter(_ != 'e').map( _.toUpper)
                                                  //> data2  : String = FRMONT , NWARK
                                                  
  val data4 = for(c <- "fremont") yield println(c.toUpper)
                                                  //> F
                                                  //| R
                                                  //| E
                                                  //| M
                                                  //| O
                                                  //| N
                                                  //| T
                                                  //| data4  : scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), ()
                                                  //| , (), (), ())


def toLower(c : Char) : Char =  (c + 32).toChar   //> toLower: (c: Char)Char
	
"FREMONT".map(toLower)                            //> res1: String = fremont


//Regex in Scala

var regPattern = "[0-9]+".r                       //> regPattern  : scala.util.matching.Regex = [0-9]+

val address = "123 SanFrancisco CA 94538"         //> address  : String = 123 SanFrancisco CA 94538

val  match2 = regPattern.findFirstIn(address)     //> match2  : Option[String] = Some(123)

val match3 = regPattern.findAllIn(address).foreach(println)
                                                  //> 123
                                                  //| 94538
                                                  //| match3  : Unit = ()

val match4  = regPattern.findAllIn(address).toArray
                                                  //> match4  : Array[String] = Array(123, 94538)


val match5 = regPattern.findFirstIn("abcd").getOrElse("Sorry No Match")
                                                  //> match5  : String = Sorry No Match

//Replace patterns in a String



val add3 = "123 SFO CA 94536".replaceAll("[0-9]", "*")
                                                  //> add3  : String = *** SFO CA *****

val regPattern2 = "([0-9]+)([\\sA-Za-z]+)".r      //> regPattern2  : scala.util.matching.Regex = ([0-9]+)([\sA-Za-z]+)

val regPattern2(data5,city) = "100 Fremont"       //> data5  : String = 100
                                                  //| city  : String = " Fremont"

//Accessing a character

"fremont".charAt(0)                               //> res2: Char = f

"fremont" (0)                                     //> res3: Char = f


//Add your methods to string class

implicit class StringImprovements(val s : String){
	
		def increment = s.map {_+32 toChar }


}

val result = "ABC".increment                      //> result  : String = abc

def decode(num : Int){
	
	num match {
	
		case 1 => println("one")
		case 2 => println("two")
		case _ => println("No Match")
	
	}

}                                                 //> decode: (num: Int)Unit

val result1 = decode(12)                          //> No Match
                                                  //| result1  : Unit = ()


def decode2(num : Int){

println(num match{

		case 1 => "One"
		case 2 => "two"
		case _ => "No Match"
})

}                                                 //> decode2: (num: Int)Unit

val result2 = decode2(2)                          //> two
                                                  //| result2  : Unit = ()
}