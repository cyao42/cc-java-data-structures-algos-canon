package AlgorithmConcepts.Recursion.LLTraversal;

import LinearDataStructures.Nodes.Node;
import LinearDataStructures.SinglyLinkedLists.LinkedList;

public class LinkedListRecursion extends LinkedList {
    public LinkedListRecursion() {
        super();
    }

    public Node findNodeRecursively(String data, Node current) {
        if (current == null) {
            return null;
        }

        if (current.data == data) {
            return current;
        } else {
            return findNodeRecursively(data, current.getNextNode());
        }
    }
}
