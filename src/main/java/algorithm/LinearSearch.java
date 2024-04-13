package algorithm;

public class LinearSearch {
    public static int findNumber(int[] arr,int n) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }
        public static void main (String args[]){
        int[] arr={10,20,30,49};
            int res = findNumber(arr, 10);
            System.out.println("the output is found: "+res);
        }
    }

