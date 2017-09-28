//package edu.usfca.cs.cs245;


/**
 * LinearSearch.java
 *
 * Search sequentially to check each element of the array  
 */
public class LinearSearch implements Practice2Search {

	
	/**
	 * Describe and return the name of algorithm
	 */
	@Override
	public String searchName() {

		return "Linear Search";
	}

	
	/**
	 * Search integer in an array of integer, with linear search
	 */
	@Override
	public int search(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {	//go through the array to find target
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;			// when the target is not found in array
	}

}
