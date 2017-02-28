/**
   * file: Problem_7_18.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 4
   * due date: March 1, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_7_18 abstract data type.
   */
/**
  * Problem_7_18
  * This class uses bubble-sort algorithm.
  */
import java.util.Scanner;

public class Problem_7_18{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double [] numbers = new double[10];
    System.out.print("Enter ten numbers");
    for(int i = 0; i < numbers.length; i++){
      numbers [i] = input.nextDouble();
    }
    bubbleSort(numbers);
    for (double e : numbers){
      System.out.print(e + " ");
    }
    System.out.println();
  }
  public static void bubbleSort(double[] numbers){
    boolean swap;
    do {
      swap = false;
      for (int i = 0; i < numbers.length-1; i++){
        if(numbers[i] > numbers [i+1]){
          double temp = numbers[i];
          numbers[i] = numbers [i+1];
          numbers [i+1] = temp;
          swap = true;
        }
      }
    } while (swap);
  }
}