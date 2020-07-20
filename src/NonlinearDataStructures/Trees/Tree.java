package NonlinearDataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    TreeNode root;

    public Tree (TreeNode root) {
        this.root = root;
    }

    public void breadthFirstTraversal() {
        System.out.println("Breadth first search:");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = this.root;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current.data);
            queue.addAll(current.children);
        }
    }

    public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data + " ");
        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        Tree tree = new Tree(treeRoot);
        tree.print(treeRoot, 0);
        tree.depthFirstTraversal(treeRoot);
    }
}
