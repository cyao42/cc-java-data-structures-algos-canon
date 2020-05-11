package LinearDataStructures;

public class MinHeap {

    public int heap[];
    public int size;

    public MinHeap() {
        this.heap = new int[Integer.MAX_VALUE];
        this.size = 0;
    }

    public void add(int value) {
        this.heap[size] = value;
        this.size++;
        this.bubbleUp();
    }

    public int popMin() {
        return 3;
    }

    private void bubbleUp() {

    }

    private void heapify() {

    }

    private void swap(int a, int b) {
        int temp = this.heap[b];
        this.heap[b] = this.heap[a];
        this.heap[a] = temp;
    }

    private boolean exists(int index) {
        return index <= this.size;
    }

    private boolean canSwap(int current, int leftChild, int rightChild) {
        return (this.exists(leftChild) && (this.heap[current] > this.heap[leftChild]))
                || (this.exists(rightChild) && (this.heap[current] > this.heap[rightChild]));
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