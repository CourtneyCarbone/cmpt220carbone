/**
   * file: problem_5_13.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * final_grade abstract data type.
   */
/**
  * problem_5_13
  * This class finds the largest n such that
  * n^3 is less than 12,000.
  */

public class problem_5_13{
  public static void main(String[] args){
    int n = 1;
    while(Math.pow(n,3) < 12000){
      n++;
    }
    n--;

    System.out.printf(n +"^3 is the largest integer less than 12,000");
  }
}