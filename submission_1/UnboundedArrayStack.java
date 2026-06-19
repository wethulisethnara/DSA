public class UnboundedArrayStack {
    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2]; // Start with small capacity
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) resize(stack.length * 2); // Double size
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) throw new RuntimeException("Stack is empty");
        int val = stack[top--];
        // Halve size if 1/4 full to save memory
        if (top + 1 > 0 && top + 1 == stack.length / 4) {
            resize(stack.length / 2);
        }
        return val;
    }

    private void resize(int capacity) {
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, top + 1);
        stack = newStack;
    }
}

