public class Main {
    public static void main(String[] args) {
	LinkedList myList = new LinkedList();

	myList.addToHead("Node 1");
	myList.addToHead("Node 2");
	myList.addToHead("Node 3");
	myList.addToHead("Node 4");

	Node foundNode = myList.findNodeRecursively("Node 5", myList.head);		
	System.out.println(foundNode.data);	
    }
}
