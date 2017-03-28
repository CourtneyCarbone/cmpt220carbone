/**
   * file: Problem_7_31.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Problem_7_31 abstract data type.
   */
/**
  * Problem_7_31
  * This class merges two sorted lists.
  */
import java.util.Scanner;

public class Problem_7_31 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.print("Enter list1: ");
    int[] list1=new int[input.nextInt()];
    for(int i=0; i<list1.length; i++) {
      list1[i]=input.nextInt();
    }
    System.out.print("Enter list2: ");
    int[] list2=new int[input.nextInt()];
    for(int i=0; i<list2.length; i++) {
      list2[i]=input.nextInt();
    }
    int[] list3=merge(list1, list2);

    System.out.print("The merged list is ");
    for(int e: list3) {
      System.out.print(" " + e);
    }
    System.out.println();
  }
  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 =new int[list1.length+list2.length];

    for(int i=0; i<list1.length; i++)
      list3[i]=list1[i];

    for(int i=0; j=list1.length; i<list2.length) i++; j++; {
      list3[j]=list2[i];
    }
    sort(list3);

    return list3;
  }
  public static void sort(int[] list) {
    for(int i=0; i<list.length-1; i++) {
      int minimum=list[i];
      int minimumIndex=i;

      for(int j=i+1; j<list.length; j++) {
        if(list[j]<minimum) {
          minimum=list[j];
          minimumIndex=j;
        }
      }
      if(minimumIndex!=i) {
        list[minimumIndex]=list[i];
        list[i]=minimum;
      }
    }
  }
}