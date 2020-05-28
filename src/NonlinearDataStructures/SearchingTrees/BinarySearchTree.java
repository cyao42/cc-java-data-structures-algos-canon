package NonlinearDataStructures.SearchingTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    protected int value;
    public BinarySearchTree left;
    public BinarySearchTree right;
    protected int depth;

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

    public int getValue() {
        return this.value;
    }

    public int getDepth() {
        return this.depth;
    }

    public BinarySearchTree getLeft() {
        return this.left;
    }

    public BinarySearchTree getRight() {
        return this.right;
    }

    public boolean contains(int value) {
        return this.getNodeByValue(value) != null;
    }

    /**
     * Insert a node based on the rule that the left child of a parent should always be <= parent's data and right child
     * should always be >= parent's data. Will instantiate nodes with the correct depths as well.
     * @param value
     */
    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new BinarySearchTree(value, this.depth + 1);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(value, this.depth + 1);
            } else {
                this.right.insert(value);
            }
        }
    }

    /**
     * Gets a binary search tree node with the value
     * @param value The value to search for in the tree
     * @return a binary search tree or null
     */
    public BinarySearchTree getNodeByValue(int value) {
        if (this.value == value) {
            return this;
        } else {
            if (value < this.value && this.left != null) {
                return this.left.getNodeByValue(value);
            } else if (value >= this.value && this.right != null) {
                return this.right.getNodeByValue(value);
            } else {
                return null;
            }
        }
    }

    /**
     * Performs inorder DFS traversal: left-root-right
     * The data printed should be sorted
     */
    public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
    }

    /**
     * Performs BFS traversal
     * Will print the current depth/level and the data
     */
    public void breadthFirstTraversal() {
        Queue<BinarySearchTree> queue = new LinkedList<>();
        BinarySearchTree current = this;
        int currentDepth = 0;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.depth > currentDepth) {
                currentDepth = current.depth;
                System.out.println("Current depth: " + currentDepth);
            }
            System.out.println(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
