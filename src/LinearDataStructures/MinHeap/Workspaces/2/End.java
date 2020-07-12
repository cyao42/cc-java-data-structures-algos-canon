import java.util.ArrayList;
public class MinHeap {
    public ArrayList<Integer> heap;
    public int size;

    // Define MinHeap constructor below
    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

    public static void main(String[]args) {
        // Instantiate a minHeap, assign to minHeap
        MinHeap minHeap = new MinHeap();
        // Display contents of minHeap
        System.out.println(minHeap.heap);
    }
}
