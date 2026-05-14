import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public void enqueue(int x) { input.push(x); }

    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) output.push(input.pop());
        }
        return output.pop();
    }
}
