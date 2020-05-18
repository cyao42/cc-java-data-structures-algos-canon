package LinearDataStructures;

public class LinkedListHashMap {
    public NodeHashMap head;

    public LinkedListHashMap() {
        this.head = null;
    }

    public void addToHead(String key, String value) {
        NodeHashMap newHead = new NodeHashMap(key, value);
        NodeHashMap currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        NodeHashMap tail = this.head;
        if (tail == null) {
            this.head = new NodeHashMap(key, value);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new NodeHashMap(key, value));
        }
    }

    public void removeHead() {
        NodeHashMap removedHead = this.head;
        if (removedHead == null) {
            return;
        }
        this.head = removedHead.getNextNode();
    }

}