public class Main {
    public static void main(String[] args) {
	LinkedList myList = new LinkedList();

	myList.addToHead("Node 1");
	myList.addToHead("Node 2");
	myList.addToHead("Node 3");
	myList.addToHead("Node 4");

	// Find Node iteratively:
	Node foundNode = myList.findNodeIteratively("Node 3");		
	
	// Print Node.data to the console:
	System.out.println(foundNode.data);	
    }
}
