package SortingAlgorithms;

import java.util.Arrays;

/**
 * This class contains the code implementation for Merge Sort.
 */

public class MergeSort {

    /**
     * Sorts via divide and conquer. The initial array is recursively broken down into halves until
     * the base case of array length 1. merge() is called on the two sorted halves at each recursive level.
     * @param arr The array of integers to be sorted
     * @return Sorted array
     */
    public int[] sort(int arr[]) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        int mid = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);
        return merge(sort(leftArray), sort(rightArray));
    }

    /**
     * Merge takes two arrays and compares them index by index to put elements into a newly sorted array
     * @param left One of the sorted arrays to be integrated into a merged one
     * @param right One of the sorted arrays to be integrated into a merged one
     * @return merged sorted array
     */
    public int[] merge(int left[], int right[]) {
        int[] merged = new int[left.length + right.length];
        int leftPos = 0;
        int rightPos = 0;
        int curIndex = 0;

        while (leftPos < left.length && rightPos < right.length) {
            if (left[leftPos] < right[rightPos]) {
                merged[curIndex] = left[leftPos];
                leftPos++;
            } else {
                merged[curIndex] = right[rightPos];
                rightPos++;
            }
            curIndex++;
        }

        System.arraycopy(left, leftPos, merged, curIndex, left.length - leftPos);
        System.arraycopy(right, rightPos, merged, curIndex, right.length - rightPos);
        return merged;
    }

}