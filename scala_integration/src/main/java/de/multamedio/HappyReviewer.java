package de.multamedio;

public class HappyReviewer extends Person implements Reviewer {

  public HappyReviewer(String name) {
    super(name);
  }
  
  public void reviewCode() {
    Reviewer$class.reviewCode(this);
  }

}