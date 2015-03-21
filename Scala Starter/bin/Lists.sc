import scala.collection.mutable.ListBuffer

object Lists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val data = List(1,2,3)                          //> data  : List[Int] = List(1, 2, 3)
  
  val data2 = List[Number](1,2,3)                 //> data2  : List[Number] = List(1, 2, 3)
  
  val data3 = List.range(1,10)                    //> data3  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  val data4 = List.fill(3)("Hello")               //> data4  : List[String] = List(Hello, Hello, Hello)
  
  val data5 = List.tabulate(5)(n => n*n)          //> data5  : List[Int] = List(0, 1, 4, 9, 16)
	
	val data6 = collection.mutable.ListBuffer(1,2,3)
                                                  //> data6  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3)
	var cityList = new ListBuffer[String]     //> cityList  : scala.collection.mutable.ListBuffer[String] = ListBuffer()
	
	cityList += "Fremont"                     //> res0: scala.collection.mutable.ListBuffer[String] = ListBuffer(Fremont)
	cityList += "Newark"                      //> res1: scala.collection.mutable.ListBuffer[String] = ListBuffer(Fremont, Newa
                                                  //| rk)
  cityList += ("NJC","OAK")                       //> res2: scala.collection.mutable.ListBuffer[String] = ListBuffer(Fremont, Newa
                                                  //| rk, NJC, OAK)
	val finalList = cityList.toList           //> finalList  : List[String] = List(Fremont, Newark, NJC, OAK)

	
	
	//Merge two lists
	
		val secondList = List(4,5,6)      //> secondList  : List[Int] = List(4, 5, 6)
		val mergeList = data ++ secondList//> mergeList  : List[Int] = List(1, 2, 3, 4, 5, 6)
		val mergeList2 = data ::: secondList
                                                  //> mergeList2  : List[Int] = List(1, 2, 3, 4, 5, 6)


		val mergeList3 = List.concat(data,secondList)
                                                  //> mergeList3  : List[Int] = List(1, 2, 3, 4, 5, 6)

		//Lazy Collection
		
		
		val streamList = 1 #:: 2 #:: 3 #:: 4  #:: Stream.Empty
                                                  //> streamList  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
		streamList.tail                   //> res3: scala.collection.immutable.Stream[Int] = Stream(2, ?)
	
		//Maps
		
		val countries = Map("US"->"USA","MEX"->"Mexico")
                                                  //> countries  : scala.collection.immutable.Map[String,String] = Map(US -> USA, 
                                                  //| MEX -> Mexico)
		
		val mutablecon = collection.mutable.Map("US" -> "USA")
                                                  //> mutablecon  : scala.collection.mutable.Map[String,String] = Map(US -> USA)

			mutablecon +=("Ind"->"India")
                                                  //> res4: Lists.mutablecon.type = Map(Ind -> India, US -> USA)

			mutablecon += ("Ind"->"Delhi")
                                                  //> res5: Lists.mutablecon.type = Map(Ind -> Delhi, US -> USA)


				val fileName = "C:\\Users\\Venkata Karthik\\WorkSpace-Scala\\Training\\Input.txt"
                                                  //> fileName  : String = C:\Users\Venkata Karthik\WorkSpace-Scala\Training\Inpu
                                                  //| t.txt
				val filesource = scala.io.Source.fromFile(fileName)
                                                  //> filesource  : scala.io.BufferedSource = non-empty iterator
        for(line <- filesource.getLines())
        	println(line)                     //> im karthik
                                                  //| i work in cloudwick
       	                                           
                                                  
                                                  
                                                  
                                                  
       
}