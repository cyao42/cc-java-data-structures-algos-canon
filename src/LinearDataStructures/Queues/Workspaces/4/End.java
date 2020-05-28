public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size++;
        System.out.println("Added " + data + "! Queue size is now " + this.size);
    }
    
    public static void main(String[] args) {
        Queue coffeeOrder = new Queue();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + " orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappuccino");
    }
}
