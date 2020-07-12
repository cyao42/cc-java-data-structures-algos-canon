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


    // Define bubbleUp() below


    public static void main(String[]args) {
        MinHeap minHeap = new MinHeap();
        System.out.println(minHeap.heap);

        // Add 42 to minHeap using add() below

    }
}
