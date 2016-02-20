package jython_integration;

import org.python.core.PyException;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class Shortcutting {

  public static void main(String []args) throws PyException {
    PythonInterpreter pi = new PythonInterpreter();
    pi.set("integer", new PyInteger(42));
    pi.exec("square = integer*integer");
    PyInteger square = (PyInteger)pi.get("square");
    System.out.println("square: " + square.asInt());

    System.out.println("---------------------------");
    PyModule module = new PyModule();
    System.out.println(module.square(2));
    System.out.println(module.square(2.2));
  }
}
