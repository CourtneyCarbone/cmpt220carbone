/**
   * file: Problem_9_13.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_9_13 abstract data type.
   */
/**
  * Problem_9_13
  * This class locates a max value and its location in a two 
  * dimensional array
  */
import java.util.Scanner;
public class Problem_9_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    System.out.println("Enter the array: ");
    for(int i = 0; i < m.length; i++) {
      for(int j = 0; j < m[i].length; j++) {
        m[i][j] = input.nextDouble();
      }
    }
    Location max = locateLargest(m);

    System.out.println("The location of the largest element is " + 
      max.maxValue + "at (" + max.row + ", " + max.column +")");
  }
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
}