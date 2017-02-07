/**
   * file: problem_4_26.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * problem_4_26 abstract data type.
   */
/**
  * problem_4_26
  * This class extracts the amount of money a person has.
  */
import java.util.Scanner;

public class problem_4_26{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();

    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

    int numberOfQuarters = cents/25;
    cents %= 25;

    int numberOfDimes = cents/10;
    cents %= 10;

    int numberOfNickels = cents/5;
    cents %= 5;

    System.out.println("Your amount " + amount + " consists of\n");
    System.out.println(" " + numberOfOneDollars + " dollars\n");
    System.out.println(" " + numberOfQuarters + " quarters\n");
    System.out.println(" " + numberOfDimes + " dimes\n");
    System.out.println(" " + numberOfNickels + " nickels\n");
    System.out.println(" " + cents + " pennies\n");
  } 
}