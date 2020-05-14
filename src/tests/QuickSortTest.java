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
                "Merge fails to sort an all-positive array",
                qs.sort(testArray),
                expected
        );

        int[] testArrayOneElement = {32};
        expected = new int[]{32};
        assertArrayEquals(
                "MergeSort fails to sort an array with a single element",
                qs.sort(testArrayOneElement),
                expected
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        assertArrayEquals(
                "MergeSort should have returned an empty array as is",
                qs.sort(testArrayBlank),
                expected
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        assertArrayEquals(
                "MergeSort should not change an already sorted array",
                qs.sort(alreadySorted),
                expected
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        assertArrayEquals(
                "MergeSort fails to sort a happy array",
                qs.sort(happyArray),
                expected
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        assertArrayEquals(
                "MergeSort should not change an array filled with multiples of the same element",
                qs.sort(arrayWithMultiples),
                expected
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        assertArrayEquals(
                "MergeSort fails to sort an all-negative array",
                qs.sort(negativeArray),
                expected
        );
    }
}