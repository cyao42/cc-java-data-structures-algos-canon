package tests;

import SortingAlgorithms.BubbleSort;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @org.junit.Test
    public void sort() {
        BubbleSort bs = new BubbleSort();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        int[] testArraySorted = {11, 12, 22, 25, 34, 64, 90};

        int[] bubbleSorted = bs.sort(testArray);
        assertArrayEquals("The sort did not return the expected result", testArraySorted, bubbleSorted);

        int[] testArrayOneElement = {32};
        int[] testArrayOneElementSorted = {32};
        int[] bubbleSortedOneElement = bs.sort(testArrayOneElement);
        assertArrayEquals("The sort did not return the expected result", testArrayOneElementSorted, bubbleSortedOneElement);

        int[] testArrayBlank = {};
        int[] testArrayBlankSorted = {};
        int[] bubbleSortedBlank = bs.sort(testArrayBlank);
        assertArrayEquals("The sort did not return the expected result", testArrayBlankSorted, bubbleSortedBlank);
    }
}