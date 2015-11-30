package de.multamedio

import scala.collection.JavaConversions._
import scala.collection.mutable._
import scala.collection.JavaConverters._

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

    val sum1 = JConversions.sum(seqAsJavaList(Seq(1, 2, 3)))
    val sum2 = JConversions.sum(bufferAsJavaList(ArrayBuffer(1,2,3)))
    val sum3 = JConversions.sum(bufferAsJavaList(ListBuffer(1,2,3)))

    val aList = Seq(1, 2, 3)
    aList.asJavaCollection // Collection[Int]

    val aSet = ArrayBuffer(1,2,3)
    aSet.asJava // List[Int]

    val aMap = Map(1 -> 2)
    aMap.asJava // Map[Int, Int]
    aMap.asJavaDictionary // Dictionary[Int, Int]
  }
}