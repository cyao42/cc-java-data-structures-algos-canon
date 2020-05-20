package tests;

import SortingAlgorithms.QuickSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void sort() {
        QuickSort qs = new QuickSort();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        assertArrayEquals(
                "QuickSort failed to sort an all-positive array",
                expected,
                qs.sort(testArray)
        );

        int[] testArrayOneElement = {32};
        expected = new int[]{32};
        assertArrayEquals(
                "QuickSort failed to sort an array with a single element",
                expected,
                qs.sort(testArrayOneElement)
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        assertArrayEquals(
                "QuickSort failed to return an empty array as is",
                expected,
                qs.sort(testArrayBlank)
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        assertArrayEquals(
                "QuickSort failed to leave an already sorted array alone",
                expected,
                qs.sort(alreadySorted)
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        assertArrayEquals(
                "QuickSort failed to sort a happy array",
                expected,
                qs.sort(happyArray)
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        assertArrayEquals(
                "QuickSort failed in an array filled with multiples of the same element",
                expected,
                qs.sort(arrayWithMultiples)
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        assertArrayEquals(
                "QuickSort failed to sort an all-negative array",
                expected,
                qs.sort(negativeArray)
        );
    }
}