import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NodeTest {
    @Test
    public void newNode() {
        // Can successfully make a new Node
        Node node = new Node("first");
        String expectedData = "first";
        String actualData = node.data;
        assertEquals("The expected data was not found", expectedData, actualData);
    }

     @Test
     public void setNextNodeValid() {
         // Can successfully set next Node
         // Also successfully gets next node
         Node node1 = new Node("first");
         Node node2 = new Node("second");
         node1.setNextNode(node2);
         Node expectedNode = node2;
         Node actualNode = node1.getNextNode();
         assertEquals("Next node not set properly", expectedNode, actualNode);
     }

     @Test
     public void nextNodeNull() {
       // Next node defaulted to null
         Node node1 = new Node("first");
         Node actualNode = node1.getNextNode();
         assertEquals("Next node not defaulted to null", null, actualNode);
     }

}