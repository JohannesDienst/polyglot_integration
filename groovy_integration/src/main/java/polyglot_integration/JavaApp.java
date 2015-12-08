package polyglot_integration;

import groovy_integration.Jazzer;
import groovy_integration.Person;

public class JavaApp {

  public static void main(String[] args) {
    Person nicole = new Person("Nicole", 30);

    // Not working
    nicole.increaseAge(1);
    System.out.println(nicole.getName() + " " + nicole.getAge());

    Jazzer jazz = new Jazzer();
    jazz.sing();

    // Traits + Generics
  }
}
