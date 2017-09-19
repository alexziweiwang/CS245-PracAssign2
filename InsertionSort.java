/**
 * InsertionSort.java
 * @author Alex Wang
 *
 */
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = smallest(a, i);
			swap(a, min, i);
		}
	}

	/**
	 * 
	 * @param arr
	 *            given array
	 * @param start
	 *            a starting point
	 * @return the index of the smallest number
	 */
	private int smallest(int[] arr, int start) {
		int smallest = start;
		for (int i = start + 1; i < arr.length; i++) {
			if (arr[i] < arr[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}

	/**
	 * Swap two elements in the array
	 * 
	 * @param arr
	 *            the array given
	 * @param m
	 *            the first element
	 * @param n
	 *            the second element
	 */
	private void swap(int[] arr, int m, int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
}
