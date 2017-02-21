/**
   * file: problem_5_7.java
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
  * problem_5_7
  * This class computes future tuition.
  */

public class problem_5_7{
    public static void main(String[] args){
        double tuition = 10000.0;
        double yearlyIncreasePercentage = 0.05;
        
        double tuitionInTenYears = 0.0;
        double fourYearsOfTuition = 0.0;

        for (int i = 0; i < 14; i++){
            tuition += tuition * yearlyIncreasePercentage; 
            
            if (i == 9)
                tuitionInTenYears = tuition;

            if (i == 10 || i == 11| i == 12 || i == 13)
                fourYearsOfTuition += tuition;
        }

        System.out.printf("Tuition cost after 10 years is: $%.2f%n" + 
            "Four years of tuition after 10 years is: $%.2f%n", 
            tuitionInTenYears, fourYearsOfTuition);
    }
}