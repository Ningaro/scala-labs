/** Напишите отдельные функции, решающие поставленную задачу. 
  * 
  * Синтаксис:
  *   // метод
  *   def myFunction(param0: Int, param1: String): Double = // тело
  * 
  *   // значение
  *   val myFunction: (Int, String) => Double (param0, param1) => // тело
  */
object Functions {

  /* ✅ a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = r*r * Math.PI
  

  /* ✅ b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */

  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double)(b: Double): Double = a * b

  // ✅ c) Напишите не карированную функцию для расчета площади прямоугольника.

  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = a * b

  def FunctionsTestData(): Unit = {
      println(s"testCircle(2) = ${testCircle(2)}")
      println(s"testRectangleCurried(1) = ${testRectangleCurried(1)}")
      println(s"testRectangleCurried(1)(2) = ${testRectangleCurried(1)(2)}")
      println(s"testRectangleUc(3,4) = ${testRectangleUc(3,4)}")
  }
}