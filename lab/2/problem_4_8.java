/**
   * file: problem_4_8.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_8 abstract data type.
   */
/**
  * problem_4_8
  * This class finds to character of an ASCII code.
  */
import java.util.Scanner;

public class problem_4_8 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int number = input.nextInt();
    System.out.print("The character for ASCII code " + number +" is "+ (char) number+" ");
  }
}