import java.util.ArrayList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(root.data);
    }
}