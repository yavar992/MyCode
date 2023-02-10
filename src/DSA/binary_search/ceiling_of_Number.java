package DSA.binary_search;

public class ceiling_of_Number {

    // smallest no greater than target element
    static int ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            if (start==arr.length){
                return 0;
            }
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start = mid+1;
            }
            else end = mid-1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arrray = {1,2,34,45,56,67,77,89,98,99,100};
        int target = 55;
        int f =    ceiling(arrray,target);
        System.out.println( "the ceiling of the " + target + " element is " + f);

    }
}
