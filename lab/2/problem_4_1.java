/**
   * file: problem_4_1.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_1 abstract data type.
   */
/**
  * problem_4_1
  * This class calculate the area of pentagon.
  */
import java.util.Scanner;

public class problem_4_1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length from the center to a vertex: ");
    double radius = input.nextDouble();
    double s = 2 * radius * Math.sin(Math.PI / 5);
    double area = (5 * s * s)/(4 * Math.tan(Math.PI / 5));
    System.out.printf("The area of the pentagon is %.2f", area );
  }
}