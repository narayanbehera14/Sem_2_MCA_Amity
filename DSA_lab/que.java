class CQ {

    int SIZE = 5;
    int[] queue = new int[SIZE];
    int front = -1, rear = -1;

    void enqueue(int value) {

        if ((rear + 1) % SIZE == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % SIZE;
        queue[rear] = value;

        System.out.println("Inserted: " + value);
    }

    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % SIZE;
    }

    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements:");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % SIZE;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CQ q = new CQ();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();
    }
}