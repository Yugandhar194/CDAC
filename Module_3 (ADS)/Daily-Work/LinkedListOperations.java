class LinkedListOperations {
    // Node class definition
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Head of the LinkedList
    Node head;

    // 1. Insert at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert after a specific node (in-between insertion)
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // 3. Delete the node at the end of the linked list
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // 4. Delete an in-between node (by key)
    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the head node itself holds the key
        if (head.data == key) {
            head = head.next;
            return;
        }

        // Search for the key to be deleted
        Node current = head, prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is not present in the list
        if (current == null) {
            System.out.println("Key not found in the list");
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();

        // Insert at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        System.out.println("After inserting at the beginning:");
        list.printList(); // Output: 30 -> 20 -> 10 -> null

        // Insert in-between after the second node (value 20)
        list.insertAfter(list.head.next, 25);
        System.out.println("After inserting 25 after the second node (20):");
        list.printList(); // Output: 30 -> 20 -> 25 -> 10 -> null

        // Delete at the end
        list.deleteAtEnd();
        System.out.println("After deleting the last node:");
        list.printList(); // Output: 30 -> 20 -> 25 -> null

        // Delete an in-between node (value 20)
        list.deleteNode(20);
        System.out.println("After deleting node with value 20:");
        list.printList(); // Output: 30 -> 25 -> null
    }
}
