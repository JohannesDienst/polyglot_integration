package de.multamedio

class Tester(name: String) extends Person(name) with Reviewer {

}

object Tester {
  
  def tasksLeft(tasksTotal: Int, tasksFinished: Int) = {
    tasksTotal - tasksFinished
  }
  
}