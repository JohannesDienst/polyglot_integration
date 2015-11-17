package de.multamedio

class DefaultParam(a: Double = 2.0, b: Double) {

  def this() { this(b = 4.0) }

  def add(one: Double = 2.0, two: Double) =
    one + two

  override def toString = "a is: " + a + " b is: " + b
}