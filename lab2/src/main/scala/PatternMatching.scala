/** Напишите решение в виде функции.
  *
  * Синтаксис: val a: Int = ???
  *
  * a match { case 0 => true case _ => false }
  */
object PatternMatching {

  sealed trait Hand
  case object Rock extends Hand
  case object Paper extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat extends Food
  case object Vegetables extends Food
  case object Plants extends Food

  sealed trait Animal {

    val name: String
    val food: Food
  }
  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Fish(name: String, food: Food) extends Animal
  case class Bird(name: String, food: Food) extends Animal

  /* ✅ a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = value match {
    case 1 => "it is one"
    case 2 => "it is two"
    case 3 => "it is three"
    case _ => "what's that"
  }

  /* ✅ b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max"
   *     "moritz" или "Moritz"
   */

  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = {
    val s = value.toLowerCase()
    if (s == "max" || s == "moritz")
      true
    else
      false
  }

  // ✅ c) Напишите функцию проверки является ли `value` четным

  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = value % 2 == 0

  /* ✅ d) Напишите функцию, моделирующую игру в Камень ножницы бумага
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */

  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = {
    if (a == b)
      Draw
    else if (
      (a == Rock && b == Scissor) || (a == Scissor && b == Paper) || (a == Paper && b == Rock)
    )
      Win
    else
      Lose
  }

  // Примечание: используйте определение Animals

  // ✅ e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = animal match {
    case Mammal(name, food, weight) => weight
    case _                          => -1
  }

  // ✅ f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.

  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = animal match {
    case Fish(name, food) => Fish(name, Plants)
    case Bird(name, food) => Bird(name, Plants)
    case _                => animal
  }

// Включить для тестирования PatternMatching
  def PatternMatchingTestData(): Unit = {
    println("Testing PatternMatching!\n");

    println(s"testIntToString(1) = ${testIntToString(1)}");
    println(s"testIntToString(2) = ${testIntToString(2)}");
    println(s"testIntToString(5) = ${testIntToString(5)}\n");

    println(
      s"testIsMaxAndMoritz(\"moritz\") = ${testIsMaxAndMoritz("moritz")}"
    );
    println(s"testIsMaxAndMoritz(\"max\") = ${testIsMaxAndMoritz("max")}");
    println(s"testIsMaxAndMoritz(\"text\") = ${testIsMaxAndMoritz("text")}\n");

    println(s"testIsEven(1) = ${testIsEven(1)}");
    println(s"testIsEven(2) = ${testIsEven(2)}");
    println(s"testIsEven(3) = ${testIsEven(3)}\n");

    println(s"testWinsA(Paper, Rock) = ${testWinsA(Paper, Rock)}");
    println(s"testWinsA(Paper, Paper) = ${testWinsA(Paper, Paper)}");
    println(s"testWinsA(Paper, Scissor) = ${testWinsA(Paper, Scissor)}\n");

    println(
      s"testExtractMammalWeight(new Fish('Gold fish', Plants)) = ${testExtractMammalWeight(new Fish("Gold fish", Plants))}"
    );
    println(
      s"testExtractMammalWeight(new Mammal('Super mega mammal', Plants, 125)) = ${testExtractMammalWeight(new Mammal("Super mega mammal", Plants, 125))}"
    );
    println(
      s"testExtractMammalWeight(new Bird('Chik', Plants)) = ${testExtractMammalWeight(new Bird("Chik", Plants))}\n"
    );

    println(
      s"testUpdateFood(new Fish('Angry fish', Meat)) = ${testUpdateFood(new Fish("Angry fish", Meat))}"
    );
    println(
      s"testUpdateFood(new Bird('Super angry bird', Meat)) = ${testUpdateFood(new Bird("Super angry bird", Meat))}"
    );
    println(
      s"testUpdateFood(new Mammal('Very old mammal', Meat, 169)) = ${testUpdateFood(new Mammal("Very old mammal", Meat, 169))}"
    );
  }
}
