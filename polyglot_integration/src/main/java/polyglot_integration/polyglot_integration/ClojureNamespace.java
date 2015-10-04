package polyglot_integration.polyglot_integration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

/**
 * Wraps a clojure namespace.
 * 
 * @author johannes
 *
 */
public class ClojureNamespace {

  public final static String CLOJURE_CORE = "clojure.core";
  protected final static IFn REQUIRE = Clojure.var(CLOJURE_CORE, "require");
  public final static ClojureNamespace core = new ClojureNamespace(CLOJURE_CORE);

  private final Map<String, IFn> cachedFns = Collections.synchronizedMap(new HashMap<String, IFn>());
  protected final String namespace; 

  /**
   * Saves namespace name and
   * requires it.
   * 
   * @param namespace
   */
  public ClojureNamespace (String namespace) {
    this.namespace = namespace;
    REQUIRE.invoke(Clojure.read(namespace));
  }

  /**
   * Load a clojure function.
   * 
   * @param symbolName String
   * @return Clojure function-object IFn
   */
  public IFn fn(String symbolName) {
    IFn f = cachedFns.get(symbolName);
    if (f == null) {
      f = Clojure.var(namespace, symbolName);
      cachedFns.put(symbolName, f);
    }
    return f;
  }

}
