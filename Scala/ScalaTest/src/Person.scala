class Person {
  implicit def fromPsersonToStudent(p : Person) = p.asInstanceOf[Student]
}

object Person {
  implicit def fromPsersonToStudent(p : Person) = p.asInstanceOf[Student]

}
class Student extends Person{
}
