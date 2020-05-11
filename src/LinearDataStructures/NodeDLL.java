package LinearDataStructures;

public class NodeDLL {

    public String data;
    private NodeDLL next;
    private NodeDLL previous;

    public NodeDLL(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(NodeDLL node) {
        this.next = node;
    }

    public void setPreviousNode(NodeDLL node) {
        this.previous = node;
    }

    public NodeDLL getNextNode() {
        return this.next;
    }

    public NodeDLL getPreviousNode() {
        return this.previous;
    }

}