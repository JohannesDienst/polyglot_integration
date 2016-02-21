package jython_integration;

import org.python.core.PyFloat;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class PyModule
{
  private PythonInterpreter interpreter = SharedPythonInterpreter.interpreter;
  private PyFunction py_triple;

  public PyModule()
  {
    this.interpreter.exec("from examplemodule import triple as PyModuleTriple");
    this.py_triple = (PyFunction)this.interpreter.get("PyModuleTriple");
  }

  public int triple(int value)
  {
    return py_triple.__call__(new PyInteger(value)).asInt();
  }

  public double triple(double value)
  {
    return py_triple.__call__(new PyFloat(value)).asDouble();
  }

}
