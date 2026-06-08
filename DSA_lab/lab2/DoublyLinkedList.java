public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void delete(int key) {
        Node temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.search(30);
        list.delete(20);
        list.display();
    }
  
}
