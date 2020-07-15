import java.util.ArrayList;
import java.util.Random;
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
        System.out.println("Adding " + value);
        System.out.println(this.heap);
        this.bubbleUp();
    }

    // Complete popMin() below
    public int popMin() {
        if (this.size == 0) {
            throw new Error("Heap is empty!");
        }
        System.out.println("Swap min element " + this.heap.get(1) + " and last element " + this.heap.get(this.size));
        this.swap(1, this.size);
        int min = this.heap.remove(this.size);
        System.out.println("Removed from the heap: " + min);
        System.out.println(this.heap);
        this.size--;
        return min;
    }

    private void bubbleUp() {
        int current = this.size;
        while (current > 1 && this.heap.get(this.getParent(current)) > this.heap.get(current)) {
            System.out.println("Swap index " + current + " with index " + this.getParent(current));
            System.out.println(this.heap);
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
        }
    }

    private void swap(int a, int b) {
        int temp = this.heap.get(b);
        this.heap.set(b, this.heap.get(a));
        this.heap.set(a, temp);
    }

    public int getParent(int current) {
        return (int) Math.floor(current / 2);
    }

    public int getLeft(int current) {
        return current * 2;
    }

    public int getRight(int current) {
        return (current * 2) + 1;
    }

    public static void main(String[]args) {
        MinHeap minHeap = new MinHeap();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int int_random = r.nextInt(40);
            minHeap.add(int_random);
        }
        System.out.println("Bubbled up heap " + minHeap.heap);

        // Remove the minimum value
        minHeap.popMin();
    }
}
