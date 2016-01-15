package polyglot_integration;

import groovy.lang.Closure;
import groovy_integration.ClosureUtil;
import groovy_integration.Humanoid;
import groovy_integration.Jazzer;
import groovy_integration.ListUtil;
import groovy_integration.Person;
import groovy_integration.Stack;
import groovy_integration.Thing;

public class JavaApp {

  public static void main(String[] args) {
    Person nicole = new Person("Nicole", 30);
    Person zoe = new Person("Zoe");
    Person amelie = new Person("Amelie", 1);

    nicole.increaseAge(1);
    nicole.getName(); // Nicole
    nicole.getAge(); // 31
    amelie.setName("Amy");

    Jazzer jazz = new Jazzer();
    jazz.sing();
    jazz.growl(); // returns Object

    // Generics
    Stack<Integer> stack = new Stack<>();
    stack.push(42);
    stack.top(); // Integer
    stack.pop(); // ArrayList<Integer>

    // Traits: Not working when we implement them
    SpeakingCat helloKitty = new SpeakingCat();

    // Meta-Programming
    // Runtime
    Humanoid human = new Humanoid();
    human.write(); // Method WriteName is missing!
    human.speak(); // Hello my name is Gigabit
    human.getLanguage(); // English

    // Compile time
    amelie.toString(); // groovy_integration.Person(Amelie, 1)

    // Operator overloading
    Thing thing1 = new Thing("Joe");
    Thing thing2 = new Thing("Doe");
    Thing thing3 = thing1.plus(thing2);
    thing3.getName(); // Joe Doe

    Thing thing4 = new Thing();
    thing4.getName(); // Joe

    // Call method with closure
    JavaClosureClass clc = new JavaClosureClass();
    clc.demonstrateClosureUsage();

    // Handle closure return
    Closure clojureDoubler = (Closure) new ClosureUtil().doubler();
    clojureDoubler.call(42); // 84

    // Collections
    // list
    ListUtil.giveMeList(); // java.util.List

    // set
    ListUtil.giveMeSet(); // java.util.HashSet

    // map
    ListUtil.giveMeMap(); // java.util.LinkedHashMap

    // range
    ListUtil.giveMeRange().get(2); // 3
    groovy.lang.Range range = ListUtil.giveMeRange();
  }
}
