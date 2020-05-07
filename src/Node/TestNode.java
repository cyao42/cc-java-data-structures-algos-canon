import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestNode {
  @Test
  public void newNode() {
    // Can successfully make a new Node
    Node node = new Node("first");
    String expectedData = "first";
    String actualData = node.data;
    assertEquals("The expected data was not found", expectedData, actualData);
  }

  // @Test
  // public void setNextNodeValid() {
  //   // Can successfully set a next Node with valid input
  // }

  // @Test
  // public void setNextNodeInvalid() {
  //   // Cannot successfully set a next Node with invalid input
  // }

  // @Test
  // public void getNextNodeValid() {
  //   // Can successfully access next Node that exists
  // }

  // @Test
  // public void getNextNodeInvalid() {
  //   // Cannot successfully access a next Node that does not exist
  // }
}