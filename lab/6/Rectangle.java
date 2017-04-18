/**
   * file: Rectangle.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Rectangle abstract data type.
   */
/**
  * Rectangle
  * This class creates 2 rectangles
  */
class Rectangle {
  double width = 1.0;
  double height = 1.0;

  Rectangle() {

  }

  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

  double getArea() {
    return width * height;
  }

  double getPerimeter() {
    return 2 * (width + height);
  }
}