class SearchDemo {
    public static void main(String args[]) {

        int a[] = {10, 20, 30, 40, 50};
        int key = 30;

        // Linear Search
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Linear Search: Found at position " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Linear Search: Not found");

        // Binary Search
        int low = 0, high = a.length - 1;
        found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Binary Search: Found at position " + mid);
                found = true;
                break;
            } else if (key > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (!found) System.out.println("Binary Search: Not found");
    }
}
