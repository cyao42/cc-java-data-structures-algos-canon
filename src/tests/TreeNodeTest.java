package tests;

import NonlinearDataStructures.Trees.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void addChild() {
        TreeNode test = new TreeNode(4);
        TreeNode testChild = new TreeNode(10);
        TreeNode testChild2 = new TreeNode(12);
        test.addChild(testChild);
        test.addChild(testChild2);

        ArrayList<TreeNode> expected = new ArrayList();
        expected.add(testChild);
        expected.add(testChild2);

        assertEquals(
                "TreeNode failed to add children",
                expected,
                test.getChildren()
        );
    }

    @Test
    public void removeChild() {
        TreeNode test = new TreeNode(4);
        TreeNode testChild = new TreeNode(10);
        TreeNode testChild2 = new TreeNode(12);
        test.addChild(testChild);
        test.addChild(testChild2);
        test.removeChild(testChild2);

        ArrayList<TreeNode> expected = new ArrayList();
        expected.add(testChild);

        assertEquals(
                "TreeNode failed to remove children",
                expected,
                test.getChildren()
        );
    }

    @Test
    public void depthFirstTraversal() {
        System.out.println("Depth first search:");
        TreeNode test = new TreeNode(4);
        TreeNode testChild = new TreeNode(10);
        TreeNode testChild2 = new TreeNode(12);
        TreeNode testGrandChild = new TreeNode(11);
        test.addChild(testChild);
        test.addChild(testChild2);
        testChild2.addChild(testGrandChild);
        testChild.addChild(testGrandChild);

        test.depthFirstTraversal();
    }

    @Test
    public void breadthFirstTraversal() {
        TreeNode test = new TreeNode(4);
        TreeNode testChild = new TreeNode(10);
        TreeNode testChild2 = new TreeNode(12);
        TreeNode testGrandChild = new TreeNode(11);
        test.addChild(testChild);
        test.addChild(testChild2);
        testChild2.addChild(testGrandChild);
        testChild.addChild(testGrandChild);

        test.breadthFirstTraversal();
    }
}