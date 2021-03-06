package jython_integration;

import org.python.core.PyException;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class Shortcutting
{

  public static void main(String []args) throws PyException
  {
    PythonInterpreter pi = new PythonInterpreter();
    pi.set("integer", new PyInteger(42));
    pi.exec("halfanswer = integer/2");
    PyInteger half = (PyInteger)pi.get("halfanswer");
    System.out.println("halfanswer: " + half.asInt());
    pi.close();

    System.out.println("---------------------------");
    PyModule module = new PyModule();
    module.triple(2); // 8
    module.triple(2.2); // 10.648000000000003
  }
}
