object Problems99 {

//Unit test
  def main(args : Array[String]) = {
    print(last(Nil).getOrElse(null))

  }
  /*
  #1. Find the last element of a list.
  Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
  */
  def last[T](li : List[T]):Option[T] = li match {
    case x::Nil => Some(x)
    case x::xs => last(xs)
    case _ => None
  }




}
