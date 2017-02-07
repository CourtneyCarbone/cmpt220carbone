/**
   * file: problem_4_5.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_5 abstract data type.
   */
/**
  * problem_4_5
  * This class displays the area of a regular polygon.
  */
import java.util.Scanner;

public class problem_4_5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    int n = input.nextInt();
    System.out.print("Enter the side: ");
    double s = input.nextDouble();
    double area = (n * Math.pow(s, 2)) / 
    (4.0 * Math.tan(Math.PI / n));
    System.out.println("The area of the polygon is " + area);
  }
}