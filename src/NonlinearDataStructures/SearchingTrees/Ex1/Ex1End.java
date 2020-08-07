public class BinarySearchTree {

    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value, int depth) {
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(int value) {
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        // Create a new BST:
        BinarySearchTree bt = new BinarySearchTree(15);

        // Print bt's value below:
        System.out.println(bt.value);
    }
}