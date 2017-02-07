/**
   * file: problem_3_11.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_3_11 abstract data type.
   */
/**
  * problem_3_11
  * This class finds the number of days in a month. 
  */
import java.util.Scanner;

public class problem_3_11 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the month as an integer");
    int month = input.nextInt();
    System.out.print("Enter the year as an integer");
    int year = input.nextInt();

    boolean leapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);

    switch(month){
      case 1: System.out.print("January "+ year+ " had 31 days "); break;
      case 2: System.out.print("February "+ year+ " had " + ((leapYear) ? "29 days" : "28 days")); break;
      case 3: System.out.print("March "+ year+ " had 31 days "); break;
      case 4: System.out.print("April "+ year+ " had 30 days "); break;
      case 5: System.out.print("May "+ year+ " had 31 days "); break;
      case 6: System.out.print("June "+ year+ " had 30 days "); break;
      case 7: System.out.print("July "+ year+ " had 31 days "); break;
      case 8: System.out.print("August "+ year+ " had 31 days "); break;
      case 9: System.out.print("September "+ year+ " had 30 days "); break;
      case 10: System.out.print("October "+ year+ " had 31 days "); break;
      case 11: System.out.print("November "+ year+ " had 30 days "); break;
      case 12: System.out.print("December "+ year+ " had 31 days ");
    }
  }
}