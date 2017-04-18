/**
   * file: Problem_9_1.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_9_1 abstract data type.
   */
/**
  * Problem_9_1
  * This class creates 2 rectangles
  */
public class Problem_9_1 {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(4,40);
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);

    System.out.println("The details of the first rectangle...");
    System.out.println("Width of Rectangle1: " + rectangle1.width);
    System.out.println("Height of Rectangle1: " + rectangle1.height);
    System.out.println("Area of Rectangle1: " + rectangle1.getArea());
    System.out.print("Perimeter of Rectangle1: " + rectangle1.getPerimeter());
    System.out.println();

    System.out.println("The details of the second rectangle...");
    System.out.println("Width of Rectangle2: " + rectangle2.width);
    System.out.println("Height of Rectangle2: " + rectangle2.height);
    System.out.println("Area of Rectangle2: " + rectangle2.getArea());
    System.out.print("Perimeter of Rectangle2: " + rectangle2.getPerimeter());
    System.out.println();
  }
}