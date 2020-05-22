package tests;

import static org.junit.Assert.assertEquals;

import LinearDataStructures.DoublyLinkedLists.NodeDLL;
import org.junit.Test;

public class NodeDLLTest {
    @Test
    public void newNode() {
        // Can successfully make a new linkedlist.Node
        NodeDLL node = new NodeDLL("first");
        String expectedData = "first";
        String actualData = node.data;
        assertEquals("The expected data was not found", expectedData, actualData);
    }

    @Test
    public void setNextNodeValid() {
        // Can successfully set next linkedlist.Node
        // Also successfully gets next node
        NodeDLL node1 = new NodeDLL("first");
        NodeDLL node2 = new NodeDLL("second");
        node1.setNextNode(node2);
        NodeDLL expectedNode = node2;
        NodeDLL actualNode = node1.getNextNode();
        assertEquals("Next node not set properly", expectedNode, actualNode);
    }

    @Test
    public void setPrevNodeValid() {
        // Can successfully set previous linkedlist.Node
        // Also successfully gets previous node
        NodeDLL node1 = new NodeDLL("first");
        NodeDLL node2 = new NodeDLL("second");
        node1.setPreviousNode(node2);
        NodeDLL expectedNode = node2;
        NodeDLL actualNode = node1.getPreviousNode();
        assertEquals("Previous node not set properly", expectedNode, actualNode);
    }

    @Test
    public void nextNodeNull() {
        // Next node defaulted to null
        NodeDLL node1 = new NodeDLL("first");
        NodeDLL actualNode = node1.getNextNode();
        assertEquals("Next node not defaulted to null", null, actualNode);
    }

    @Test
    public void prevNodeNull() {
        // Next node defaulted to null
        NodeDLL node1 = new NodeDLL("first");
        NodeDLL actualNode = node1.getPreviousNode();
        assertEquals("Previous node not defaulted to null", null, actualNode);
    }

}