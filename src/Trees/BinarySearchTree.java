package Trees;

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

    public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
    }

    public void breadthFirstTraversal() {
        Queue<BinarySearchTree> queue = new LinkedList<>();
        BinarySearchTree current = this;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current.value);
            if (this.left != null) {
                queue.add(current.left);
            }
            if (this.right != null) {
                queue.add(current.right);
            }
        }
    }
}
