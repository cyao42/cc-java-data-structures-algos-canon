package SortingAlgorithms;

import static SortingAlgorithms.SortUtils.swap;

public class QuickSort {

    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        return sort(arr, 0, arr.length - 1);
    }

    public int[] sort(int[] arr, int start, int end) {
        if (arr.length > 1) {
            int index = partition(arr, start, end);
            if (start < index - 1) {
                sort(arr, start, index - 1);
            }
            if (index < end) {
                sort(arr, index, end);
            }
        }
        return arr;
    }

    public int partition(int[] arr, int leftIndex, int rightIndex) {
        int pivot = arr[Math.floorDiv((leftIndex + rightIndex), 2)];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
