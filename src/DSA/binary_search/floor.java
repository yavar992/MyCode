package DSA.binary_search;

public class floor {
    static int floor(int []arr , int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start = mid+1;
            }
            else end = mid-1;
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,9,11,14,23,54,55};
        int target = 50;
        int d = floor(arr,target);
        System.out.println("the floor of the " + target + " element is " +d);
    }
}
