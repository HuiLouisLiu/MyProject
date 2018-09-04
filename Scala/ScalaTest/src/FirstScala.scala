object HuiTest {
  //Test recursive

  def sort(x: List[Int]): List[Int] = {
    if (x.isEmpty || x.size == 1) x
    else insert(x.head, sort(x.tail))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty || xs.head >= x) x :: xs
    else xs.head :: insert(x, xs.tail)
  }

  def someFunc (student : Student)= {

  }


  def main(args: Array[String]) = {

    val alist = (1,2,3,4)::(1,2)::(3,4)::(5,6)::Nil
    //alist foreach {case (x1, x2) => println(x1)}
    val fun : (Int, Int) => Unit = {case (x1,x2) => println(x1)}
    fun(1,2)
  }
}


class Team[+T](val members:List[T]){
  def addMember[U>:T](newMember: U)= new Team[U](newMember::members)
}

class Parking[A](val a: A)

class Vehicle

class Car extends Vehicle

class Jeep extends Car

class Vegetable


abstract class Time{
  var min: Int
  var hour: Int
}

class ConcreteTime(){
  var min : Int = 0
  var hour: Int = 0
}


