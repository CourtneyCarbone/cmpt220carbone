/**
   * file: problem_4_25.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_25 abstract data type.
   */
/**
  * problem_4_25
  * This class generates a vehicle plate number 
  * displaying three uppercase letters followed by
  * 4 digits.
  */

public class problem_4_25 {
  public static void main(String[] args) {
    StringBuilder plate = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      char ch = (char)(Math.random() * 26 + 'A');
      plate.append(ch);
    }
    for (int i = 0; i < 4; i++) {
      char digit1 = (char)(Math.random() * 10 + '0');
      plate.append(digit1);
    }
    System.out.print("Random vehicle plate number: " + plate + " ");
  }
}