package tests;

import LinearDataStructures.MinHeap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {
    @Test
    public void createHeap() {
        // First element in array is null
        MinHeap h = new MinHeap();
        assertEquals("First element in heap is not null", h.heap.get(0), null);
        // Initial size is 0
        assertEquals("Initial size is not 0", h.size, 0);
    }

    @Test
    public void addToHeap() {
        // Size increases
        MinHeap h = new MinHeap();
        h.add(20);
        assertEquals("Size did not increase", h.size, 1);
        h.add(30);
        assertEquals("Size did not increase", h.size, 2);
        // Child is now in heap
        boolean childAdded20 = false;
        boolean childAdded30 = false;
        for (int i = 1; i < h.heap.size(); i++) {
            if (h.heap.get(i) == 20) {
                childAdded20 = true;
            } else if (h.heap.get(i) == 30) {
                childAdded30 = true;
            }
        }
        assertEquals("Child not added", childAdded20, true);
        assertEquals("Child not added", childAdded30, true);
    }

    @Test
    public void popTheMin() {
        // Size decreases
        MinHeap h = new MinHeap();
        h.add(3);
        h.add(6);
        h.add(1);
        h.popMin();
        assertEquals("Size does not decrease", h.size, 2);

        // Min is no longer in heap
        boolean minPopped = true;
        for (int i = 1; i <= h.size; i++) {
            if (h.heap.get(i) == 1) {
                minPopped = false;
            }
        }
        assertEquals("Min not popped", minPopped, true);

        // Returns the min
        h = new MinHeap();
        h.add(3);
        h.add(6);
        h.add(1);
        assertEquals(".popMin() does not return the min", h.popMin(), 1);
    }

    @Test
    public void bubbleUpValid() {
        // Bubbles up an input that is less than the existing values
        MinHeap h = new MinHeap();
        h.heap.add(8);
        h.size++;
        h.bubbleUp();
        h.heap.add(1);
        h.size++;
        h.bubbleUp();
        int num = h.heap.get(1);
        assertEquals("Bubbles up incorrectly", 1, num);

        // Doesn't bubble up an input that is greater than the existing values
        h = new MinHeap();
        h.heap.add(8);
        h.size++;
        h.bubbleUp();
        h.heap.add(1);
        h.size++;
        h.bubbleUp();
        h.heap.add(10);
        h.size++;
        h.bubbleUp();
        num = h.heap.get(3);
        assertEquals("Bubbles up incorrectly", 10, num);
    }

    @Test
    public void heapifyValid() { 
        // Correctly reorders heaps of over 3 elements after removing the min
        MinHeap testHeap = new MinHeap();
        testHeap.add(9);
        testHeap.add(6);
        testHeap.add(7);
        testHeap.add(3);
        testHeap.add(5);
        testHeap.swap(1, testHeap.size);
        testHeap.heap.remove(testHeap.size);
        testHeap.size--;
        testHeap.heapify();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(9);
        assertEquals("Heapify does not work", testHeap.heap, expected);

        // Correctly reorders heaps of 3 elements after removing the min
        testHeap = new MinHeap();
        testHeap.add(9);
        testHeap.add(6);
        testHeap.add(7);
        testHeap.swap(1, testHeap.size);
        testHeap.heap.remove(testHeap.size);
        testHeap.size--;
        testHeap.heapify();
        expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(7);
        expected.add(9);
        assertEquals("Heapify does not work", testHeap.heap, expected);

        // Correctly reorders heaps of 2 elements after removing the min
        testHeap = new MinHeap();
        testHeap.add(9);
        testHeap.add(6);
        testHeap.swap(1, testHeap.size);
        testHeap.heap.remove(testHeap.size);
        testHeap.size--;
        testHeap.heapify();
        expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(9);
        assertEquals("Heapify does not work", testHeap.heap, expected);
    }

    @Test
    public void testSwap() {
        // Swaps two elements at the given indices
        MinHeap h = new MinHeap();
        h.add(9);
        h.add(21);
        h.add(18);
        h.swap(1, 3);
        int num1 = h.heap.get(1);
        int num2 = h.heap.get(3);
        assertEquals("Swap not done correctly", num1, 18);
        assertEquals("Swap not done correctly", num2, 9);
    }

    @Test
    public void testExists() {
        // Returns true if there is an element at that index
        MinHeap h = new MinHeap();
        h.add(9);
        h.add(21);
        h.add(18);
        assertEquals(".exists() not working correctly", h.exists(3), true);
        // Returns false if there is no element at that index
        assertEquals(".exists() not working correctly", h.exists(4), false);
    }


}