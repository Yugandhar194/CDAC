public class QueueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return dequeuedValue;
    }

    public void display() {
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + (i < size - 1 ? " " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        // Test Case 1
        queue.enqueue(5);
        queue.enqueue(10);
        queue.display();  
        System.out.println("Dequeued element = " + queue.dequeue());  
        queue.display();  

        // Test Case 2
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();  
        System.out.println("Dequeued element = " + queue.dequeue());  
        System.out.println("Dequeued element = " + queue.dequeue());  
        queue.display();  
    }
}
//Time Complexity: O(1) Since its enqueue and dequeue
//Space Complexity: O(n)