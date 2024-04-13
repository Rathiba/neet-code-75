package algorithm;

public class BubbleSort {

    public static void bubbleSort(int[] arr) { // Corrected method name
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // Corrected outer loop condition
            for (int j = 0; j < n - i - 1; j++) { // Corrected inner loop condition
                if (arr[j] <arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50,25};
        bubbleSort(arr); // Call the corrected method

        System.out.println("Sorted array:"); // Print a descriptive message
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}