/**
   * file: problem_3_8.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_3_8 abstract data type.
   */
/**
  * problem_3_8
  * This class outputs three integers in non-decreasing order.
  */
import java.util.Scanner;

public class problem_3_8 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three integers");
    int integer1 = input.nextInt();
    int integer2 = input.nextInt();
    int integer3 = input.nextInt();
    if ((integer1 <= integer2) && (integer1 <= integer3)) {
      if (integer2 <= integer3){
        System.out.print(integer1+", " +integer2+", " +integer3);
      }
      else {
        System.out.print(integer1+", " +integer3+", " +integer2);
      }
    }
    else if ((integer2 <= integer1) && (integer2 <= integer3)) {
      if (integer1 <= integer3){
        System.out.print(integer2+", " +integer1+", " +integer3);
      }
      else {
        System.out.print(integer2+", " +integer3+", " +integer1);
      }  
    }
    else {
      if (integer1 <= integer2){
        System.out.print(integer3+", " +integer1+", " +integer2);
      }
      else {
        System.out.print(integer3+", " +integer2+", " +integer1);
      }
    }
  }
}