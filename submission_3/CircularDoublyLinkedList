public class CircularDoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }
    
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node last = head.prev;
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = last;
        last.next = newNode;
    }
}
