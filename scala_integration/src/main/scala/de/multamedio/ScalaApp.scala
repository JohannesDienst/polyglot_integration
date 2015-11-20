package de.multamedio

import scala.collection.JavaConversions.asScalaBuffer

object ScalaApp {

  def main(args: Array[String]): Unit = {
    val tester = new Tester("Nicole")

    tester.greet()
    tester.reviewCode()
    println(Tester.tasksLeft(10, 5))

    val conversions = new Conversions();
    val list = conversions.javaList // java.util.ArrayList
    // list.foreach(println): // Does not compile
    val buffer = asScalaBuffer(list)
    buffer.foreach(println)
    list.foreach(println) // now works because of JavaConversions
  }
}