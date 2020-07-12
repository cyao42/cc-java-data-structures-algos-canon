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
        System.out.println("Adding " + value);
        System.out.println(this.heap);
        this.bubbleUp();
    }

    private void bubbleUp() {
        System.out.println("Restoring heap properties...");
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
        // Sample content of minHeap
        minHeap.add(10);
        minHeap.add(13);
        minHeap.add(21);
        minHeap.add(61);
        minHeap.add(22);
        minHeap.add(23);
        minHeap.add(99);

        // Display parent, left and right indices of currentIndex
        int currentIndex = 3;
        System.out.println("Let's look at index " + currentIndex);
        System.out.println("Parent index: " + minHeap.getParent(currentIndex));
        System.out.println("Left child index: " + minHeap.getLeft(currentIndex));
        System.out.println("Right child index: " + minHeap.getRight(currentIndex));

        // Display the parent, left and right child values of currentValue
        int currentValue = minHeap.heap.get(currentIndex);
        System.out.println("The value at index 3 is " + currentValue);
        System.out.println("Parent value: " + minHeap.heap.get(minHeap.getParent(currentIndex)));
        System.out.println("Left child value: " + minHeap.heap.get(minHeap.getLeft(currentIndex)));
        System.out.println("Right child value: " + minHeap.heap.get(minHeap.getRight(currentIndex)));
    }
}
