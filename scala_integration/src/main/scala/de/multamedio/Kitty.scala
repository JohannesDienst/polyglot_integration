package de.multamedio

import scala.beans.BeanProperty

class Kitty {

  @BeanProperty
  var name = "Hello Kitty"

}

object Kitty {

  // return int for Java
  def theMeaningOfLife(): Int = {
    42
  }

  // returns Object for Java
  def thePurposeOfLife(): Any = {
    42
  }

}