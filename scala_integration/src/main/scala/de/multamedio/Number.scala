package de.multamedio

class Number(val value: Double) {

  def +(that: Number) =
    new Number(this.value + (2 * that.value))

  override def toString = "".concat(this.value.toString())

}