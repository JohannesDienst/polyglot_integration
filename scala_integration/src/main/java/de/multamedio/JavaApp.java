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
	}
}
