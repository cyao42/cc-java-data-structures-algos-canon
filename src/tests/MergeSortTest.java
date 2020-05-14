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
                "Merge fails to sort an all-positive array",
                ms.sort(testArray),
                expected
        );

        int[] testArrayOneElement = {32};
        expected = new int[]{32};
        assertArrayEquals(
                "MergeSort fails to sort an array with a single element",
                ms.sort(testArrayOneElement),
                expected
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        assertArrayEquals(
                "MergeSort should have returned an empty array as is",
                ms.sort(testArrayBlank),
                expected
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        assertArrayEquals(
                "MergeSort should not change an already sorted array",
                ms.sort(alreadySorted),
                expected
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        assertArrayEquals(
                "MergeSort fails to sort a happy array",
                ms.sort(happyArray),
                expected
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        assertArrayEquals(
                "MergeSort should not change an array filled with multiples of the same element",
                ms.sort(arrayWithMultiples),
                expected
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        assertArrayEquals(
                "MergeSort fails to sort an all-negative array",
                ms.sort(negativeArray),
                expected
        );
    }

    @Test
    public void merge() {
        MergeSort ms = new MergeSort();

        int[] leftArray = {0, 3, 4, 5};
        int[] rightArray = {-9, -3, 1, 12};
        int[] expected = {-9, -3, 0, 1, 3, 4, 5, 12};
        assertArrayEquals(
                "It does not merge and sort two sorted arrays",
                ms.merge(leftArray, rightArray),
                expected
        );

        leftArray = new int[]{4, 5, 0, 3};
        rightArray = new int[]{1, -3, -9, 12};
        expected = new int[]{1, -3, -9, 4, 5, 0, 3, 12};
        assertArrayEquals(
                "It does not have the expected behavior on two unsorted arrays",
                ms.merge(leftArray, rightArray),
                expected
        );

        leftArray = new int[]{0, 1, 2, 3};
        rightArray = leftArray;
        expected = new int[]{0, 0, 1, 1, 2, 2, 3, 3};
        assertArrayEquals(
                "It does not properly sort two identical arrays",
                ms.merge(leftArray, rightArray),
                expected
        );

        leftArray = new int[]{0, 3, 4};
        rightArray = new int[]{-9, -3, 1, 5, 12};
        expected = new int[]{-9, -3, 0, 1, 3, 4, 5, 12};
        assertArrayEquals(
                "It does not merge two sorted arrays of different lengths",
                ms.merge(leftArray, rightArray),
                expected
        );

        leftArray = new int[]{4, 2, 15};
        rightArray = new int[]{3, 10, -2, 1, 1};
        expected = new int[]{3, 4, 2, 10, -2, 1, 1, 15};
        assertArrayEquals(
                "It does not have the expected behavior on two unsorted arrays of different lengths",
                ms.merge(leftArray, rightArray),
                expected
        );
    }
}