public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }
    
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = newNode;
        newNode.prev = last;
    }
}
