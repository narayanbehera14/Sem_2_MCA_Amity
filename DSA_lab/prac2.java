import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30, 20, 30, 40, 50};

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        if (found)
            System.out.println("Element found at index: " + position);
        else
            System.out.println("Element not found in array");

        sc.close();
    }
}
