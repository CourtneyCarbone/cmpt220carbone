/**
   * file: problem_6_2.java
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
  * problem_6_2
  * This class computes the sum of the digits
  * in an integer.
  */
import java.util.Scanner;

public class problem_6_2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    long num = input.nextLong();

    System.out.print("The sum of the digits is " + sumDigits(num));
  }
/** 
   * Method sumDigits calculates the sum of the digits in an integer
   */

  public static int sumDigits(long n){
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    
    return sum;
  }
}