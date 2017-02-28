/**
   * file: Problem_6_8.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 4
   * due date: March 1, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_6_8 abstract data type.
   */
/**
  * Problem_6_8
  * This class converts Celsius to Fahrenheit
  * and Farhenheit to Celsius.
  */

public class Problem_6_8 {
  public static void main(String[] args) {
    System.out.println("Celsius   Fahrenheit       |    Fahrenheit    Celsius");
    System.out.println("-----------------------------------------------------");

    for (double celsius = 40.0, fahrenheit = 120.0; 
        celsius >= 31.0; celsius--, fahrenheit -= 10) {
      System.out.printf("%-12.1f", celsius);
      System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
      System.out.printf("     %-15.1f", fahrenheit);
      System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
    }
  }
  public static double celsiusToFahrenheit(double celsius){
    return (9.0/5) * celsius + 32;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    return(5.0/9) * (fahrenheit - 32);
  }
}