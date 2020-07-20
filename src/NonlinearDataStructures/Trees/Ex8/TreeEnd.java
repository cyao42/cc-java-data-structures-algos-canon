import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public TreeNode root;

    public Tree (TreeNode root) {
        this.root = root;
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

    public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data + " ");
        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
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

    public static void main(String[] args) {
        TreeNode animals = new TreeNode("Animals");
        TreeNode reptile = new TreeNode("Reptile");
        TreeNode mammal = new TreeNode("Mammal");
        animals.addChild(reptile);
        animals.addChild(mammal);
        reptile.addChild("Lizard");
        reptile.addChild("Snake");
        TreeNode equine = new TreeNode("Equine");
        TreeNode bovine = new TreeNode("Bovine");
        TreeNode marsupial = new TreeNode("Marsupial");
        equine.addChild("Horse");
        equine.addChild("Zebra");
        bovine.addChild("Husky");
        marsupial.addChild("Koala");

        Tree animalTree = new Tree(animals);
        tree.print();

        // Add and remove accordingly
        bovine.removeChild("Husky");
        bovine.addChild("Cow");
        marsupial.addChild("Kangaroo");

        System.out.println("Printing DFS Traversal");
        // Call DFS below
        animalTree.depthFirstTraversal(animals);

        System.out.println("Printing BFS Traversal");
        // Call BFS below
        animalTree.breadthFirstTraversal();
    }
}