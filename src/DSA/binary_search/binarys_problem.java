package DSA.binary_search;

public class binarys_problem {
    public static void main(String[] args) {
    int [] arr = {12,23,44,56,78,90,99};
    int target = 55;
   int ans =   ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<end){

            int mid  = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
               else if (target<arr[mid]){
                end = mid-1;
            }
            if (target>arr[mid]){
                start = mid+1;
            }

        }
        return start;
    }
}
