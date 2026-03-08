import java.util.*;

class SelectionSortTime {

    static void selectionSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++)
            arr[i] = r.nextInt(1000);

        long start = System.nanoTime();

        selectionSort(arr);

        long end = System.nanoTime();

        System.out.println("Sorted elements:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nTime taken: " + (end - start) + " nanoseconds");
    }
}