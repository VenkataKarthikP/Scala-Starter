object CollectionsSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

//Imperative Style
def total(list : List[Int]) = {

var sum =0
for(i <- list)
	sum +=i

sum
}                                                 //> total: (list: List[Int])Int

total(List(1,2,3,4,5))                            //> res0: Int = 15


//Functional Style

def total2(list : List[Int]) = list.foldLeft(0){_+_}
                                                  //> total2: (list: List[Int])Int


total2(List(1,2,3,4,5))                           //> res1: Int = 15


def totalSum(list : List[Int]) = {

	var sum = 0
	list.foreach(sum+=_)
	sum
}                                                 //> totalSum: (list: List[Int])Int

totalSum(List(1,2,3,4,5))                         //> res2: Int = 15


def totalEven(list : List[Int]) = {
	var sum = 0
	list.foreach{e => if(e %2 == 0) sum+=e}
	sum
}                                                 //> totalEven: (list: List[Int])Int

totalEven(List(1,2,3,4,5))                        //> res3: Int = 6


def totalFunc(list : List[Int] ,selected : Int => Boolean) = {

	var sum = 0
	
	list.foreach{  e => if(selected(e) ) sum +=e}

	sum
}                                                 //> totalFunc: (list: List[Int], selected: Int => Boolean)Int


totalFunc(List(1,2,3,4,5),{e => true})            //> res4: Int = 15

totalFunc(List(1,2,3,4,5),{ _ > 3})               //> res5: Int = 9

var sum = List(1,2,3,4,5) map(_+10) filter(_%2 == 0) map(_*3)
                                                  //> sum  : List[Int] = List(36, 42)

}