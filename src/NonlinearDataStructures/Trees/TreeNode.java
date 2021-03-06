package NonlinearDataStructures.Trees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;
    public TreeNode parent;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public TreeNode(Object data, TreeNode parent) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
        this.parent = parent;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
        child.parent = this;
    }

    public void addChild(Object childData) {
        TreeNode child = new TreeNode(childData);
        this.children.add(child);
        child.parent = this;
    }

    public void removeChild(TreeNode childToRemove) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(childToRemove)) {
            this.children.remove(childToRemove);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(childToRemove);
            }
        }
    }

    public void removeChild(Object data) {
        if (this.children.isEmpty()) {
            return;
        }
        for (TreeNode child : this.children) {
            if (child.data == data) {
                removeChild(child);
                return;
            }
        }
        for (TreeNode child : this.children) {
            child.removeChild(data);
        }
    }

    public void depthFirstTraversal() {
        System.out.println(this.data);
        for (TreeNode child : this.children) {
            child.depthFirstTraversal();
        }
    }

    public void breadthFirstTraversal() {
        System.out.println("Breadth first search:");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = this;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current.data);
            queue.addAll(current.children);
        }
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.addChild(15);
        System.out.println(tree.children.size());

    }
}
