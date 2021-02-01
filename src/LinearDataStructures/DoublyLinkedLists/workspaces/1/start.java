public class DoublyLinkedList {
    

  public String printList() {
    Node currentNode = this.head;
    String output = "<head> ";
    while (currentNode != null) {
      output += currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output += "<tail>";
    System.out.println(output);
    return output;
  }

  public static void main(String[] args) {

  }

}