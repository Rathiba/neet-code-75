package algorithm;

public class BinarySearch {
    public static int findNumber(int[] a, int n){
        int low=0; int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==n){
                return mid;
            } else if (a[mid]>n) {
high=mid-1;
            } else if (a[mid]<n) {
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] a={10,20,30,40};
        int n=600;
        int answer=findNumber(a,n);
        System.out.println("the number is: "+answer);
    }
}
