package de.multamedio

object ScalaApp {
  def main(args: Array[String]): Unit = {
    val tester = new Tester("Nicole")
    
    tester.greet()
    tester.reviewCode()
    println(Tester.tasksLeft(10, 5))
  }
}