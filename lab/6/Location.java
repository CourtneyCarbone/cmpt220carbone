/**
   * file: Location.java
   * author: Courtney Carbone
   * course: CMPT 220
   * assignment: lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This file contains the declaration of the 
   * Location abstract data type.
   */
/**
  * Location
  * This class locates a max value and its location in a two 
  * dimensional array
  */
class Location {
	int row;
	int column;
	double maxValue;

	Location(double[][] a) {
		maxValue = a [0][0];
		row = 0;
		column = 0;

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
