/**
   * file: Problem_10_17.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_10_17 abstract data type.
   */
/**
  * Problem_10_17
  * This class squares numbers.
  */
import java.math.BigDecimal;

public class Problem_10_17 {
  public static void main(String[] args) {
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal b = new BigDecimal(start);
    int count = 0;

    while(count<10) {
      BigDecimal squared = b.multiply(b);
      if(squared.compareTo(longMaxValue) > 0) {
        count++;
        System.out.println(count + ": " + b + " squared = " + squared);
      }
      b = b.add(BigDecimal.ONE);
    }
  }
}