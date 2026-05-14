public class CircularQueue {
    private int[] queue = new int[5];
    private int front = 0, rear = 0, size = 0;

    public void enqueue(int value) {
        if (size == queue.length) return;
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }
}
