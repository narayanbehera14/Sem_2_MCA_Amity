// 5. Write a Java program to detect and remove a cycle in a linked list using Floyd's cycle detection algorithm.

class NodeCycle {
    int data;
    NodeCycle next;

    NodeCycle(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectRemoveCycle {
    NodeCycle head;

    void insert(int data) {
        NodeCycle newNode = new NodeCycle(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeCycle temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void createCycle() {
        if (head == null || head.next == null) return;
        NodeCycle temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next;
    }

    void detectAndRemoveCycle() {
        NodeCycle slow = head;
        NodeCycle fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            System.out.println("No cycle found");
            return;
        }

        slow = head;
        NodeCycle prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

        System.out.println("Cycle detected and removed");
    }

    void display() {
        NodeCycle temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DetectRemoveCycle list = new DetectRemoveCycle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.createCycle();
        list.detectAndRemoveCycle();

        System.out.print("Linked List after removing cycle: ");
        list.display();
    }
}