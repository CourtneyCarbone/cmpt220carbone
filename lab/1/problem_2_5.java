/**
   * file: problem_2_5.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_2_5 abstract data type.
   */
/**
  * problem_2_5
  * This class calculates tips.
  */
import java.util.Scanner;
public class problem_2_5 {
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the subtotal and a gratuity rate: "); 
     double subtotal = input.nextDouble();
     double gratuity = input.nextDouble();
     double tip = subtotal * (gratuity / 100);
     double total = subtotal + gratuity;
     System.out.println("The gratuity is $" + tip + 
     " and total is $" + total);
   }

}