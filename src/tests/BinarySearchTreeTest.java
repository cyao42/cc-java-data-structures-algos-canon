package tests;

import Trees.BinarySearchTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void insert() {
        BinarySearchTree test = new BinarySearchTree(20);
        test.insert(24);
        BinarySearchTree expectedRight = new BinarySearchTree(24, 2);
        assertEquals("Insert node fails to add greater element to right", expectedRight.getValue(), test.getRight().getValue());
        assertEquals("Insert node fails to add greater element to right", null, test.getLeft());
        assertEquals("Insert node fails to add correct depth", expectedRight.getDepth(), test.getRight().getDepth());

        test = new BinarySearchTree(20);
        test.insert(14);
        BinarySearchTree expectedLeft = new BinarySearchTree(14, 2);
        assertEquals("Insert node fails to add smaller element to left", expectedLeft.getValue(), test.getLeft().getValue());
        assertEquals("Insert node fails to add smaller element to left", null, test.getRight());
        assertEquals("Insert node fails to add correct depth", expectedLeft.getDepth(), test.getLeft().getDepth());

        BinarySearchTree moreComplex = new BinarySearchTree(20);
        moreComplex.insert(14);
        moreComplex.insert(15);
        moreComplex.insert(12);
        moreComplex.insert(22);
        moreComplex.insert(25);

        BinarySearchTree expectedNode22 = new BinarySearchTree(22, 2);
        BinarySearchTree expectedNode12 = new BinarySearchTree(12, 3);

        assertEquals(
                "Insert fails to put node in correct position in a taller tree",
                expectedNode22.getValue(),
                moreComplex.getRight().getValue()
        );

        assertEquals(
                "Insert fails to put node in correct position in a taller tree",
                expectedNode12.getValue(),
                moreComplex.getLeft().getLeft().getValue()
        );
    }

    @Test
    public void getNodeByValue() {
        BinarySearchTree testTree = new BinarySearchTree(5);
        testTree.insert(100);
        BinarySearchTree result = testTree.getNodeByValue(100);
        assertNotNull(
                "Get node by value fails to retrieve node",
                result
        );
        assertTrue(result instanceof BinarySearchTree);

        result = testTree.getNodeByValue(25);
        assertNull(
                "Get node by value failed to return null if tree not present",
                result
        );
    }

    @Test
    public void depthFirstTraversal() {
    }

    @Test
    public void breadthFirstTraversal() {
    }
}