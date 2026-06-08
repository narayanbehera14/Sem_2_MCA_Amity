// 3. Write a Java program to find the middle element of a singly linked list in a single pass.
class NodeMid {
    int data;
    NodeMid next;

    NodeMid(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleElementLinkedList {
    NodeMid head;

    void insert(int data) {
        NodeMid newNode = new NodeMid(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeMid temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void findMiddle() {
        NodeMid slow = head;
        NodeMid fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null) {
            System.out.println("Middle element is: " + slow.data);
        }
    }

    public static void main(String[] args) {
        MiddleElementLinkedList list = new MiddleElementLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.findMiddle();
    }
}