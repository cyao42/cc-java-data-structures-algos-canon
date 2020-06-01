public class LinkedList {
	
    public Node head;

    public LinkedList() {
		this.head = null;
    }

    public void addToHead(String data) {
		Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
          this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
          this.head = new Node(data);
        } else {
          while (tail.getNextNode() != null) {
            tail = tail.getNextNode();
          }
          tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
          return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String toString() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
          output += currentNode.data + " ";
          currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }

    public Node findNodeIteratively(String data) {
	Node currentNode = this.head;

	while (currentNode != null) {
	    if (currentNode.data == data) {
		return currentNode;
	    }
	      currentNode = currentNode.getNextNode();
	}

	return null;
    }

    public Node findNodeRecursively(String data, Node currentNode) {
        if (currentNode == null) {
            return null;
        } else if (currentNode.data == data){
            return currentNode;
        } 	
	return null;
    }
}
