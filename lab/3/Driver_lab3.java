/**
   * file: Driver_lab3.java
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
  * Driver_lab3
  * This class compute the pp-norm distance between pairs 
  * of points, for a given value of p.
  */
import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      double x1 = input.nextDouble();

      if (x1 == 0)
        break;

      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double p = input.nextDouble();

      System.out.printf("%.5f", Math.pow(Math.pow(Math.abs(x1 - x2),p) + Math.pow(Math.abs(y1 - y2),p),1 / p));
      System.out.println();
    }
    input.close();
  }
}
  
