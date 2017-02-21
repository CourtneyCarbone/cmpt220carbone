/**
   * file: problem_6_3.java
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
  * problem_6_3
  * This class reports whether the integer is a
  * palindrome integer or not.
  */
import java.util.Scanner;

public class problem_6_3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
      "a palindrome.");
  }
/** 
   * Method isPalindrome returns true if the number is a palindrome
   * A palindrome is sequence that reads the same backwards as forward
   */
  public static boolean isPalindrome(int number) {
    return number == reverse(number) ? true : false;
  }
/**
   * Method reverse runs the reversal of an integer
   */
  public static int reverse(int number) {
    String reverse = "";  
    String n = number + ""; 

    for (int i = n.length() - 1; i >= 0; i--) {
      reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse); 
  }
}

