/**
   * file: problem_2_6.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_2_6 abstract data type.
   */
/**
  * problem_2_6
  * This class finds the sum of all the digits in an integer.
  */
import java.util.Scanner;
public class problem_2_6 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000");
      int number = input.nextInt();
      int lessThan10 = number % 10;
      number /= 10;
      int tens = number % 10;
      number /= 10;
      int hundreds = number % 10;
      number /= 10;
      int sum = hundreds + tens + lessThan10;
      System.out.println("The sum of the digits is " + sum);
   }
}