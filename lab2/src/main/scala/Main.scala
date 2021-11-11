import scala.io.StdIn.readLine

// Включить для тестирования PatternMatching
//import PatternMatching.*
// Включить для тестирования Classes
//import Classes.*

@main
def Main(): Unit = {
  // Включить для тестирования PatternMatching
  //PatternMatchingTestData()
  // Включить для тестирования Classes
  //ClassesTestData()
}

/*
// Включить для тестирования Classes
def ClassesTestData(): Unit = {
  println(s"Is cat eats meat? ${new Animal("cat", "mammol", Meat()).eats("meat")}")
  println(s"Is dog known animal? ${Animal.knownAnimal("dog")}")
  println(s"Whats happend then you apply carrot: ${Food.apply("carrot")}")
  println(s"Whats happend then you apply goldfish: ${Animal.apply("goldfish")}")
}
*/

/*
// Включить для тестирования PatternMatching
def PatternMatchingTestData(): Unit = {
  println("Testing PatternMatching!\n");

  println(s"testIntToString(1) = ${testIntToString(1)}");
  println(s"testIntToString(2) = ${testIntToString(2)}");
  println(s"testIntToString(5) = ${testIntToString(5)}\n");

  println(s"testIsMaxAndMoritz(\"moritz\") = ${testIsMaxAndMoritz("moritz")}");
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
*/