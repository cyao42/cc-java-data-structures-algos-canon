/**
 * This class contains the code implementation for Bubble Sort. It takes in an array
 */

package sort;

public class BubbleSort {

    public int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort bubble = new BubbleSort();
        int unsorted[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        printArray(unsorted);
        int[] sorted = bubble.sort(unsorted);
        System.out.println("Sorted array:");
        printArray(sorted);
    }
}