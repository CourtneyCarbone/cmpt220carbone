/**
   * file: problem_5_1.java
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
  * problem_5_1
  * This class counts positive and negative numbers
  * and computes the average of the numbers.
  */

import java.util.Scanner;

public class problem_5_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int val = input.nextInt();
        double total = 0;
        int positive = 0;
        int negative = 0;
        double avg = 0;
        int count = 0;

        if (val == 0) {
          System.out.print("No numbers are entered except 0 ");
          System.exit(1);
        }

        do {
            total += val;
            
            if (val > 0)
                positive += 1;
            else
                negative += 1;

            count += 1;

            val = input.nextInt();
        } while (val != 0);

        avg = total / (double) count;
        
        System.out.printf("The number of positives is %d%nThe number of negatives is %d%n" + 
            "The total is %.2f%nThe average is %.2f%n", positive, negative, total, avg);
    }
}