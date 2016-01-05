package polyglot_integration;

import java.util.List;

import groovy_integration.Humanoid;
import groovy_integration.Jazzer;
import groovy_integration.Person;
import groovy_integration.Stack;

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
    
    // Closures
    
    // Collections
    // lists
    
    // sets
    
    // maps
    
    // ranges
  }
}
