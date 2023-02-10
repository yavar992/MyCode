package DSA.binary_search;

public class OrderAgnostic_search {
    public static void main(String[] args) {
        int [] arr = {98,97,95,87,76,67,65,56,54,43,33,32,23};
        int target = 32;
        int a = agnostic(arr,target);
        System.out.println(a);

    }
    static int agnostic(int[]arr , int target){
        int start =0;
        int end = arr.length-1;
        boolean isAcs = arr[start] < arr[end];

        while (start<=end){

            int mid = start + (end-start)/2;

            if (target==arr[mid]){
                return mid;
            }

            if (isAcs){
                if (target<arr[mid]){
                    end = mid-1;
                } else  {
                    start = mid+1;
                }
            }

            else {
                if (target<arr[mid]){
                    start =mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

}
