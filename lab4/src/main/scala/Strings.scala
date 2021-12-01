

/** Напишите ваши решения в тестовых функциях.
  * 
  * https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html
  */
object Strings {

  /*✅ a) Преобразуйте все символы типа Char в верхний регистр (не используйте заглавные буквы).
   *    
   */
  def testUppercase(str: String): String = str.toUpperCase

  /*✅ b) Вставьте следующие значения в строку:
   *       Hi my name is <name> and I am <age> years old.
   *    
   */
  def testInterpolations(name: String, age: Int): String = s"Hi my name is $name and I am $age years old."

  /*✅ c) Добавьте два числа в следующую строку:
   *       Hi,
   *       now follows a quite hard calculation. We try to add:
   *         a := <value of a>
   *         b := <value of b>
   * 
   *         result is <a + b>
   * 
   *   
   */
  def testComputation(a: Int, b: Int): String = s"Hi,now follows a quite hard calculation. We try to add:\na := $a\nb := $b\nresult is ${a + b}"

  /*✅ d) Если длина строки равна 2, верните всю строку, иначе верните первые два символа строки.
   */
  def testTakeTwo(str: String): String = str.substring(0, 2)
}

def TestStrings(): Unit = {
  println(
    "testUppercase(\"верхний регистор тест\") = "
    +
    Strings.testUppercase("верхний регистор тест")
  )
  println(
    "testUppercase(\"кот\") = "
    +
    Strings.testUppercase("кот")
  )
  println(
    "testInterpolations(\"Dmitry\", 21) = "
    +
    Strings.testInterpolations("Dmitry", 21)
  )
  println(
    "testInterpolations(\"Adam\", 43) = "
    +
    Strings.testInterpolations("Adam", 43)
  )
  println(
    "testComputation(1,2) = "
    +
    Strings.testComputation(1,2)
  )
  println(
    "testComputation(93837,21495) = "
    +
    Strings.testComputation(93837,21495)
  )
  println(
    s"testTakeTwo(\"gg\") = ${Strings.testTakeTwo("gg")}"
  )
  println("wp")
}
