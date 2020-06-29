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
    
    public String dequeue() {
        String data = this.queue.removeHead();
        this.size--;
        System.out.println("Removed " + data + "! Queue size is now " + this.size);
        return data;
    }
    
    public String peek() {
        return this.queue.head.data;
    }
    
    public static void main(String[] args) {
      Queue queueOne = new Queue(25);
      Queue queueTwo = new Queue(0);
      System.out.println("queueOne has space for more nodes: " + queueOne.hasSpace());
      System.out.println("queueTwo has space for more nodes: " + queueTwo.hasSpace());
      System.out.println("queueOne is empty: " + queueOne.isEmpty());
      System.out.println("queueTwo is empty: " + queueTwo.isEmpty());
    }
}
