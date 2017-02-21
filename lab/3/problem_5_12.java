/**
   * file: problem_5_12.java
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
  * problem_5_12
  * This class finds the smallest n such that n^2>12,000. 
  */

public class problem_5_12{
    public static void main(String[] args){
        int n = 1;
        while(n*n <= 12000)
        {
            n += 1;
        }

        System.out.printf("%d^2 is the smallest integer greater than 12,000", n);
    }
}