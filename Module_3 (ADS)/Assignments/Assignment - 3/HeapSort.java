import java.util.*;
	class HeapSort {
    private int[] heap;
    private int size;

    public HeapSort(int[] array) {
        this.size = array.length;
        this.heap = array;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void sort() {
        for (int i = size - 1; i >= 1; i--) {
            swap(0, i);
            size--;
            heapify(0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 12, 3, 9};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.sort();
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " "); 
        }
    }
}
//Time Complexity : O(n log n)
//Space Complexity: O(n)