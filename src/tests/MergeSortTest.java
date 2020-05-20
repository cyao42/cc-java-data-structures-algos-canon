package tests;

import SortingAlgorithms.MergeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        MergeSort ms = new MergeSort();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        assertArrayEquals(
                "Merge failed to sort an all-positive array",
                expected,
                ms.sort(testArray)
        );

        int[] testArrayOneElement = {32};
        expected = new int[]{32};
        assertArrayEquals(
                "MergeSort failed to sort an array with a single element",
                expected,
                ms.sort(testArrayOneElement)
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        assertArrayEquals(
                "MergeSort failed to return an empty array as is",
                expected,
                ms.sort(testArrayBlank)
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        assertArrayEquals(
                "MergeSort failed to leave an already sorted array alone",
                expected,
                ms.sort(alreadySorted)
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        assertArrayEquals(
                "MergeSort failed to sort a happy array",
                expected,
                ms.sort(happyArray)
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        assertArrayEquals(
                "MergeSort failed to leave an array filled with multiples of the same element alone",
                expected,
                ms.sort(arrayWithMultiples)
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        assertArrayEquals(
                "MergeSort failed to sort an all-negative array",
                expected,
                ms.sort(negativeArray)
        );
    }

    @Test
    public void merge() {
        MergeSort ms = new MergeSort();

        int[] leftArray = {0, 3, 4, 5};
        int[] rightArray = {-9, -3, 1, 12};
        int[] expected = {-9, -3, 0, 1, 3, 4, 5, 12};
        assertArrayEquals(
                "Merge fails to merge and sort two sorted arrays",
                expected,
                ms.merge(leftArray, rightArray)
        );

        leftArray = new int[]{4, 5, 0, 3};
        rightArray = new int[]{1, -3, -9, 12};
        expected = new int[]{1, -3, -9, 4, 5, 0, 3, 12};
        assertArrayEquals(
                "Merge did not have the expected behavior on two unsorted arrays",
                expected,
                ms.merge(leftArray, rightArray)
        );

        leftArray = new int[]{0, 1, 2, 3};
        rightArray = leftArray;
        expected = new int[]{0, 0, 1, 1, 2, 2, 3, 3};
        assertArrayEquals(
                "Merge fails to properly sort two identical arrays",
                expected,
                ms.merge(leftArray, rightArray)
        );

        leftArray = new int[]{0, 3, 4};
        rightArray = new int[]{-9, -3, 1, 5, 12};
        expected = new int[]{-9, -3, 0, 1, 3, 4, 5, 12};
        assertArrayEquals(
                "Merge failed on two sorted arrays of different lengths",
                expected,
                ms.merge(leftArray, rightArray)
        );

        leftArray = new int[]{4, 2, 15};
        rightArray = new int[]{3, 10, -2, 1, 1};
        expected = new int[]{3, 4, 2, 10, -2, 1, 1, 15};
        assertArrayEquals(
                "Merge failed on two unsorted arrays of different lengths",
                expected,
                ms.merge(leftArray, rightArray)
        );
    }
}