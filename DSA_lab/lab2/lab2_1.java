class CircularQueue {
    int[] queue;
    int front = -1, rear = -1, size;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void insert(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    void delete() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + " deleted");
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.display();
        q.delete();
        q.display();
    }
}