/**
   * file: problem_2_1.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_2_1 abstract data type.
   */
/** 
  * problem_2_1
  * This class converts Celsius to Farhenheit.
  */
import java.util.Scanner;
public class problem_2_1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a degree in Celsius: ");
      double celsius = input.nextDouble();
      double farhenheit = 9.0/5 * celsius + 32;
      System.out.println(celsius + " Celsius is " + farhenheit + " Farhenheit ");
   }
}