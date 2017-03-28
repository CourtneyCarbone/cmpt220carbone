/**
   * file: Driver_prj1.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: Project 1
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Driver_prj1 abstract data type.
   */
/**
  * Driver_prj1
  * This class displays the convolution of two vectors.
  */
import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // write code here

    //Input two numbers for array lengths
    int i = input.nextInt();
    int j = input.nextInt();

    //Input values for first array
    double[] vFirst = new double[i];
    double[] vSecond = new double[j];

    for(int n = 0; n < vFirst.length; n++) {
      vFirst[n] = input.nextDouble();
    }

    //Input values for second array
    for(int n = 0; n < vSecond.length; n++) {
      vSecond[n] = input.nextDouble();
    }

    //Call method and store it in a double type array
    double[] answer = convolveVectors(vFirst, vSecond);

    for (int count = 0; count < answer.length - 1; count++) {
      System.out.printf("%d ", new Object[] { Long.valueOf(Math.round(answer[count])) });
    }
    System.out.printf("%d\n", new Object[] { Long.valueOf(Math.round(answer[(answer.length - 1)])) });
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    //Declare new array
    double[] cResult = new double[(vFirst.length + vSecond.length) - 1];
    //write code here

    //Flips second array
    for(int i = 0; i < cResult.length; i++) {
      cResult[i] = 0.0D;
      for(int j = 0; j < vSecond.length; j++) {
        if((i - j >= 0) && (i - j < vFirst.length)) {
          cResult[i] += vFirst[(i - j)] * vSecond[j];
        }
      }
    }
    return cResult;
  }
}