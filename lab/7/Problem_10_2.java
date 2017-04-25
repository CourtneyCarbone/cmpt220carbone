/**
   * file: Problem_10_2.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_10_2 abstract data type.
   */
/**
  * Problem_10_2
  * This class constructs a BMI with the specified
  * name, age, weight, feet, and inches.
  */
public class Problem_10_2 {
  public static void main(String[] args) {
    BMI b = new BMI("Joe", 22, 180, 5, 9);
    System.out.printf("Name %s Age %d Weight %.2f feet: %.2f inches: %.2f\n",
      b.getName(), b.getAge(), b.getWeight(), b.getFeet(), b.getInches());
  }
}