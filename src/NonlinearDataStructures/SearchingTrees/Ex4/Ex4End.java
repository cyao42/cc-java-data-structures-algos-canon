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

    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new NonlinearDataStructures.SearchingTrees.BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the %s of %d at depth %d \n", value, "left", this.value, this.depth + 1);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new NonlinearDataStructures.SearchingTrees.BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the %s of %d at depth %d \n", value, "right", this.value, this.depth + 1);
            } else {
                this.right.insert(value);
            }
        }
    }

    public BinarySearchTree getNodeByValue(int value) {
        if (this.value == value) {
            return this;
        } else if (value < this.value && this.left != null) {
            return this.left.getNodeByValue(value);
        } else if (value >= this.value && this.right != null) {
            return this.right.getNodeByValue(value);
        } else {
            return null;
        }
    }

    // Define depthFirstTraversal below
    public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(48);
        tree.insert(24);
        tree.insert(55);
        tree.insert(26);
        tree.insert(38);
        tree.insert(56);
        tree.insert(74);

        // Print depth-first traversal
        tree.depthFirstTraversal();
    }