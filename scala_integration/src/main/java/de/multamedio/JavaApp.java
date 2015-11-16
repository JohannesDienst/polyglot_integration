package de.multamedio;

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
    dParam = new DefaultParam(5.0, 7.0);
    dParam.toString(); // a is: 5.0 b is: 7.0

    dParam.add(2.0, 3.0); // 5.0
    
  }
}
