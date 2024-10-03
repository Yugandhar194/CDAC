import java.util.*;
public class MinHeap {
    public static void main(String[] args) {
        // Test Case 1
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(20);
        minHeap.add(17);
        System.out.println("Extracted Min = " + minHeap.poll());  
        System.out.println("Min-Heap = " + minHeap);  

        // Test Case 2
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>();
        minHeap2.add(30);
        minHeap2.add(40);
        minHeap2.add(20);
        minHeap2.add(50);
        System.out.println("Extracted Min = " + minHeap2.poll());  
        System.out.println("Min-Heap = " + minHeap2);  
    }
}
/* poll() method removes the head of this queue,
which is the smallest element according to the queue's ordering, 
or returns null if this queue is empty */

//Time Complexity: O(log n) for insert and Space complexity: O(n) for heap