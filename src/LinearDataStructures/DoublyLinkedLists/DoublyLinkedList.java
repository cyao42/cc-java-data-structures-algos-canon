package LinearDataStructures.DoublyLinkedLists;

public class DoublyLinkedList {
    
  public NodeDLL head;
  public NodeDLL tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void addToHead(String data) {
    NodeDLL newHead = new NodeDLL(data);
    NodeDLL currentHead = this.head;

    if (currentHead != null) {
      currentHead.setPreviousNode(newHead);
      newHead.setNextNode(currentHead);
    }
    this.head = newHead;

    if (this.tail == null) {
      this.tail = newHead;
    }
  }

  public void addToTail(String data) {
    NodeDLL newTail = new NodeDLL(data);
    NodeDLL currentTail = this.tail;

    if (currentTail != null) {
      currentTail.setNextNode(newTail);
      newTail.setPreviousNode(currentTail);
    }
    this.tail = newTail;

    if (this.head == null) {
      this.head = newTail;
    }
  }

  public String removeHead() {
    NodeDLL removedHead = this.head;

    if (removedHead == null) {
      return null;
    }
    this.head = removedHead.getNextNode();

    if (this.head != null) {
      this.head.setPreviousNode(null);
    }
    if (removedHead == this.tail) {
      this.removeTail();
    }
    return removedHead.data;
  }

  public String removeTail() {
    NodeDLL removedTail = this.tail;

    if (removedTail == null) {
      return null;
    }
    this.tail = removedTail.getPreviousNode();

    if (this.tail != null) {
      this.tail.setNextNode(null);
    }
    if (removedTail == this.head) {
      this.removeHead();
    }
    return removedTail.data;
  }

  public NodeDLL removeByData(String data) {

    NodeDLL nodeToRemove = null;
    NodeDLL currentNode = this.head;

    while (currentNode != null) {
      if (currentNode.data == data) {
        nodeToRemove = currentNode;
        break;
      }
      currentNode = currentNode.getNextNode();
    }

    if (nodeToRemove == null) {
      return null;
    }
    if (nodeToRemove == this.head) {
      this.removeHead();
    } else if (nodeToRemove == this.tail) {
      this.removeTail();
    } else {
      NodeDLL nextNode = nodeToRemove.getNextNode();
      NodeDLL previousNode = nodeToRemove.getPreviousNode();
      nextNode.setPreviousNode(previousNode);
      previousNode.setNextNode(nextNode);
    }
    return nodeToRemove;
  }

  public String toString() {
    NodeDLL currentNode = this.head;
    String output = "<head> ";
    while (currentNode != null) {
      output += currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output += "<tail>";
    return output;
  }

}