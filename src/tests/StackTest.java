package tests;

import LinearDataStructures.Stack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void newStack() {
        // Successfully creates a new stack
        // this.size set to 0, this.stack is an empty linkedlist.LinkedList
        Stack st = new Stack();
        Assert.assertEquals("Size not set to 0", 0, st.size);
        Assert.assertEquals("this.stack not initialized to empty linkedlist.LinkedList", null, st.stack.head);
    }

    @Test
    public void isEmptyEmpty() {
        // returns true for empty stack
        Stack st = new Stack();
        Assert.assertEquals("Does not return true for an empty stack", true, st.isEmpty());
    }

    @Test
    public void isEmptyNotEmpty() {
        // Returns false for a non-empty stack
        Stack st = new Stack();
        st.push("first");
        Assert.assertEquals("Does not return false for a non-empty stack", false, st.isEmpty());
    }

    @Test
    public void pushValid() {
        // Adds to and updates head of stack
        // Size incremented
        Stack st = new Stack();
        st.push("first");
        st.push("second");
        Assert.assertEquals("Does not add to head of the stack", "second", st.stack.head.data);
        Assert.assertEquals("Does not increment size", st.size, 2);
    }

    @Test
    public void peekEmpty() {
        // Returns null
        Stack st = new Stack();
        Assert.assertEquals("Does not return null for an empty stack", null, st.peek());
    }

    @Test
    public void peekNotEmpty() {
        // Returns but doesn't remove head of queue
        Stack st = new Stack();
        st.push("first");
        Assert.assertEquals("Does not return data of first item in the stack", "first", st.peek());
        Assert.assertEquals("Removes head of the stack", "first", st.stack.head.data);
    }

    @Test
    public void popNotEmpty() {
        // Removes and returns head
        // Size decremented
        Stack st = new Stack();
        st.push("first");
        st.push("second");
        Assert.assertEquals("Does not return the head of the stack", st.pop(), "second");
        Assert.assertEquals("Does not remove the head of the stack", st.stack.head.data, "first");
        Assert.assertEquals("Does not decrement the size of the stack", st.size, 1);
    }

}