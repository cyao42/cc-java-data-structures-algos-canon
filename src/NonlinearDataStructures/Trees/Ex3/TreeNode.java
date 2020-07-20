import java.util.ArrayList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    // addChild() method with parameter TreeNode child
    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    // addChild() method with parameter Object data
    public void addChild(Object childData) {
        TreeNode child = new TreeNode(childData);
        this.children.add(child);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        // Add child below
        root.addChild(15);
        // Print size of root's chilren list
        System.out.println(root.children.size());
    }
}