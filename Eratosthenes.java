public class Eratosthenes {
    public class prime{
        if (n<=1);
    }
    
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty. Cannot remove from an empty list.");
            return -1;
        }

        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(3);
        linkedList.addFirst(7);
        linkedList.addFirst(12);

        linkedList.display();

        int removedElement = linkedList.removeFirst();
        System.out.println("Removed element: " + removedElement);

        linkedList.display();
    }
}

