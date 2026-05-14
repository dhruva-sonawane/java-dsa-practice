public class QueueUsingArray {
    private int[] queue = new int[100];
    private int front = 0, rear = -1;

    public void enqueue(int value) { queue[++rear] = value; }
    public int dequeue() { return queue[front++]; }
    public boolean isEmpty() { return front > rear; }
}
