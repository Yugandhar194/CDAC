import java.util.Stack;
public class QueueUsingStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void enqueue(int value) {
        stack1.push(value);
    }
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack2.pop();
    }

    public void display() {
        System.out.print("Queue = ");
        if (!stack2.isEmpty()) {
            System.out.println(stack2);
        } else {
            System.out.println(stack1);
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        // Test Case 1
        queue.enqueue(3);
        queue.enqueue(7);
        queue.display();  // Output: Queue = [7, 3]
        System.out.println("Dequeued element = " + queue.dequeue());  
        queue.display();  // Output: Queue = [7]

        // Test Case 2
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued element = " + queue.dequeue()); 
        System.out.println("Dequeued element = " + queue.dequeue());  
        queue.display();  // Output: Queue = [20]
    }
}
