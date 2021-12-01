object Typeclasses {

  //✅ a) Определите тайп-класс Reversable, который представляет в обратном порядке значения.

  trait Reversable[T] {
    def reversable(a: T): T
  }

  def reverse[T](a: T)(implicit reversing: Reversable[T]): T = {
    reversing.reversable(a)
  }

  //✅ b) Реализуйте функцию Reverse для String.
  implicit object ReversableString extends Reversable[String] {
    override def reversable(a: String): String = a.reverse
  }

  //✅ примените тайп-класс-решение из пункта (a) здесь
  def testReversableString(str: String): String = reverse(str)

  // -------- SMASH ---------

  //✅ c) Определите тайп-класс Smash таким образом чтобы в нем была функция smash, которая выполняет операцию со значениями одного типа.

  trait Smash[T] {
    def smash(a: T, b: T): T
  }

  def smashing[T](a: T, b: T)(implicit sm: Smash[T]): T = {
    sm.smash(a, b)
  }

  //✅ d) Реализуйте  функции Smash для типа Int и Double.
  //    Используйте сложение для типа Int у умножение для типа Double.

  implicit object SmashInts extends Smash[Int]{
    override def smash(a: Int, b: Int): Int = a + b
  }

  implicit object SmashDouble extends Smash[Double]{
    override def smash(a: Double, b: Double): Double = a * b
  }

  //✅ примените тайп-класс-решение из пункта (d) здесь
  def testSmashInt(a: Int, b: Int): Int = smashing(a,b)

  //✅ примените тайп-класс-решение из пункта (d) здесь
  def testSmashDouble(a: Double, b: Double): Double = smashing(a,b)

  //✅ e) Реализуйте функцию Smash для типа String. Необходимо выполнить конкатенацию строк, которые будут получены в качестве параметра.

  implicit object SmashStrings extends Smash[String]{
    override def smash(a: String, b: String): String = a + b
  }

  // примените тайп-класс-решение из пункта (d) здесь
  def testSmashString(a: String, b: String): String = smashing(a, b)
}

// Реализуйте тестовые функции с выводом на экран проверки разработанных функций.

def TestTypeclasses(): Unit = {
  println(
    s"testReversableString(\"я строка\") = ${Typeclasses.testReversableString("я строка")}"
  )
  println(
    s"testSmashInt(3,4) = ${Typeclasses.testSmashInt(3,4)}"
  )
  println(
    s"testSmashDouble(3.14,8.25) = ${Typeclasses.testSmashDouble(3.14,8.25)}"
  )
  println(
    s"testSmashString(\"Строка 1 \",\"Строка 2\") = ${Typeclasses.testSmashString("Строка 1 ","Строка 2")}"
  )
}
