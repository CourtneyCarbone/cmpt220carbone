/**
   * file: Problem_7_20.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_7_20 abstract data type.
   */
/**
  * Problem_7_20
  * This class uses the selection sort to sort an array.
  */
import java.util.Scanner;

public class Problem_7_20 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double[] values=new double[10];

    System.out.print("Enter ten numbers: ");
    for(int i=0; i<values.length; i++)
      values[i]=input.nextDouble();

    selectionSort(values);

    for(double e: values)
      System.out.print(e + " ");
    System.out.println();
  }
  public static void selectionSort(double[] list) {
    for(int i=list.length-1;i>=0;i--) {
      double currentMax=list[i];
      int currentMaxIndex=i;

      for(int j=i-1;j>=0;j--) {
        if (currentMax < list[j]) {
          currentMax=list[j];
          currentMaxIndex=j;
        }
      }
      if(currentMaxIndex!=i) {
        list[currentMaxIndex]=list[i];
        list[i]=currentMax;
      }
    }
  }
}