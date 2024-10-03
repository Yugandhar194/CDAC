public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedValue;
    }

    public void display() {
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + (i < size - 1 ? " " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);

        // Test Case 1
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.display();  // Output: Queue = [4 5 6 7]
        System.out.println("Dequeued element = " + queue.dequeue());  // Output: Dequeued element = 4
        queue.enqueue(8);
        queue.display();  // Output: Queue = [8 5 6 7]

        // Test Case 2
        CircularQueue queue2 = new CircularQueue(4);
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        queue2.display(); 
        System.out.println("Dequeued element = " + queue2.dequeue());  
        System.out.println("Dequeued element = " + queue2.dequeue());  
        queue2.enqueue(5);
        queue2.display(); 
    }
}
//Time Complexity: O(1)
//Space Complexity: O(n)