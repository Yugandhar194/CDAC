class Element {
    int value;
    int priority;

    public Element(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

 class PriorityQueueCustom {
    private Element[] heap;
    private int size;
    private int maxSize;

    public PriorityQueueCustom(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new Element[maxSize + 1];
    }

    private void bubbleUp(int pos) {
        while (pos > 1 && heap[pos].priority > heap[pos / 2].priority) {
            swap(pos, pos / 2);
            pos = pos / 2;
        }
    }

    private void bubbleDown(int pos) {
        int largest = pos;
        int left = 2 * pos;
        int right = 2 * pos + 1;

        if (left <= size && heap[left].priority > heap[largest].priority) {
            largest = left;
        }
        if (right <= size && heap[right].priority > heap[largest].priority) {
            largest = right;
        }

        if (largest != pos) {
            swap(pos, largest);
            bubbleDown(largest);
        }
    }

    private void swap(int i, int j) {
        Element temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void enqueue(int value, int priority) {
        if (size >= maxSize) {
            System.out.println("Priority Queue is full");
            return;
        }
        heap[++size] = new Element(value, priority);
        bubbleUp(size);
    }

    public Element dequeue() {
        if (size == 0) {
            System.out.println("Priority Queue is empty");
            return null;
        }
        Element top = heap[1];
        heap[1] = heap[size--];
        bubbleDown(1);
        return top;
    }

    public void display() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i].value + "(" + heap[i].priority + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueCustom pq = new PriorityQueueCustom(5);

        pq.enqueue(3, 1);
        pq.enqueue(10, 3);
        pq.enqueue(5, 2);
        pq.display();  // Output: 10(3) 3(1) 5(2)
        System.out.println("Dequeued element = " + pq.dequeue().value); 
        pq.display();  
    }
}


//Time Complexity: O(log n)
//Space Complexity: O(n)
