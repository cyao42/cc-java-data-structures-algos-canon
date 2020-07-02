package SortingAlgorithms.QuickSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void sort() {
        QuickSort qs = new QuickSort();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        printArray(testArray);

        assertArrayEquals(
                "QuickSort failed to sort an all-positive array",
                expected,
                qs.quicksort(testArray)
        );

        int[] testArrayOneElement = {32};
        printArray(testArray);
        expected = new int[]{32};
        assertArrayEquals(
                "QuickSort failed to sort an array with a single element",
                expected,
                qs.quicksort(testArrayOneElement)
        );

        int[] testArrayBlank = {};
        expected = new int[]{};
        printArray(testArray);
        assertArrayEquals(
                "QuickSort failed to return an empty array as is",
                expected,
                qs.quicksort(testArrayBlank)
        );

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7};
        expected = alreadySorted;
        printArray(testArray);
        assertArrayEquals(
                "QuickSort failed to leave an already sorted array alone",
                expected,
                qs.quicksort(alreadySorted)
        );

        int[] happyArray = {0, -1, 8, 7, 6, 5};
        expected = new int[]{-1, 0, 5, 6, 7, 8};
        printArray(testArray);
        assertArrayEquals(
                "QuickSort failed to sort a happy array",
                expected,
                qs.quicksort(happyArray)
        );

        int[] arrayWithMultiples = {4, 4, 4, 4, 4, 4, 4, 4};
        expected = arrayWithMultiples;
        printArray(testArray);
        assertArrayEquals(
                "QuickSort failed in an array filled with multiples of the same element",
                expected,
                qs.quicksort(arrayWithMultiples)
        );

        int[] negativeArray = {-4, -50, -9, -100, -20, -3, -2, -44, -13, -25};
        expected = new int[]{-100, -50, -44, -25, -20, -13, -9, -4, -3, -2};
        printArray(testArray);
        assertArrayEquals(
                "QuickSort failed to sort an all-negative array",
                expected,
                qs.quicksort(negativeArray)
        );
    }

    public void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(" " + arr[i] + " ");
        }
        System.out.println("The starting array : " + sb.toString());
    }
}