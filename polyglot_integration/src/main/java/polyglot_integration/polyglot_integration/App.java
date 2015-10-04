package polyglot_integration.polyglot_integration;

import java.util.ArrayList;
import java.util.List;

import person.Person;
import clojure.java.api.Clojure;
import clojure.lang.IFn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.invokeClojureCore();
        app.invokeClojureList();
        app.invokeClojureToJava();
        app.invokeClojure();
    }

    public void invokeClojureCore() {
        IFn plus = Clojure.var("clojure.core", "+");
        Object obj = plus.invoke(1, 2);
        System.out.println(obj.getClass().toString()); // class java.lang.Long
        System.out.println(obj); // 3
    }
    
    public void invokeClojureList() {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("csv-utils.core"));
        IFn f = Clojure.var("csv-utils.core", "readcsvfrom");
        Object obj = f.invoke("/home/johannes/test1");
        System.out.println(obj.getClass().toString()); // class clojure.lang.LazySeq
        List li = (List) obj;
        System.out.println(li.get(0)); // ["Johannes" "29"]
    }

    public void invokeClojureToJava() {
      ClojureNamespace namespace = new ClojureNamespace("csv-utils.core");
      IFn f = namespace.fn("readPersonsToJava");
      List<String> filepaths = new ArrayList<String>();
      filepaths.add("/home/johannes/test1");
      filepaths.add("/home/johannes/test2");
      Object obj = f.invoke(filepaths);
      List<List>persons = (List<List>) obj;
      Person p1 = (Person) persons.get(0).get(0);
      System.out.println(p1.getName() + " " + p1.getAge());
    }

    public void invokeClojure()
    {
      IFn require = Clojure.var("clojure.core", "require");
      require.invoke(Clojure.read("clojure.java.data"));
      IFn fromJava = Clojure.var("clojure.java.data", "from-java");
      IFn f = Clojure.var("csv-utils.core", "sum-age");
      List<Person> javaPersons = new ArrayList<Person>();
      javaPersons.add(new Person("Rich", (long) 40));
      javaPersons.add(new Person("Joshua", (long) 45));
      Long sum = (Long) f.invoke(fromJava.invoke(javaPersons));
      System.out.println("Sum of age: " + sum);

      ClojureWrapper clj = new ClojureWrapper();
      System.out.println("Sum with wrapper:" + clj.sumBy(javaPersons));
    }
}
