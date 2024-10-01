import java.util.*;
public class StackArray 
{
    private int maxSize;
    private int[] stack;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        System.out.print("Stack = [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + (i < top ? " " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);

        // Test Case 1
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.display();  
        System.out.println("Popped element = " + stack.pop()); 
        stack.display(); 

        // Test Case 2
        stack.push(10);
        stack.push(20);
        stack.display();  
        System.out.println("Popped element = " + stack.pop()); 
        stack.push(15);
        stack.display();  //call display method
    }
}
//Time Complexity : O(1)
//Space Complexity: O(n)