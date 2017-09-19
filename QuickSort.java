/**
 * QuickSort.java
 * 
 * @author Alex Wang
 *
 */
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);

	}

	/**
	 * A recursive algorithm for sorting
	 * 
	 * @param arr
	 *            array given
	 * @param top
	 *            a pointer goes from top
	 * @param bot
	 *            a pointer goes from bottom
	 */
	private void quickSort(int[] arr, int top, int bot) {
		int pivot = partition(arr, top, bot);// deivide the array.
		if (top < pivot - 1) {
			quickSort(arr, top, pivot - 1);
		}
		if (pivot < bot) {
			quickSort(arr, pivot, bot);
		}
	}

	/**
	 * Eventually make the top of pivot larger and bottom of pivot smaller
	 * 
	 * @param a
	 *            array given
	 * @param top
	 *            pointer starts from top
	 * @param bot
	 *            pointer starts from bottom
	 * @return the index of pivot
	 */

	private int partition(int[] a, int top, int bot) {
		int i = top; // start from top
		int j = bot; // start from bottom
		int pivot = (top + bot) / 2;
		while (i <= j) {
			while (a[i] < a[pivot]) {
				i++;
			}
			while (a[j] > a[pivot]) {
				j--;
			}
			if (i <= j) {
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		return i;
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
