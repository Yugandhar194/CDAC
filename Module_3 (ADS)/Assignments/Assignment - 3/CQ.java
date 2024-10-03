import java.util.*;
	class CQ {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CQ(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedValue = queue[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedValue;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + (i < size - 1 ? " " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CQ queue = new CQ(4);

        // Test Case 1
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();  
        System.out.println("isFull() = " + queue.isFull());  

        // Test Case 2
        CQ queue2 = new CQ(3);
        queue2.enqueue(5);
        queue2.enqueue(6);
        queue2.dequeue(); 
        queue2.enqueue(7);
        queue2.display();  
        System.out.println("isEmpty() = " + queue2.isEmpty());  
    }
}


//Time Complexity: O(1)
//Space Complexity: O(n)