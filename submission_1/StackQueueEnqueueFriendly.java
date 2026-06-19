import java.util.Stack;

public class StackQueueEnqueueFriendly {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x); // O(1) enqueue
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) throw new RuntimeException("Queue is empty");
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}

