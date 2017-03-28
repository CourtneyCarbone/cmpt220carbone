/**
   * file: Problem_8_13.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_8_13 abstract data type.
   */
/**
  * Problem_8_13
  * This class locates largest element.
  */
import java.util.Scanner;

public class Problem_8_13 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.print("Enter the number of rows and columns of the array: ");
    int r=input.nextInt();
    int c=input.nextInt();

    double[][] array=new double[r][c];

    System.out.print("Enter the array: ");
    for(int i=0; i<r; i++) {
      for(int j=0; j<c; j++) {
        array[i][j]=input.nextDouble();
      }
    }
    int[] locate=locateLargest(array);

    System.out.print("The location of the largest element is at (" 
      + locate[0] + ", " + locate[1] + ")");
  }
  public static int[] locateLargest(double[][] a) {
    int[] locate=new int[] {0,0};
    double largest = a[0][0];
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a[i].length; j++) {
        if(a[i][j]>largest) {
          locate[0]=i;
          locate[1]=j;
          largest=a[i][j];
        }
      }
    }
    return locate;
  }
}