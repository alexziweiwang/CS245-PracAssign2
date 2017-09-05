package edu.usfca.cs.cs245;

/**
 * BinaryRecursiveSearch.java
 * 
 *         Binary search by recursion
 *
 */
public class BinaryRecursiveSearch implements Practice2Search {
	/**
	 * Describe and return the name of algorithm
	 */
	@Override
	public String searchName() {

		return "Binary Recursive Search";
	}

	/**
	 * Search integer in an array of integer, with binary search by calling
	 * private method in recursion
	 */
	@Override
	public int search(int[] arr, int target) {

		return search(arr, target, 0, arr.length - 1);

	}

	/**
	 * Recursive method for binary search
	 * 
	 * @param arr
	 * 			The array that would be searched through
	 * @param target
	 * 			The target integer which the method is looking for
	 * @param min
	 * 			The beginning of searching range
	 * @param max
	 * 			The end of searching range
	 * @return
	 * 			The index of integer
	 */
	private int search(int[] arr, int target, int min, int max) {
		
	
		int mid = (min + max) / 2;

		if (min > max || target > max) {
			return -1;
		}

		if (arr[mid] == target) {
			return mid;
		}

		if (arr[mid] > target) {
			return search(arr, target, min, mid - 1);
		}

		else {
			return search(arr, target, mid + 1, max);
		}

	}

}
