public class Stack {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Define hasSpace() below


    // Define isEmpty() below


    public void push(String data) {
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    public String pop() {
        String data = this.stack.removeHead();
        this.size--;
        System.out.println("Removed " + data + "! Stack size is now " + this.size);
        return data;
    }

    public String peek() {
        return this.stack.head.data;
    }
    
    public static void main(String[]args) { }
    
}
