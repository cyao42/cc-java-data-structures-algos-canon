package tests;

import LinearDataStructures.MinHeap;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {
    @Test
    public void newList() {
        // Heap sorts
        MinHeap heap = new MinHeap();
        heap.add(12);
        heap.add(72);
        heap.add(38);
        heap.add(9);
        int num = heap.popMin();
        ArrayList<Integer> expected;
        ArrayList<Integer> actual;
        assertEquals("Heap not working", num, 9);
    }
    

}