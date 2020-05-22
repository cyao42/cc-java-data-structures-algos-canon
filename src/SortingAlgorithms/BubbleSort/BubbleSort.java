/**
 * This class contains the code implementation for Bubble Sort.
 */

package SortingAlgorithms.BubbleSort;
import static SortingAlgorithms.SortUtils.swap;

public class BubbleSort {
    public int[] sort(int arr[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapping = true;
                }
            }
        }
        return arr;
    }
}