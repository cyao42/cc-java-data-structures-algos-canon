package tests;

import AlgorithmConcepts.Recursion.LLTraversal.LinkedListRecursion;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListRecursionTest {

    @Test
    public void findNodeRecursively() {
        LinkedListRecursion test = new LinkedListRecursion();
        test.addToHead("first");
        test.addToTail("second");
        test.addToTail("third");
        test.addToTail("fourth");

        assertEquals(
                "Find node recursively did not find an existing node",
                "third",
                test.findNodeRecursively("third", test.head).data
        );

        assertEquals(
                "Find node recursively did not return null for a nonexisting node",
                null,
                test.findNodeRecursively("sixth", test.head)
        );

        LinkedListRecursion LLNoNodes = new LinkedListRecursion();
        assertEquals(
                "Find node recursively did not return null in an empty LL",
                null,
                test.findNodeRecursively("first", LLNoNodes.head)
        );

        LinkedListRecursion LLOneNode = new LinkedListRecursion();
        LLOneNode.addToHead("first");
        assertEquals(
                "Find node recursively did not return head node in LL with one node",
                "first",
                test.findNodeRecursively("first", LLOneNode.head).data
        );

        assertEquals(
                "Find node recursively did not return null in LL with one node",
                null,
                test.findNodeRecursively("second", LLOneNode.head)
        );
    }
}