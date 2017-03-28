/**
   * file: Convolution.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: Project 1
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Convolution abstract data type.
   */
/**
  * Convolution
  * This class displays the convolution of two vectors.
  */
import java.util.Scanner;
import java.util.Arrays;

public class Convolution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Input two numbers for array lengths
    int vFirstLength = input.nextInt();
    int vSecondLength = input.nextInt();

    //Input values for first array
    double[] vFirst = new double[vFirstLength];
    for(int i = 0; i < vFirst.length; i++) {
      vFirst[i] = input.nextDouble();
    }

    //Input values for second array
    double[] vSecond = new double[vSecondLength];
    for(int i = 0; i < vSecond.length; i++) {
      vSecond[i] = input.nextDouble();
    }

    //Call method and store it in a double type array
    double[] answer = convolveVectors(vFirst, vSecond);

    //Create new array to cast answer as an int
    int[] convolution = new int[answer.length];
    for(int i = 0; i < answer.length; i++) {
      convolution[i] = (int)Math.round(answer[i]);
    }

    //Display answers as int values
    for(int e: convolution) {
      System.out.print(e + " ");
    }

    //Gives spacing as it displays
    System.out.println();
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    //Declare new array
    double[] cResult = new double[(vFirst.length + vSecond.length) - 1];

    //Flips second array
    for(int i = 0; i < cResult.length / 2; i++) {
      double temp = cResult[i];
      cResult[i] = cResult[cResult.length - i - 1];
      cResult[cResult.length - i - 1] = temp;
    }

    //Preforms convolution
    for(int idx = 0; idx < cResult.length; idx++) {
      cResult[idx] = 0;
      //Loop checks every index in array
      for(int shift = 0; shift <= idx; shift++) {
        //If checks the indexes and shifts to make sure everything is in bounds
        if((idx - shift >= 0) && (shift <= idx) && (idx - shift < vFirst.length)
            && (shift < vSecond.length))
          cResult[idx] += vFirst[idx - shift] * vSecond[shift];
      }
    }
    return cResult;
  }
}