package DSA.binary_search;

public class boolean_occurance {
    static int leftoccurance(int[]arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                end = mid - 1; // checking the same element on the left sorted array
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return res;
    }

    static int rightoccurance(int[]arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                start = mid + 1; //if element found keep checking the same element on the side sorted array
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return res;
    }

    static boolean occurance(int[]arr , int left , int right , int target){

        left = leftoccurance(arr,target);
        right = rightoccurance(arr,target);
        // to check the occurance of element in an array
        int occurance = right-left+1;
        if (occurance>1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,};
        int target = 5;
    int left =      leftoccurance(arr,target);
    int right =    rightoccurance(arr,target);
      boolean abcd =   occurance(arr,left,right,target);
        System.out.println(abcd);
    }

}
