package DSA.binary_search;

public class return_index {
    public static void main(String[] args) {
        int [] arr = {2,12,13,23,34,35,56,76,87,87,88,92,101};
        int target = 34;
        int c = index(arr,target);
        System.out.println(c);
    }
    static int index(int[]arr , int target){
        int start =0;
        int end = arr.length-1;

        if (start>end){
            System.out.println("result not found");
        }

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = start+1;
            }
            else return mid;
        }

     return -1;
    }


}
