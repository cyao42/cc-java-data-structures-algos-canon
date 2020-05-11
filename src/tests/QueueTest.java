package tests;

import LinearDataStructures.Queue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
    @Test
    public void newQueue() {
        // Successfully creates a new queue
        // this.size set to 0, this.queue is an empty linkedlist.LinkedList
        Queue q = new Queue();
        Assert.assertEquals("Size not set to 0", 0, q.size);
        assertEquals("this.queue not initialized to empty linkedlist.LinkedList", null, q.queue.head);
    }

    @Test
    public void isEmptyEmpty() {
        // returns true for empty queue
        Queue q = new Queue();
        Assert.assertEquals("Does not return true for an empty queue", true, q.isEmpty());
    }

    @Test
    public void isEmptyNotEmpty() {
        // Returns false for a non-empty queue
        Queue q = new Queue();
        q.enqueue("first");
        Assert.assertEquals("Does not return false for a non-empty queue", false, q.isEmpty());
    }

    @Test
    public void enqueueValid() {
        // Adds to and updates tail of queue
        // Size incremented
        Queue q = new Queue();
        q.enqueue("first");
        q.enqueue("second");
        assertEquals("Does not add to tail of the queue", "second", q.queue.head.getNextNode().data);
        Assert.assertEquals("Does not increment size", q.size, 2);
    }

    @Test
    public void peekEmpty() {
        // Returns null
        Queue q = new Queue();
        Assert.assertEquals("Does not return null for an empty queue", null, q.peek());
    }

    @Test
    public void peekNotEmpty() {
        // Returns but doesn't remove head of queue
        Queue q = new Queue();
        q.enqueue("first");
        Assert.assertEquals("Does not return data of first item in the queue", "first", q.peek());
        assertEquals("Removes head of the queue", "first", q.queue.head.data);
    }

    @Test
    public void dequeueNotEmpty() {
        // Removes and returns head
        // Size decremented
        Queue q = new Queue();
        q.enqueue("first");
        q.enqueue("second");
        Assert.assertEquals("Does not return the head of the queue", q.dequeue(), "first");
        assertEquals("Does not remove the head of the queue", q.queue.head.data, "second");
        Assert.assertEquals("Does not decrement the size of the queue", q.size, 1);
    }

}