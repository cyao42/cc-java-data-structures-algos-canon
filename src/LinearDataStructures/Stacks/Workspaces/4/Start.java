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

    public void push(String data) {
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    // Define pop() below


    // Define peek() below


    public static void main(String[]args) {
        /*
        Stack bracelets = new Stack();
        bracelets.push("silver bangle");
        bracelets.push("gold bangle");
        bracelets.push("bronze bangle");
        System.out.println("I decided I only want to wear the silver bangle!");
        bracelets.pop();
        bracelets.pop();
        */

    }
}
