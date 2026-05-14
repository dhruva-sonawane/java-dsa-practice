public class StackUsingArray {
    private int[] stack = new int[100];
    private int top = -1;

    public void push(int value) { stack[++top] = value; }
    public int pop() { return stack[top--]; }
    public int peek() { return stack[top]; }
    public boolean isEmpty() { return top == -1; }
}
