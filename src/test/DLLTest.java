import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DLLTest {
    @Test
    public void newList() {
        // Successfully sets head to null
        // Also successfully sets tail to null
        DoublyLinkedList list = new DoublyLinkedList();
        NodeDLL actualNodeHead = list.head;
        assertEquals("Head not initialized properly", null, actualNodeHead);
        NodeDLL actualNodeTail = list.tail;
        assertEquals("Tail not initialized properly", null, actualNodeTail);
    }

    @Test
    public void addToHeadEmptyList() {
        // Can successfully add head of an empty list
        // This also sets the tail to the new Node
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("head");
        assertEquals("Head of empty list not set properly", list.head.data, "head");
        assertEquals("Tail of empty list not set properly", list.tail.data, "head");
    }

    @Test
    public void addToHeadNotEmpty() {
        // Can successfully add to the head of a non-empty list
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("head");
        list.addToHead("second");
        assertEquals("Head of list not updated", list.head.data, "second");
    }

    @Test
    public void addToTailEmptyList() {
        // Can successfully add tail of an empty list
        // This also sets the head to the new Node
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToTail("tail");
        assertEquals("Tail of empty list not set properly", list.tail.data, "tail");
        assertEquals("Head of empty list not set properly", list.head.data, "tail");
    }

    @Test
    public void addToTailNotEmpty() {
        // Can successfully add to the tail of a non-empty list
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToTail("head");
        list.addToTail("second");
        assertEquals("Head of list not updated", list.tail.data, "second");
    }

    @Test
    public void removeHeadEmptyList() {
        // Can successfully remove head of a now empty list
        // Also removes tail since list is now empty
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("head");
        list.removeHead();
        assertEquals("Head not removed", list.head, null);
        assertEquals("Tail not removed", list.tail, null);
    }

    @Test
    public void removeHeadNotEmpty() {
        // Can successfully remove the head of a still non-empty list
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("first");
        list.addToHead("second");
        list.removeHead();
        assertEquals("Head of list not removed", list.head.data, "first");
    }

    @Test
    public void removeTailEmptyList() {
        // Can successfully remove tail of a now empty list
        // Also removes head since list is now empty
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("head");
        list.removeTail();
        assertEquals("Tail not removed", list.tail, null);
        assertEquals("Head not removed", list.head, null);
    }

    @Test
    public void removeTailNotEmpty() {
        // Can successfully remove the tail of a still non-empty list
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("first");
        list.addToHead("second");
        list.removeTail();
        assertEquals("Tail of list not removed", list.tail.data, "second");
    }

    @Test
    public void testToString() {
        // .toString() method correctly prints list
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("first");
        list.addToHead("second");
        String expected = "<head> second first <tail>";
        String actual = list.toString();
        assertEquals(".toString() method not printing correctly", expected, actual);
    }

    @Test
    public void removeByDataHead() {
        // Removes the head using .removeByData()
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToTail("first");
        list.addToTail("second");
        list.addToTail("third");
        list.removeByData("first");
        assertEquals("Does not remove head using .removeByData()", list.head.data, "second");
    }




    @Test
    public void removeByDataTail() {
        // Removes the tail using .removeByData()
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToTail("first");
        list.addToTail("second");
        list.addToTail("third");
        list.removeByData("third");
        assertEquals("Does not remove tail using .removeByData()", list.tail.data, "second");
    }

    @Test
    public void removeByDataMiddle() {
        // Removes a node using .removeByData()
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToTail("first");
        list.addToTail("second");
        list.addToTail("third");
        list.removeByData("second");
        assertEquals("Does not remove a node using .removeByData()", list.head.getNextNode().data, "third");
        assertEquals("Does not remove a node using .removeByData()", list.tail.getPreviousNode().data, "first");
    }

}