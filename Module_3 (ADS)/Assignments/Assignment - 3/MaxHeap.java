import java.util.*;
public class MaxHeap {
    public static void main(String[] args) {
        // Test Case 1
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(12);
        maxHeap.add(7);
        maxHeap.add(15);
        maxHeap.add(5);
        System.out.println("Extracted Max = " + maxHeap.poll());  // Output: Extracted Max = 15
        System.out.println("Max-Heap = " + maxHeap);  // Output: Max-Heap = [12, 7, 5]

        // Test Case 2
        PriorityQueue<Integer> maxHeap2 = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap2.add(8);
        maxHeap2.add(20);
        maxHeap2.add(10);
        maxHeap2.add(3);
        System.out.println("Extracted Max = " + maxHeap2.poll());  // Output: Extracted Max = 20
        System.out.println("Max-Heap = " + maxHeap2);  // Output: Max-Heap = [10, 8, 3]
    }
}
/* poll() method removes the head of this queue,
which is the smallest element according to the queue's ordering, 
or returns null if this queue is empty */

//Time Complexity: O(log n) for insert and Space complexity: O(n) for heap