/**
   * file: Problem_7_9.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 4
   * due date: March 1, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_7_9 abstract data type.
   */
/**
  * Problem_7_9
  * This class finds the smallest element.
  */
import java.util.Scanner;

public class Problem_7_9{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] value = new double[10];
    System.out.print("Enter ten numbers: ");

    for(int i = 0; i < value.length; i++){
      value[i] = input.nextDouble();
    }
    System.out.printf("The minimum number is: %2f", min(value));
  }
  public static double min(double[] array){
    double min = array[0];
    for(double value : array) {
      if (value < min)
        min = value;
    }
    return min;
  }
}