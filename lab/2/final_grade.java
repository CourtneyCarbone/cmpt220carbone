/**
   * file: final_grade.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * final_grade abstract data type.
   */
/**
  * final_grade
  * This class calculate a students total grade percentage 
  * in the class and outputs the final letter grade.
  */
import java.util.Scanner;

public class final_grade {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the following as percentage...");
    System.out.print("midterm exam: ");
    double midtermexam = input.nextDouble();
    System.out.print("final exam: ");
    double finalexam = input.nextDouble();
    System.out.print("projects: ");
    double projects = input.nextDouble();
    System.out.print("homework and labs: ");
    double hw = input.nextDouble();
    double score = (midtermexam * 0.2 
    + finalexam * 0.2  + projects 
    * 0.2 + hw * 0.4);
    if (score >= 90.0)
      System.out.print("Your final grade is: A");
    else if (score >= 80.0)
      System.out.print("Your final grade is:  B");
    else if (score >= 70.0)
      System.out.print("Your final grade is: C");
    else if (score >= 60.0)
      System.out.print("Your final grade is: D");
    else
      System.out.print("Your final grade is: F");

  }

}