// 2. Implement a stack using an array with push(), pop(), and peek() functions including overflow and underflow handling.
public class StackArray {
    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--] + " popped");
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}