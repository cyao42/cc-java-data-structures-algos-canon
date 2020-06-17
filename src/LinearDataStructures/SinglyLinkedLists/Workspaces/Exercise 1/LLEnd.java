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

}