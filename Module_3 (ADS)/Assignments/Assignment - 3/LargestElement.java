import java.util.*;
	class LE {
    private int[] heap;
    private int size;
    private int k;

    public LE(int k) {
        this.k = k;
        this.size = 0;
        this.heap = new int[k + 1];  // Heap size k
    }

    private void insert(int value) {
        if (size < k) {
            heap[++size] = value;
            bubbleUp(size);
        } else if (value > heap[1]) {
            heap[1] = value;
            bubbleDown(1);
        }
    }

    private void bubbleUp(int pos) {
        while (pos > 1 && heap[pos] < heap[pos / 2]) {
            swap(pos, pos / 2);
            pos = pos / 2;
        }
    }

    private void bubbleDown(int pos) {
        int smallest = pos;
        int left = 2 * pos;
        int right = 2 * pos + 1;

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != pos) {
            swap(pos, smallest);
            bubbleDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int getKthLargest() {
        return heap[1];  // The root of the min-heap
    }

    public static void main(String[] args) {
        int[] stream = {3, 10, 5, 20, 15};
        LE kthLargest = new LE(3);

        for (int num : stream) {
            kthLargest.insert(num);
        }
        System.out.println("The 3rd largest element is: " + kthLargest.getKthLargest());  
    }
}
//Time Complexity: O(n log k)
//Space Complexity: O(k)
