public class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
    
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = newNode;
    }

    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) { head = temp.next; return; }
        while (temp != null && temp.data != key) { prev = temp; temp = temp.next; }
        if (temp == null) return;
        prev.next = temp.next;
    }
}
