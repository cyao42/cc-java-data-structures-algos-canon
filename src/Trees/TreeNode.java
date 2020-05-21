package Trees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class TreeNode {

    protected Object data;
    protected ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public Object getValue() {
        return this.data;
    }

    public ArrayList<TreeNode> getChildren() {
        return this.children;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void removeChild(TreeNode child) {
        this.children.remove(child);
    }

    /*
      print(level = 0) {
    let result = '';
    for (let i = 0; i < level; i++) {
      result += '-- ';
    }
    console.log(`${result}${this.data}`);
    this.children.forEach(child => child.print(level + 1));
  }
     */

    public void depthFirstTraversal() {
        System.out.println(this.data);
        for (TreeNode child : this.children) {
            child.depthFirstTraversal();
        }
    }

    public void breadthFirstTraversal() {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = this;
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current.data);
            queue.addAll(current.children);
        }
    }
}
