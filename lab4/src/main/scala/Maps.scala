import scala.language.postfixOps
import Maps.User

/** Напишите вашу реализацию в тестовые функции.
  *
  * https://docs.scala-lang.org/overviews/collections/maps.html
  */
object Maps {

  case class User(name: String, age: Int)

  /*✅ a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testGroupUsers(users: Seq[User]): Map[String, Int] = users.groupBy(_.name).map(row => (row._1, row._2(0).age)) + ("averageAge" -> users.map(_.age).sum / users.length)

  /*✅ b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей, содержащихся в Map, содержат подстроку "Adam"?
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testNumberFrodos(map: Map[String, User]): Int = map.count(row => row._1.contains("Adam"))

  /*✅ c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testUnderaged(map: Map[String, User]): Map[String, User] = map.flatMap((name, us) => if (us.age < 35) None else Some((name, us)))
}

def TestMaps(): Unit = {
  val testUsers =
    Seq(
    Maps.User("Ivan", 13), 
    Maps.User("Dmitry", 20), 
    Maps.User("Alena", 19)
    )
  println(
    "testUsers = "
      +
        testUsers
  )
  println(
    "testGroupUsers(testUsers) = "
    +
    Maps.testGroupUsers(testUsers)
  )
  val testUsers2 = {
    Map(
    ("Dmitry", Maps.User("Dmitry", 20)),
    ("Ivan", Maps.User("Ivan", 13)),
    ("Alena", Maps.User("Ivan", 13))
    )
  }
  println(
    "testUsers2 = "
    +
    testUsers2
  )
  println(
    "testNumberFrodos(testUsers2) = "
    +
    Maps.testNumberFrodos(testUsers2)
  )
  val testUsers3 = {
    Map(
    ("Dmitry", Maps.User("Dmitry", 20)),
    ("Mr.Adam", Maps.User("Mr.Adam", 42)),
    ("Adam", Maps.User("Adam", 17))
    )
  }
  println(
    "testUsers3 = "
    +
    testUsers3
  )
  println(
    "testNumberFrodos(testUsers3) = "
    +
    Maps.testNumberFrodos(testUsers3)
  )
  println(
    "testUnderaged(testUsers2) = "
    +
    Maps.testUnderaged(testUsers2)
  )
  println(
    "testUnderaged(testUsers3) = "
    +
    Maps.testUnderaged(testUsers3)
  )
}
