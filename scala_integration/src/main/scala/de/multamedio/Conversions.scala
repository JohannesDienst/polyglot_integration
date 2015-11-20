package de.multamedio

class Conversions {

  def javaList = {
    var list = new java.util.ArrayList[String]()
    list.add("I")
    list.add("am a list");
    list
  }
}