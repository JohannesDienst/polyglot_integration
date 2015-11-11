package de.multamedio

object ScalaApp {
  def main(args: Array[String]): Unit = {
    val coder = new Coder("Zoe")
    val cleanCoder = new CleanCoder("Amelie")
    val tester = new Tester("Nicole")
    
    coder.greet()
    coder.coding()
    cleanCoder.greet()
    cleanCoder.coding()
    cleanCoder.reviewCode()
    
    tester.greet()
    tester.reviewCode()
  }
}