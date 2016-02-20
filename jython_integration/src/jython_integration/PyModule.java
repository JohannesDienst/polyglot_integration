package jython_integration;

import org.python.core.PyFloat;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class PyModule {
    private PythonInterpreter interpreter = SharedPythonInterpreter.interpreter;
    private PyFunction py_square;

    public PyModule() {
        this.interpreter.exec("from pymodule import square as PyModuleSquare");
        this.py_square = (PyFunction)this.interpreter.get("PyModuleSquare");
    }

    public int square(int val) {
        return py_square.__call__(new PyInteger(val)).asInt();
    }

    public double square(double val) {
        return py_square.__call__(new PyFloat(val)).asDouble();
    }

}
