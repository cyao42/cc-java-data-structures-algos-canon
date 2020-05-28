// Queues in Java Lesson
// Exercise 1: Welcome to Queues in Java
// Checkpoint 1-start
// NEED TO ADD public TO QUEUE CLASSES
/*
class Queue {
    public LinkedList queue;
    public int size;
    //public double pos_infinity = Double.POSITIVE_INFINITY;
    public Queue() {

    }

    //public static void main(String[] args) {
    //    Queue newQueue = new Queue();
    //    System.out.print("This queue has "+ newQueue.size + " nodes.");
    //}

}


// Exercise 1: Welcome to Queues in Java
// Checkpoint 1-end
class Queue {
    public LinkedList queue;
    public int size;

    //public double pos_infinity = Double.POSITIVE_INFINITY;
    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    //public static void main(String[] args) {
    //    Queue newQueue = new Queue();
    //    System.out.print("This queue has " + newQueue.size + " nodes.");
    //}

}

// Exercise 1: Welcome to Queues in Java
// Checkpoint 2-start
class Queue {
    public LinkedList queue;
    public int size;
    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    //public static void main(String[] args) {
    //    Queue newQueue = new Queue();
    //    System.out.print("This queue has "+ newQueue.size + " nodes.");
    //}

}

// Exercise 1: Welcome to Queues in Java
// Checkpoint 2-end
class Queue {
    public LinkedList queue;
    public int size;
    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public static void main(String[] args) {
        Queue newQueue = new Queue();
        System.out.print("This queue has "+ newQueue.size + " nodes.");
    }

}


// Exercise 2: Queue Size
// Checkpoint 1-start

public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize){

     }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 2: Queue Size
// Checkpoint 1-end (same as start)

public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize){

    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 2: Queue Size
// Checkpoint 2-start

public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize){

    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 2: Queue Size
// Checkpoint 2-end

public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 2: Queue Size
// Checkpoint 3-start

public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
    }

    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}

}

// Exercise 2: Queue Size
// Checkpoint 3-end
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}

}

// Exercise 3: Queue Helper Methods
// Checkpoint 1-start
public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 3: Queue Helper Methods
// Checkpoint 1-end
public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 3: Queue Helper Methods
// Checkpoint 2-start
public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 3: Queue Helper Methods
// Checkpoint 2-end
public class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}*/
/*
// Exercise 3: Queue Helper Methods
// Checkpoint 3-start
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    //public static void main(String[] args) {
    //    Queue queueOne = new Queue(10);
    //    System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
    //    Queue queueTwo = new Queue();
    //    System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    //}
}

// Exercise 3: Queue Helper Methods
// Checkpoint 3-end
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public static void main(String[] args) {
        Queue queueOne = new Queue(10);
        System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");
        Queue queueTwo = new Queue();
        System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");
    }
}



// Exercise 4: Enqueue
// Checkpoint 1-start
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }

}

// Exercise 4: Enqueue
// Checkpoint 1-end
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void enqueue(String data) {

    }
}

// Exercise 4: Enqueue
// Checkpoint 2-start
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void enqueue(String data) {

    }
}

// Exercise 4: Enqueue
// Checkpoint 2-end
class Queue {
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }
    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void enqueue(String data) {
        this.queue.addToTail(data);
    }
}

*/



