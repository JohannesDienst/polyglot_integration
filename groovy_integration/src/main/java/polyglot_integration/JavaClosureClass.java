package polyglot_integration;

import groovy_integration.ClosureOperation;

import java.util.Arrays;

import org.codehaus.groovy.runtime.MethodClosure;

public class JavaClosureClass
{

  private ClosureOperation groovy = new ClosureOperation();

  private void shouldBeUsedAsClosure(Object o) {
      System.out.println(o);
  }

  public void demonstrateClosureUsage() {
    MethodClosure cl = new MethodClosure(this, "shouldBeUsedAsClosure");
    groovy.op(Arrays.asList("This", "is", "closure!"), cl);
}

}
