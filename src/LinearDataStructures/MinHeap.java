 /*NOTE: many methods were made public (heapify, bubbleUp, the helper methods)
 for testing - they should be private when in the LE */

package LinearDataStructures;
import java.util.ArrayList;

public class MinHeap {

    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public void add(int value) {
        this.heap.add(value);
        this.size++;
        this.bubbleUp();
    }

    public int popMin() {
        if (this.size == 0) {
            throw new Error("Heap is empty!");
        }
        this.swap(1, this.size);
        int min = this.heap.remove(this.size);
        this.size--;
        this.heapify();
        return min;
    }

    public void bubbleUp() {
        int current = this.size;
        while (current > 1 && this.heap.get(this.getParent(current)) > this.heap.get(current)) {
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
        }
    }

    public void heapify() {
        int current = 1;
        int leftChild = this.getLeft(current);
        int rightChild = this.getRight(current);

        while (this.canSwap(current, leftChild, rightChild)) {
            if (this.exists(leftChild) && this.exists(rightChild)) {
                if (this.heap.get(leftChild) < this.heap.get(rightChild)) {
                    this.swap(current, leftChild);
                    current = leftChild;
                } else {
                    this.swap(current, rightChild);
                    current = rightChild;
                }
                leftChild = this.getLeft(current);
                rightChild = this.getRight(current);
            }
        }
    }

    public void swap(int a, int b) {
        int temp = this.heap.get(b);
        this.heap.set(b, this.heap.get(a));
        this.heap.set(a, temp);
    }

    public boolean exists(int index) {
        return index <= this.size;
    }

    private boolean canSwap(int current, int leftChild, int rightChild) {
        return (this.exists(leftChild) && (this.heap.get(current) > this.heap.get(leftChild)))
                || (this.exists(rightChild) && (this.heap.get(current) > this.heap.get(rightChild)));
    }

    private int getParent(int current) {
        return (int) Math.floor(current / 2);
    }

    private int getLeft(int current) {
        return current * 2;
    }

    private int getRight(int current) {
        return (current * 2) + 1;
    }

}