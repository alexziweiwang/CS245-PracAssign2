package edu.usfca.cs.cs245;

/**
 * BinaryIterativeSearch.java
 * 
 * Binary search by iteration
 *
 */
public class BinaryIterativeSearch implements Practice2Search {

	/**
	 * Describe and return the name of algorithm
	 */
	@Override
	public String searchName() {
		return "Binary Iterative Search";
	}

	/**
	 * Search integer in an array of integer, with binary search by iteration
	 */
	@Override
	public int search(int[] arr, int target) {

		int min = 0;				
		int max = arr.length - 1;
		int mid;

		while (target < max && min <= max) {

			mid = (max - min) / 2; 

			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				max = mid - 1;

			} else {
				min = mid + 1;
			}

		}
		return -1; // when that the target is not found in array
	}

}
