/**
   * file: problem_4_15.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_15 abstract data type.
   */
/**
  * problem_4_15
  * This class displays the corresponding number to a letter 
  * on the phone pad.
  */
import java.util.Scanner;

public class problem_4_15 {
  private static final int INVALID_KEY = -1;
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    int numberPressed = correspondingNumber(ch);

    if (numberPressed != INVALID_KEY){
      System.out.println("The corresponding number is " + numberPressed);
    }
    else {
      System.out.println(ch + " is an invalid input");
    }
}
public static int correspondingNumber(char ch) {
  ch = Character.toUpperCase(ch);
  if (ch >= 'A' && ch <= 'O') {
    int number = 2;
    int n = ch - 'A';
    number += (n / 3);
    return number;
  }
  if (ch >= 'P' && ch <= 'S') return 7;
  if (ch >= 'T' && ch <= 'V') return 8;
  if (ch >= 'W' && ch <= 'Z') return 9;

  return INVALID_KEY;
 }
}