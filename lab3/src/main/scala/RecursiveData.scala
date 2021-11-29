sealed trait List[A] 
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]


/** Напишите свои решения в виде функций. */
object RecursiveData {

  //✅ a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = list match {
    case _: Nil[Int] => true
    case _           => false
  }

  //✅ b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = list match {
    case list: Cons[Int] => list.head
    case _               => -1
  }
}

//✅ c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
  sealed trait AnotherList[A] 
  case class AnotherCons[A](head: A, tail: AnotherList[A]) extends AnotherList[A]
  case class AnotherNil[A](head: A) extends AnotherList[A]
  

  /*✅ d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */
  sealed trait MyTree[A] 
  case class MyNode[A](left: MyTree[A], right: MyTree[A]) extends MyTree[A]
  case class MyLeaf[A](leaf: A) extends MyTree[A]
  

def TestRucursiveData(): Unit = {
  println(
    "testListIntEmpty(Nil()) = "
      +
        RecursiveData.testListIntEmpty(Nil())
  );
  println(
    "testListIntEmpty(Cons(10, Cons(10, Nil()))) = "
      +
        RecursiveData.testListIntEmpty(Cons(10, Cons(10, Nil())))
  );
  println(
    "testListIntHead(Nil()) = "
      +
        RecursiveData.testListIntHead(Nil())
  );
  println(
    "testListIntHead(Cons(1010, Nil())) = "
      +
        RecursiveData.testListIntHead(Cons(1010, Nil()))
  );
  println(
    AnotherNil(10)
  );
  println(
    Nil()
  );
  println(
    MyNode(MyLeaf(2),MyLeaf(1))
  );
}
