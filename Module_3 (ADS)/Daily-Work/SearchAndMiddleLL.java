class SearchAndMiddleLL {

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

    // 5. Search a particular node element and update its value
    public void searchAndUpdate(int oldValue, int newValue) {
        Node current = head;
        while (current != null) {
            if (current.data == oldValue) {
                current.data = newValue;
                System.out.println("Node with value " + oldValue + " updated to " + newValue);
                return;
            }
            current = current.next;
        }
        System.out.println("Node with value " + oldValue + " not found.");
    }

    // 6. Find the middle node
    public void findMiddleNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head, fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow now points to the middle node
        System.out.println("Middle node is: " + slow.data);
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
        SearchAndMiddleLL list = new SearchAndMiddleLL();

        // Insert at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        System.out.println("Initial List:");
        list.printList(); // Output: 50 -> 40 -> 30 -> 20 -> 10 -> null

        // Search and update node value
        list.searchAndUpdate(30, 35);
        System.out.println("After updating 30 to 35:");
        list.printList(); // Output: 50 -> 40 -> 35 -> 20 -> 10 -> null

        // Find the middle node
        list.findMiddleNode(); // Output: Middle node is: 35

        // Delete at the end
        list.deleteAtEnd();
        System.out.println("After deleting the last node:");
        list.printList(); // Output: 50 -> 40 -> 35 -> 20 -> null

        // Insert in-between after the second node (value 40)
        list.insertAfter(list.head.next, 25);
        System.out.println("After inserting 25 after the second node (40):");
        list.printList(); // Output: 50 -> 40 -> 25 -> 35 -> 20 -> null

        // Delete an in-between node (value 40)
        list.deleteNode(40);
        System.out.println("After deleting node with value 40:");
        list.printList(); // Output: 50 -> 25 -> 35 -> 20 -> null

        // Find the middle node again
        list.findMiddleNode(); // Output: Middle node is: 35
    }
}
