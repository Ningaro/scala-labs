import scala.util.{Try, Failure, Success}

/** Реализуйте следующие функции.
  *
  * List(1, 2) match { case head :: tail => ??? case Nil => ??? case l => ??? }
  *
  * Option(1) match { case Some(a) => ??? case None => ??? }
  *
  * Either.cond(true, 1, "right") match { case Left(i) => ??? case Right(s) =>
  * ??? }
  *
  * Try(impureExpression()) match { case Success(a) => ??? case Failure(error)
  * => ??? }
  *
  * Try(impureExpression()).toEither
  */
object Adts {

  //✅ a) Дан List[Int], верните элемент с индексом n

  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testGetNth(list: List[Int], n: Int): Option[Int] = Try {
    Some(list(n))
  } match {
    case Success(x)   => x
    case Failure(err) => None
  }

  //✅ b) Напишите функцию, увеличивающую число в два раза.

  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testDouble(n: Option[Int]): Option[Int] = n match {
    case Some(x) => Some(x * 2)
    case None    => None
  }

  //✅ c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").

  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testIsEven(n: Int): Either[String, Int] = if (n % 2 != 0)
    Left("Нечетное число.")
  else
    Right(n)

  //✅ d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").

  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testSafeDivide(a: Int, b: Int): Either[String, Int] = if (b == 0)
    Left("Вы не можете делить на ноль.")
  else
    Right(a / b)

  //✅ e) Обработайте исключения функции с побочным эффектом вернув 0.

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = Try{
    impure(str)
  } match {
    case Success(x) => Success(x)
    case Failure(err) => Failure(new IllegalArgumentException("Your cat found some errors on his road =( ")
  )
  }

}

def TestAdts(): Unit = {
  val testingList = List(8, 2, 5, 1)
  println(
    "testingList = "
      +
        testingList
  )
  println(
    "testGetNth(List(8,2,5,1),5) = "
      +
        Adts.testGetNth(testingList, 5)
  )
  println(
    "testGetNth(List(8,2,5,1),2) = "
      +
        Adts.testGetNth(testingList, 2)
  )
  println(
    "testDouble(Some(10)) = "
      +
        Adts.testDouble(Some(10))
  )
  println(
    "testDouble(None) = "
      +
        Adts.testDouble(None)
  )
  println(
    "testIsEven(10) = "
      +
        Adts.testIsEven(10)
  )
  println(
    "testIsEven(7) = "
      +
        Adts.testIsEven(7)
  )
  println(
    "testSafeDivide(10,0) = "
    +
    Adts.testSafeDivide(10,0)
  )
  println(
    "testSafeDivide(15,5) = "
    +
    Adts.testSafeDivide(15,5)
  )
  println(
    "testGoodOldJava((s: String) => s.length, \"Привет, как дела?\") = "
    +
    Adts.testGoodOldJava((s: String) => s.length, "Привет, как дела?")
  )
  println(
    "testGoodOldJava((s: String) => s.take(9999).toInt, \"Дела плохи == ^o^ ==\") = "
    +
    Adts.testGoodOldJava((s: String) => s.take(9999).toInt, "Дела плохи == ^o^ ==")
  )
}
