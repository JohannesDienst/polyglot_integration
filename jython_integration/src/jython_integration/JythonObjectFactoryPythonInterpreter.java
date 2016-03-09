package jython_integration;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

/**
 * Object factory implementation that is defined
 * in a generic fashion.
 *
 */
public class JythonObjectFactoryPythonInterpreter {

  /**
   * The createObject() method is responsible for the actual creation of the
   * Jython object into Java bytecode.
   */
  public Object createObject(Object interfaceType, String moduleName) {
    // Create a PythonInterpreter object and import our Jython module
    // to obtain a reference.
    PythonInterpreter interpreter = new PythonInterpreter();
    interpreter.exec("from " + moduleName + " import " + moduleName);
    PyObject pyObject = interpreter.get(moduleName);
    interpreter.close();

    Object javaInt = null;
    try {
      // Create a new object reference of the Jython module and
      // store into PyObject.
      PyObject newObj = pyObject.__call__();
      // Call __tojava__ method on the new object along with the interface name
      // to create the java bytecode
      javaInt = newObj.__tojava__(Class.forName(interfaceType.toString().substring(
        interfaceType.toString().indexOf(" ")+1,
        interfaceType.toString().length())));
    } catch (ClassNotFoundException ex) {
      // Omitted
    }

    return javaInt;
  }

}
