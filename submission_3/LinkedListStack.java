public class LinkedListStack {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    
    private Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack Empty");
        int val = top.data;
        top = top.next;
        return val;
    }
}
