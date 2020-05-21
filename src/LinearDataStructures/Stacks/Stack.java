package LinearDataStructures.Stacks;

import LinearDataStructures.SinglyLinkedLists.LinkedList;

public class Stack {

	public LinkedList stack;
	public int size;

	public Stack() {
		this.stack = new LinkedList();
		this.size = 0;
	}

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void push(String data) {
    this.stack.addToHead(data);
    this.size++;
  }

  public String peek() {
    if (this.isEmpty()) {
      return null;
    } else {
      return this.stack.head.data;
    }
  }

  public String pop() {
    if (!this.isEmpty()) {
      String data = this.stack.removeHead();
      this.size--;
      return data;
    } else {
      throw new Error("LinearDataStructures.Stacks.Stack is empty!");
    }
  }

}