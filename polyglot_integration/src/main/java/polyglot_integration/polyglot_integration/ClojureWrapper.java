package polyglot_integration.polyglot_integration;

import java.util.List;
import person.Person;

public class ClojureWrapper extends ClojureNamespace {

  private static ClojureNamespace data = new ClojureNamespace("clojure.java.data");

  public ClojureWrapper() {
    super("csv-utils.core");
  }

  public Long sumAge (List<Person> persons) {
    return (Long) fn("sum-age").invoke(
        data.fn("from-java").invoke(persons));
  }

}
