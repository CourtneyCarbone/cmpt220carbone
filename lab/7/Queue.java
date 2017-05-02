/**
   * file: Queue.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Queue abstract data type.
   */
/**
  * Queue
  * This class stores integers.
  */
class Queue {
	private int[] elements;
	private int size;
	public static int capacity = 8;

	Queue() {
	  elements = new int[capacity];
	}
	public void enqueue(int v) {
	  if(size >= elements.length) {
	    int[] temp = new int[elements.length*2];
	    System.arraycopy(elements, 0, temp, 0, elements.length);
	    elements = temp;
	  }
	  elements[size++] = v;
	}
	public int dequeue(){
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1 , temp, 0, size);
		elements = temp;
		size--;
		return v;
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}