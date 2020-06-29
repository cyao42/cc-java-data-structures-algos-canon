public class Stack {

    public LinkedList stack;
    public int size;

    public Stack() {
      this.stack = new LinkedList();
      this.size = 0;
    }

    public static void main(String[]args) {
        Stack stack = new Stack();
        System.out.println("This stack has " + stack.size + " nodes.");
    }

}
