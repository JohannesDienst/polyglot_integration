package polyglot_integration;

import groovy.lang.Closure;
import groovy_integration.ClosureUtil;
import groovy_integration.Humanoid;
import groovy_integration.Jazzer;
import groovy_integration.ListUtil;
import groovy_integration.Person;
import groovy_integration.Stack;
import groovy_integration.Thing;

import java.util.Map;

public class JavaApp {

  public static void main(String[] args) {
    Person nicole = new Person("Nicole", 30);
    Person zoe = new Person("Zoe");
    Person amelie = new Person("Amelie", 1);

    nicole.increaseAge(1);
    System.out.println(nicole.getName() + " " + nicole.getAge());

    Jazzer jazz = new Jazzer();
    jazz.sing();

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

    // Compile time
    amelie.toString(); // groovy_integration.Person(Amelie, 1)

    // Operator overloading
    Thing thing1 = new Thing("Joe");
    Thing thing2 = new Thing("Doe");
    Thing thing3 = thing1.plus(thing2);
    System.out.println(thing3.getName()); // Joe Doe

    // Call method with closure
    JavaClosureClass clc = new JavaClosureClass();
    clc.demonstrateClosureUsage();

    // Handle closure return
    // TODO: This is not working
//    MethodClosure mc = new MethodClosure(new ClosureUtil(), "doubler");
//    new ClosureUtil().op(Arrays.asList("This", "is", "closure!"), mc);
//    System.out.println(((MethodClosure)ClosureUtil.doubler()).call(42));
    
    Object doubler = new ClosureUtil().doubler();
    Closure clojureDoubler = (Closure) doubler;
    System.out.println(clojureDoubler.call(42));
    clojureDoubler.call(42);

    // Collections
    // lists
    ListUtil.giveMeList(); // java.util.List

    // sets
    ListUtil.giveMeSet(); // java.util.HashSet

    // maps
    ListUtil.giveMeMap();
    Map aMap = ListUtil.giveMeMap(); // java.util.LinkedHashMap
    System.out.println(aMap.getClass().getName());

    // ranges
    ListUtil.giveMeRange().get(2); // 3
    groovy.lang.Range range = ListUtil.giveMeRange();
  }
}
