package tests;

import LinearDataStructures.MinHeap;
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
    public void popTheMin() { // TODO
        // Size decreases
//        MinHeap h = new MinHeap();
//        h.add(20);
//        h.add(30);
//        h.add(40);
//        h.popMin();
//        assertEquals("Size does not decrease", h.size, 2);
        // Min is no longer in heap
//        boolean minPopped = true;
//        for (int i = 1; i <= h.heap.size(); i++) {
//            if (h.heap.get(i) == 20) {
//                minPopped = false;
//            }
//        }
//        assertEquals("Child not added", minPopped, false);
        // Returns the min
        // Pops randomly generated heaps in the correct order

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
    public void heapifyValid() { // TODO
        // Correctly reorders heaps of over 3 elements after removing the min

        // Correctly reorders heaps of 3 elements after removing the min
        // Correctly reorders heaps of 2 elements after removing the min

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


}