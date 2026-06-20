package submission_3;
public class LinkedListFIFOQueue {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    
    private Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { front = rear = newNode; return; }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue Empty");
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
}
