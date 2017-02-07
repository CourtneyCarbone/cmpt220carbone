/**
   * file: problem_3_4.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_3_4 abstract data type.
   */
/**
  * problem_3_4
  * This class randomly generates an integer
  * between 1 and 12 and displays the month that
  * goes with the number.
  */

public class problem_3_4 {
  public static void main(String[] args){
    int month = (int)((Math.random()*12) + 1);

    if (month == 1) {
      System.out.print("January");
    }
    else if (month == 2) {
      System.out.print("February");
    }
    else if (month == 3) {
      System.out.print("March");
    }
    else if (month == 4){
      System.out.print("April");
    }
    else if (month == 5){
      System.out.print("May");
    }
    else if (month == 6) {
      System.out.print("June");
    }
    else if (month == 7) {
      System.out.print("July");
    }
    else if (month == 8) {
      System.out.print("August");
    }
    else if (month == 9) {
      System.out.print("September");
    }
    else if (month == 10) {
      System.out.print("October");
    }
    else if (month == 11) {
      System.out.print("November");
    }
    else if (month == 12) {
      System.out.print("December");
    }

    }

  }
