
public class Node {
	
	String data;
	Node next;
	
	public Node(String data) {
		this.data = data;
	}
	
	private void setNextNode(Node nextNode) {
		this.next = nextNode;
	}
	
	public Node getNextNode() {
		return this.next;
	}
	
	public static void main(String[] args) {
		Node strawberryNode = new Node("Berry Tasty");
		Node vanillaNode = new Node("Vanilla");
		Node coconutNode = new Node("Coconuts for Coconut");
		
		vanillaNode.setNextNode(strawberryNode);
		strawberryNode.setNextNode(coconutNode);
		
		Node currentNode = vanillaNode;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.getNextNode();
		}
	}
}
