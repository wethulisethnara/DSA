public class ArrayCircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    public void enqueue(int item) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue is empty");
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
}
