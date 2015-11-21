package de.multamedio;


import scala.Tuple2;


public class JavaApp {

  public static void main(String[] args) {
    HappyReviewer happyReviewer = new HappyReviewer("Zoe");
    happyReviewer.greet();
    happyReviewer.reviewCode();

    FriendlyTester friendlyTester = new FriendlyTester("Amelie");
    friendlyTester.greet();
    friendlyTester.reviewCode();
    System.out.println("I have " + Tester.tasksLeft(42, 21) + " tasks left");

    Coder javaCoder = new Coder();
    // javaCoder.codingLanguage();

    Coder scalaCoder = new Coder();
    scalaCoder.codingLanguage("Scala");

    Number numberOne = new Number(1.5);
    Number numberTwo = new Number(2.7);
    System.out.println("+ is $plus: " + numberOne.$plus(numberTwo));

    DefaultParam dParam = new DefaultParam();
    dParam.toString(); // a is: 2.0 b is: 4.0

    // dParam = new DefaultParam(4.0) // Not defined constructor
    dParam = new DefaultParam(5.0, 7.0);
    dParam.toString(); // a is: 5.0 b is: 7.0
    dParam.add(2.0, 3.0); // 5.0

    Stack<Integer> stack = new Stack<>();
    stack.push(27);
    // stack.push("28"); // Does not work

    Kitty kitty = new Kitty();
    kitty.getName();
    kitty.setName("Happy Kitty");
    kitty.name_$eq("Teddy");

    Monkey monk = new Monkey();
    monk.name();
    // setName() missing
    monk.name_$eq("Abby");

    Tuple2<String, String> creator = new Tuple2<>("Martin", "Odersky");
    System.out.println(creator._1 + " " + creator._2);

  }

}
