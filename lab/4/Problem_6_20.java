/**
   * file: Problem_6_20.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 4
   * due date: March 1, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_6_20 abstract data type.
   */
/**
  * Problem_6_20
  * This class counts the number of letters
  * in a string.
  */
import java.util.Scanner;

public class Problem_6_20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");

    String s = input.nextLine();

    System.out.print("The number of letters in the string are " 
      + countLetters(s));
  }

  public static int countLetters(String s){
    int letters = 0;
    for(int i = 0; i < s.length(); i++){
      if(Character.isLetter(s.charAt(i)))
        letters++;
    }

    return letters;
  }

}