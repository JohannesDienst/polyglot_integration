package jython_integration;

import org.python.util.PythonInterpreter;

public final class SharedPythonInterpreter {
  public static final PythonInterpreter interpreter = new PythonInterpreter();
}
