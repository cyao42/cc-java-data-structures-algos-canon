package tests;

import LinearDataStructures.SearchingArrays.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BinarySearchTest {

    @Test
    public void search() {
        BinarySearch bin = new BinarySearch();
        int[] testSearchSpacePositive = {1, 3, 14, 26, 28, 30, 44, 83};
        int expectedIndex = 2;
        int target = 14;
        assertEquals(
                "Binary search failed to find an existing element in an all-positive sorted array",
                expectedIndex,
                bin.search(testSearchSpacePositive, target)
        );

        int[] testSearchSpaceNegative = {-29, -20, -18, -14, -8, -5, -3, -2};
        expectedIndex = 5;
        target = -5;
        assertEquals(
                "Binary search failed to find an existing element in an all-negative sorted array",
                expectedIndex,
                bin.search(testSearchSpaceNegative, target)
        );

        int[] testSearchSpacePositiveAndNegative = {-24, -16, -15, -9, -3, 5, 11, 17};
        expectedIndex = 1;
        target = -16;
        assertEquals(
                "Binary search failed to find an existing element in a mixed positive/negative sorted array",
                expectedIndex,
                bin.search(testSearchSpacePositiveAndNegative, target)
        );

        int[] testSearchSpaceNonSorted = {20, 14, 0, 3, 2, 6, 18, 11};
        int expectedReturn = -1;
        target = 14;
        assertEquals(
                "Binary search did not have the expected behavior on a non-sorted array",
                expectedReturn,
                bin.search(testSearchSpaceNonSorted, target)
        );

        int[] testSearchSpaceNoTarget = {4, 12, 15, 19, 20, 22, 25, 30, 36, 40};
        expectedReturn = -1;
        target = 14;
        assertEquals(
                "Binary search should have returned -1 if target does not exist in array",
                expectedReturn,
                bin.search(testSearchSpaceNoTarget, target)
        );

        int[] testSearchSpaceOneElement = {20};
        expectedIndex = 0;
        target = 20;
        assertEquals(
                "Binary search should have returned the correct index in a one-element array",
                expectedIndex,
                bin.search(testSearchSpaceOneElement, target)
        );

        int[] testSearchSpaceOneElementNoTarget = {20};
        expectedIndex = -1;
        target = 11;
        assertEquals(
                "Binary search should have returned -1 in a one-element array without target",
                expectedIndex,
                bin.search(testSearchSpaceOneElementNoTarget, target)
        );

        int[] testSearchSpaceEmpty = {};
        expectedReturn = -1;
        target = 12;
        assertEquals(
                "Binary search should have returned -1 if array is empty",
                expectedReturn,
                bin.search(testSearchSpaceEmpty, target)
        );

    }
}