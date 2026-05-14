import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
    }

    public int pop() {
        int val = stack.pop();
        if (val == minStack.peek()) minStack.pop();
        return val;
    }

    public int getMin() { return minStack.peek(); }
}
