// 6. Implement a Java program to find the nth node from the end of a linked list.
class NodeNth {
    int data;
    NodeNth next;

    NodeNth(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromEnd {
    NodeNth head;

    void insert(int data) {
        NodeNth newNode = new NodeNth(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeNth temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void findNthFromEnd(int n) {
        NodeNth first = head;
        NodeNth second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("List is smaller than " + n);
                return;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println(n + "th node from end is: " + second.data);
    }

    public static void main(String[] args) {
        NthNodeFromEnd list = new NthNodeFromEnd();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.findNthFromEnd(2);
    }
}