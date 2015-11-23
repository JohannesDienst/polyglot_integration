package de.multamedio;

import java.util.List;

public class JConversions {

  public static int sum(List<Integer> list) {
      int sum = 0;
      for (int i: list) { sum = sum + i; }
      return sum;
  }

}
