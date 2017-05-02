/**
   * file: Problem_10_10.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_10_10 abstract data type.
   */
/**
  * Problem_10_10
  * This class stores integers.
  */
public class Problem_10_10 {
  public static void main(String[] args) {
    Queue q = new Queue();
    for(int i =1; i < 20; i++) {
      q.enqueue(i);
    }
      while(!q.empty()) {
        System.out.printf(q.dequeue() + " ");
      } 
      System.out.println();
  }
}