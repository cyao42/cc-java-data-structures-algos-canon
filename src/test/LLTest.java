import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LLTest {
    @Test
    public void newList() {
        // Successfully sets head to null
        LinkedList list = new LinkedList();
        Node expectedNode = null;
        Node actualNode = list.head;
        assertEquals("Head not initialized properly", expectedNode, actualNode);
    }

    @Test
    public void addToHeadEmptyList() {
        // Can successfully add head of an empty list
        LinkedList list = new LinkedList();
        list.addToHead("head");
        assertEquals("Head of empty list not set properly", list.head.data, "head");
    }

    @Test
    public void addToHeadNotEmpty() {
        // Can successfully add to the head of a non-empty list
        LinkedList list = new LinkedList();
        list.addToHead("first");
        list.addToHead("second");
        assertEquals("Head of list not updated", list.head.data, "second");
    }

    @Test
    public void addToTailEmptyList() {
        // Can successfully add to tail of an empty list
        LinkedList list = new LinkedList();
        list.addToTail("head");
        assertEquals("Head of empty list not set properly using `.addToTail()`", list.head.data, "head");
    }

    @Test
    public void addToTailNotEmpty() {
        // Can successfully add to the tail of a non-empty list
        LinkedList list = new LinkedList();
        list.addToTail("first");
        list.addToTail("second");
        assertEquals("Cannot add to tail of the list", list.head.getNextNode().data, "second");
    }

    @Test
    public void removeHeadEmptyList() {
        // Can successfully remove head of a now empty list
        LinkedList list = new LinkedList();
        list.addToHead("head");
        list.removeHead();
        assertEquals("Cannot remove the head", list.head, null);
    }

    @Test
    public void removeHeadNotEmpty() {
        // Can successfully remove to the head of a still non-empty list
        LinkedList list = new LinkedList();
        list.addToHead("first");
        list.addToHead("second");
        list.removeHead();
        assertEquals("Head of list not removed", list.head.data, "first");
    }

    @Test
    public void testToString() {
        // .toString() method correctly prints list
        LinkedList list = new LinkedList();
        list.addToHead("first");
        list.addToHead("second");
        String expected = "<head> second first <tail>";
        String actual = list.toString();
        assertEquals(".toString() method not printing correctly", expected, actual);
    }

}