package algorithm;

public class InsertionSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int j = i;  // Start j from the current element itself
            while (j > 0 && nums[j - 1] > temp) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;  // Insert temp at the correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        InsertionSort.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


