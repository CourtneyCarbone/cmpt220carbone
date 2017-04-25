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
	private int capacity;

	public Queue(int capactiy) {
	  this.capacity = capacity;
	  elements = new int [capacity];
	}
	public Queue() {
	  this(8);
	}
	public void enqueue(int v) {
	  if(size >= elements.length) {
	    int[] temp = new int[size*2];
	    System.arraycopy(elements, 0, temp, 0, size);
	    elements = temp;
	  }
	  elements[size++] = v;
	}
	public int dequeue(){
		int v = elements[0];
		size--;
		for(int i=0; i < size; i++) {
			elements[i] = elements[i+1];
		}
		return v;
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
}