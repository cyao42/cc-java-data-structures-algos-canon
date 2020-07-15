import java.util.ArrayList;
public class MinHeap {
    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    // Define add() below
    public void add(int value) {
        this.heap.add(value);
        this.size++;
        System.out.println("Adding " + value);
        System.out.println(this.heap);
        this.bubbleUp();
    }

    // Define bubbleUp() below
    private void bubbleUp() {
        System.out.println("Restoring heap condition...");
    }

    public static void main(String[]args) {
        MinHeap minHeap = new MinHeap();
        System.out.println(minHeap.heap);

        // Add 42 to minHeap using add()
        minHeap.add(42);
    }
}
