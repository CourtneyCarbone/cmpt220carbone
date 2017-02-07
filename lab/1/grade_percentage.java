/**
   * file: grade_percentage.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * grade_percentage abstract data type.
   */
/**
  * grade_percentage
  * This class calculate a students total grade percentage in the class.
  */
import java.util.Scanner;
public class grade_percentage {
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
    System.out.print("Your final grade is: "(midtermexam * 0.2 
    + finalexam * 0.2  + projects 
    * 0.2 + hw * 0.4)+"%"); 



  }

}