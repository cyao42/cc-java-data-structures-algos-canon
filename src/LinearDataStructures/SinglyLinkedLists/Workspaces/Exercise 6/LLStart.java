public class LinkedList {

  private Node head;

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
    String output = "<head> ";
    Node currentNode = this.head;
    while (currentNode != null) {
      output += currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output += "<tail>";
    return output;
  }  

  public static void main(String []args) {

    // Create your code here:  
    LinkedList seasons = new LinkedList();
    System.out.println(seasons.toString());

    seasons.addToHead("summer");
    seasons.addToHead("spring");
    System.out.println(seasons.toString());

    seasons.addToTail("fall");
    seasons.addToTail("winter");
    System.out.println(seasons.toString());

    seasons.removeHead();
    System.out.println(seasons.toString());

  }

}