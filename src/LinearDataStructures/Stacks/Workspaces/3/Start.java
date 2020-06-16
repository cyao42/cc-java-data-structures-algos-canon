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

    // Define push() below


    public static void main(String[]args) {
      /*
        Stack dishStack = new Stack();
        dishStack.push("large plate");
        dishStack.push("small plate");
        dishStack.push("bowl");
       */

    }
}
