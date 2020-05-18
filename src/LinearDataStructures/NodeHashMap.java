package LinearDataStructures;

public class NodeHashMap {
    public String key;
    public String value;
    private NodeHashMap next;

    public NodeHashMap(String key, String value) {
        this.key  = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNode(NodeHashMap node) {
        this.next = node;
    }

    public NodeHashMap getNextNode() {
        return this.next;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}