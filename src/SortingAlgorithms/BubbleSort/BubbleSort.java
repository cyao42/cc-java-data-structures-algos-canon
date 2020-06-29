/**
 * This class contains the code implementation for Bubble Sort.
 */

package SortingAlgorithms.BubbleSort;
import static SortingAlgorithms.SortUtils.swap;

public class BubbleSort {

    public int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i+1]) {
                    System.out.println(String.format("Swapping pair %d, %d", input[i], input[i+1]));
                    swap(input, i, i+1);
                    swapping = true;
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr1);
        b.bubbleSort(arr2);
    }
}