/**
 * BubbleSort.java
 * @author Alex Wang
 *
 */
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		boolean swapped = true;

		/* go through all index on the array until all in correct sequence */
		for (int j = 0; j < a.length && swapped == true; j++) {
			swapped = false;

			for (int i = 0; i < a.length - 1 - j; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					swapped = true;
				}
			}
		}
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
