package tests;

import SortingAlgorithms.BubbleSort.BubbleSort;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @org.junit.Test
    public void sort() {
        BubbleSort bs = new BubbleSort();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        assertArrayEquals(
                "BubbleSort fails to sort an all-positive array",
                bs.sort(testArray),
                expected
        );

        int[] testArrayOneElement = {32};
        expected = new int[]{32};
        assertArrayEquals(
                "BubbleSort fails to sort an array with a single element",
                bs.sort(testArrayOneElement),
                expected
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        assertArrayEquals(
                "BubbleSort should have returned an empty array as is",
                bs.sort(testArrayBlank),
                expected
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        assertArrayEquals(
                "BubbleSort should not change an already sorted array",
                bs.sort(alreadySorted),
                expected
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        assertArrayEquals(
                "BubbleSort fails to sort a happy array",
                bs.sort(happyArray),
                expected
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        assertArrayEquals(
                "BubbleSort should not change an array filled with multiples of the same element",
                bs.sort(arrayWithMultiples),
                expected
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        assertArrayEquals(
                "BubbleSort fails to sort an all-negative array",
                bs.sort(negativeArray),
                expected
        );
    }
}