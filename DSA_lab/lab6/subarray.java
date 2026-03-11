package DSA_lab.lab6;

public class subarray {
    public static int countSubarraysWithProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0; // Since positive numbers, if k<=1, no subarray has product < k
        
        int n = arr.length;
        int count = 0;
        int product = 1;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            product *= arr[right];
            
            while (product >= k && left <= right) {
                product /= arr[left];
                left++;
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4};
        int k1 = 10;
        System.out.println("Output for arr=[1,2,3,4], k=10: " + countSubarraysWithProductLessThanK(arr1, k1)); // Expected: 7
        
        int[] arr2 = {1, 9, 2, 8, 6, 4, 3};
        int k2 = 100;
        System.out.println("Output for arr=[1,9,2,8,6,4,3], k=100: " + countSubarraysWithProductLessThanK(arr2, k2)); // Expected: 16
        
        int[] arr3 = {10, 5, 2, 6};
        int k3 = 100;
        System.out.println("Output for arr=[10,5,2,6], k=100: " + countSubarraysWithProductLessThanK(arr3, k3)); // Expected: 8
    }
}